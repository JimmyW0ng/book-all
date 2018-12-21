package com.book.api.security;

import com.book.api.constant.ApiMessageCode;
import com.framework.common.spring.pojo.dto.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description: RESTful Spring Security鉴权失败返回封装
 * @Author: J.W
 * @Date: 下午8:29 2018/1/6
 */
@Slf4j
public class ApiSecurityAuthEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        log.debug("会员鉴权失败!", e);
        ResultDto resultDto = ResultDto.build(ApiMessageCode.ERROR_ACCESS_NEED_AUTH);
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.println(resultDto.toJson());
    }
}
