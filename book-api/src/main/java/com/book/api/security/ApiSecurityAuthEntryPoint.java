package com.book.api.security;

import com.book.api.config.SecurityConfig;
import com.framework.common.spring.pojo.dto.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.book.core.constant.ErrorCode.ERROR_ACCESS_NEED_AUTH;
import static javax.servlet.http.HttpServletResponse.SC_FORBIDDEN;

/**
 * @Description: RESTful Spring Security鉴权失败返回封装
 * @Author: J.W
 * @Date: 下午8:29 2018/1/6
 */
@Slf4j
public class ApiSecurityAuthEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        log.error("当前请求需要令牌才能访问!");
        SecurityConfig.exceptionHandle(response, SC_FORBIDDEN, ResultDto.build(ERROR_ACCESS_NEED_AUTH));
    }
}
