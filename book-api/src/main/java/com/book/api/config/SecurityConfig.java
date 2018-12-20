package com.book.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsUtils;

/**
 * @Description: 鉴权设置
 * @Author: J.W
 * @Date: 5:46 PM 2018/12/20
 */
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    @Autowired
    private ApiSecurityTokenAuthFilter securityTokenAuthFilter;

    @Autowired
    public AuthenticationEntryPoint getAuthenticationEntryPoint() {
        return new ApiSecurityAuthEntryPoint();
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                // 不需要csrf
                .csrf().disable()
                // 基于token，所以不需要session
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                // 除上面外的所有请求全部需要鉴权认证
                .authorizeRequests()
                .requestMatchers(CorsUtils::isPreFlightRequest).permitAll()
                .antMatchers("/security/**").permitAll()
                .anyRequest().authenticated();

        // 403设置
        httpSecurity
                .exceptionHandling()
                .authenticationEntryPoint(getAuthenticationEntryPoint());
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

}
