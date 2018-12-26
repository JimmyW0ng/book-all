package com.book.api.advice;

import com.framework.common.spring.pojo.dto.ResultDto;
import com.framework.common.tool.IpTools;
import com.framework.common.tool.WebTools;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

import static com.framework.common.constant.CommonMessage.*;

/**
 * @Description: api控制类异常封装
 * @Author: J.W
 * @Date: 下午8:26 2018/1/6
 */
@RestControllerAdvice
@Slf4j
public class ControllerExceptionHandler {

    /**
     * @Description 通用异常捕获
     * @Author J.W
     * @Date 2018/12/22 12:14 PM
     * @Param [ex]
     * @Return com.framework.common.spring.pojo.dto.ResultDto
     **/
    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResultDto handleException(Exception ex) {
        this.logRequest(ex);
        return ResultDto.build(ERROR_SYSTEM);
    }

    /**
     * @Description 请求接口参数异常
     * @Author J.W
     * @Date 2018/12/22 12:35 PM
     * @Param [ex]
     * @Return com.framework.common.spring.pojo.dto.ResultDto
     **/
    @ExceptionHandler({MissingServletRequestParameterException.class,
            MethodArgumentTypeMismatchException.class,
            HttpMessageNotReadableException.class})
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ResultDto handleParamException(Exception ex) {
        this.logRequest(ex);
        return ResultDto.build(ERROR_SYSTEM_PARAM_FORMAT);
    }

    /**
     * @Description 404
     * @Author J.W
     * @Date 2018/12/22 12:35 PM
     * @Param [ex]
     * @Return com.framework.common.spring.pojo.dto.ResultDto
     **/
    @ExceptionHandler({NoHandlerFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResultDto handleNoHandlerFoundException(Exception ex) {
        this.logRequest(ex);
        return ResultDto.build(ERROR_API_NOT_FOUND);
    }

    /**
     * @Description 无权访问异常捕获 tips: 包括没有security权限和404请求
     * @Author J.W
     * @Date 2018/12/22 12:35 PM
     * @Param [ex]
     * @Return void
     **/
    private void logRequest(Exception ex) {
        HttpServletRequest request = null;
        try {
            request = WebTools.getCurrentRequest();
        } catch (Exception e) {
            log.error("ExceptionHandler获取当前request失败!", e);
        }
        if (request == null) {
            log.error("api接口访问异常!", ex);
        } else {
            log.error("api接口访问异常! url={}, ip={}", request.getRequestURI(), IpTools.getIpAddr(request), ex);
        }
    }

}
