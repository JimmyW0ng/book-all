package com.book.api.config;

import com.book.api.filter.ApiSecurityTokenAuthFilter;
import com.book.api.security.ApiSecurityAuthEntryPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @Description: 鉴权设置
 * @Author: J.W
 * @Date: 5:46 PM 2018/12/20
 */
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 默认安全令牌标识
     */
    public static final String SECURITY_BASE_AUTHORITY = "api:security:base";
    /**
     * 默认登录令牌标识
     */
    public static final String LOGIN_BASE_AUTHORITY = "api:login:base";
    /**
     * 默认令牌header标识
     */
    public static final String TOKEN_HEADER_NAME = "Authorization";
    /**
     * 默认令牌body标识
     */
    public static final String TOKEN_BODY_NAME = "token";
    /**
     * 默认令牌前缀
     */
    public static final String TOKEN_PREFIX = "Bearer ";

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
                .authorizeRequests()
                .antMatchers("/s/**").hasAnyAuthority(SECURITY_BASE_AUTHORITY)
                .antMatchers("/a/**").hasAnyAuthority(LOGIN_BASE_AUTHORITY)
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
