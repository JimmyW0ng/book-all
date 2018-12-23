package com.book.api.filter;

import com.book.api.security.ApiSecurityAuthComponent;
import com.framework.common.spring.pojo.dto.ResultDto;
import com.framework.common.tool.IpTools;
import com.framework.common.tool.StringTools;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

import static com.book.api.config.SecurityConfig.TOKEN_BODY_NAME;
import static com.book.api.config.SecurityConfig.TOKEN_HEADER_NAME;

/**
 * @Description: api鉴权过滤器(spring security)
 * @Author: J.W
 * @Date: 5:51 PM 2018/12/20
 */
@Slf4j
@Component
public class ApiSecurityTokenAuthFilter extends OncePerRequestFilter {

    @Autowired
    private ApiSecurityAuthComponent securityAuthComponent;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
        String ip = IpTools.getIpAddr(request);
        log.info("开始鉴权...ip[{}][{}][{}]", ip, request.getMethod(), request.getRequestURI());
        String token;
        String authHeader = request.getHeader(TOKEN_HEADER_NAME);
        // head有token
        if (StringTools.isNotBlank(authHeader)) {
            token = authHeader;
        } else {
            token = request.getParameter(TOKEN_BODY_NAME);
        }
        if (StringTools.isBlank(token)) {
            log.error("鉴权失败, 未找到令牌, token={}", token);
            chain.doFilter(request, response);
            return;
        }
        // 解析token
        ResultDto<Collection<GrantedAuthority>> checkToken = securityAuthComponent.getTokenInfo(token);
        if (checkToken.isError()) {
            chain.doFilter(request, response);
            return;
        }
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(null, null, checkToken.getResult());
        authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        chain.doFilter(request, response);
        log.info("鉴权完毕, token={}", token);
    }

}
