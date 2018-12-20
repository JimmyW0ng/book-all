package com.book.api.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

/**
 * @Description: api鉴权过滤器(spring security)
 * @Author: J.W
 * @Date: 5:51 PM 2018/12/20
 */
@Slf4j
@Component
public class ApiSecurityTokenAuthFilter extends OncePerRequestFilter {

    @Value("${token.header.name}")
    private String tokenHeaderName;

    @Value("${token.header.prefix}")
    private String tokenHeaderPrefix;

    @Value("${cors.origin}")
    private String corsOrigin;

    @Autowired
    private ApiSecurityAuthComponent securityAuthComponent;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
        String host = request.getHeader("Origin");
        log.info("鉴权开始, host={}", host);
        // 跨域设置响应头
        if (SpringComponent.isProduct()) {
            response.setHeader("Access-Control-Allow-Origin", corsOrigin);
        } else if (StringTools.isNotBlank(host)) {
            response.setHeader("Access-Control-Allow-Origin", host);
        }
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Authorization,Version,Accept,Content-Type, x-requested-with, X-Custom-Header,Cache-Control");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        log.info("api请求地址: [{}]{}", request.getMethod(), request.getRequestURI());
        String token;
        String authHeader = request.getHeader(this.tokenHeaderName);
        // head有token
        if (StringTools.isNotBlank(authHeader)) {
            if (!authHeader.startsWith(tokenHeaderPrefix)) {
                log.error("鉴权token格式错误，token={}", authHeader);
                chain.doFilter(request, response);
                return;
            }
            token = authHeader.substring(tokenHeaderPrefix.length() + 1);
        } else {
            token = request.getParameter(this.tokenHeaderName);
        }
        if (StringTools.isBlank(token)) {
            log.error("鉴权token缺失，token={}", token);
            chain.doFilter(request, response);
            return;
        }
        // 解析token
        ResultDo<AuthTokenPo> checkToken = securityAuthComponent.getTokenInfo(token, IpTools.getIpAddr(request));
        if (checkToken.isError()) {
            log.error("验证token不通过, error={}, desc={}", checkToken.getError(), checkToken.getErrorDescription());
            chain.doFilter(request, response);
            return;
        }
        AuthTokenPo tokenPo = checkToken.getResult();
        // 加载当前用户信息
        ResultDo checkUser = securityAuthComponent.loadCurrentAccountUserInfo(tokenPo);
        if (checkUser.isError()) {
            log.error("加载当前用户信息不通过, error={}, desc={}", checkToken.getError(), checkToken.getErrorDescription());
            chain.doFilter(request, response);
            return;
        }
        // 加载当前用户权限
        ApiPrincipalBo principalBo = new ApiPrincipalBo();
        principalBo.setLoginName(tokenPo.getLoginName());
        Collection<GrantedAuthority> authorities = securityAuthComponent.getPermissionByLoginName(tokenPo.getLoginName());
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(principalBo, null, authorities);
        authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        chain.doFilter(request, response);
        log.info("鉴权完毕, username={}", authHeader);
    }

}
