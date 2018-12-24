package com.book.api.security;

import com.book.api.config.SecurityConfig;
import com.framework.common.spring.pojo.dto.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.book.core.constant.ErrorCode.ERROR_ACCESS_NEED_AUTH;
import static javax.servlet.http.HttpServletResponse.SC_FORBIDDEN;

/**
 * @Description: RESTful Spring Security权限不足返回封装
 * @Author: J.W
 * @Date: 下午10:46 2018/7/18
 */
@Slf4j
@Component
public class ApiAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request,
                       HttpServletResponse response,
                       AccessDeniedException e
    ) throws IOException {
        log.error("当前请求令牌权限不足!");
        SecurityConfig.exceptionHandle(response, SC_FORBIDDEN, ResultDto.build(ERROR_ACCESS_NEED_AUTH));
    }
}
