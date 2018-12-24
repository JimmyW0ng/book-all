package com.book.api.config;

import com.book.api.filter.ApiSecurityTokenAuthFilter;
import com.book.api.security.ApiAccessDeniedHandler;
import com.book.api.security.ApiSecurityAuthEntryPoint;
import com.framework.common.spring.pojo.dto.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description: 鉴权设置
 * @Author: J.W
 * @Date: 5:46 PM 2018/12/20
 */
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 默认基础令牌标识
     */
    public static final String BASE_BASIC_AUTHORITY = "api:base:basic";
    /**
     * 默认登录令牌标识
     */
    public static final String BASE_BEARER_AUTHORITY = "api:base:bearer";
    /**
     * 默认令牌header标识
     */
    public static final String TOKEN_HEADER_NAME = "Authorization";
    /**
     * 默认令牌body标识
     */
    public static final String TOKEN_BODY_NAME = "token";
    /**
     * 默认基础令牌前缀
     */
    public static final String TOKEN_BASIC_PREFIX = "Basic ";
    /**
     * 默认登录令牌前缀
     */
    public static final String TOKEN_BEARER_PREFIX = "Bearer ";

    @Autowired
    private ApiSecurityTokenAuthFilter securityTokenAuthFilter;

    @Autowired
    public AuthenticationEntryPoint getAuthenticationEntryPoint() {
        return new ApiSecurityAuthEntryPoint();
    }

    @Autowired
    public AccessDeniedHandler getAccessDeniedHandler() {
        return new ApiAccessDeniedHandler();
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                // 不需要csrf
                .csrf().disable()
                // 基于token，所以不需要session
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .authorizeRequests()
                .antMatchers("/s/**").hasAnyAuthority(BASE_BASIC_AUTHORITY)
                .antMatchers("/a/**").hasAnyAuthority(BASE_BEARER_AUTHORITY)
                .anyRequest().authenticated();

        // 403设置
        httpSecurity
                .exceptionHandling()
                .authenticationEntryPoint(getAuthenticationEntryPoint())
                .accessDeniedHandler(getAccessDeniedHandler());
        // 添加鉴权filter
        httpSecurity.addFilterBefore(securityTokenAuthFilter, UsernamePasswordAuthenticationFilter.class);
        // 禁用缓存
        httpSecurity.headers().cacheControl();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/v2/api-docs",
                "/swagger-resources",
                "/swagger-resources/**",
                "/swagger-ui.html",
                "/webjars/**",
                "/images/**",
                "/favicon.ico");
    }

    /**
     * @Description 鉴权异常响应封装
     * @Author J.W
     * @Date 2018/12/24 10:18
     * @Param [resp, httpCode, body]
     * @Return void
     **/
    public static void exceptionHandle(HttpServletResponse resp, int httpCode, ResultDto body) throws IOException {
        resp.setStatus(httpCode);
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json; charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.println(body.toJson());
    }

}
