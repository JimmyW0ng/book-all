package com.book.api.security;

import com.book.core.constant.ErrorCode;
import com.framework.common.spring.pojo.dto.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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
    ) throws IOException, ServletException {
        log.error("当前请求令牌权限不足!");
        ResultDto resultDo = ResultDto.build(ErrorCode.ERROR_ACCESS_DENIED);
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.println(resultDo.toJson());
    }
}
