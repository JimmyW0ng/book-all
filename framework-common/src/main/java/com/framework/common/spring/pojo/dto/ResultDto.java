package com.framework.common.spring.pojo.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.framework.common.constant.CommonMessage;
import com.framework.common.spring.component.JsonComponent;
import com.framework.common.spring.component.SpringComponent;
import com.framework.common.tool.StringTools;
import lombok.ToString;
import org.springframework.context.MessageSource;

import java.io.Serializable;

/**
 * @Description: dto返回结果封装
 * @Author: J.W
 * @Date: 上午11:03 2018/9/10
 */
@ToString
public class ResultDto<T> implements Serializable {

    private boolean isSuccess = true;
    /**
     * 错误码
     */
    private String error;
    /**
     * 错误描述信息
     */
    private String errorDescription;
    /**
     * traceId
     */
    private String traceId;
    /**
     * 返回结果对象
     */
    private T result;

    private ResultDto() {
    }

    public static <T> ResultDto<T> build() {
        return new ResultDto<>();
    }

    public static <T> ResultDto<T> build(String messCodeConstant) {
        ResultDto<T> resultDto = ResultDto.build();
        resultDto.setError(messCodeConstant).setErrorDescription(messageSource(messCodeConstant)).setSuccess(false);
        return resultDto;
    }

    public static <T> ResultDto<T> buildCustom(CommonMessage commonMessage) {
        ResultDto<T> resultDto = ResultDto.build();
        resultDto.setError(commonMessage.getCode()).setErrorDescription(commonMessage.getMsg()).setSuccess(false);
        return resultDto;
    }

    public static <T> ResultDto<T> build(String messCodeConstant, String traceId) {
        ResultDto<T> resultDto = build(messCodeConstant);
        return resultDto.setTraceId(traceId);
    }

    /**
     * 获取messageSource的消息
     *
     * @param code
     * @return
     */
    private static String messageSource(String code) {
        return SpringComponent.getBean(MessageSource.class).getMessage(code, null, code, null);
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public ResultDto<T> setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        if (StringTools.isNotBlank(this.errorDescription)) {
            this.setSuccess(false);
        }
        return this;
    }

    public String getError() {
        return error;
    }

    public T getResult() {
        return result;
    }

    public ResultDto<T> setResult(T result) {
        this.result = result;
        return this;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public ResultDto<T> setSuccess(boolean success) {
        isSuccess = success;
        return this;
    }

    public boolean isError() {
        return !isSuccess;
    }

    public ResultDto<T> setError(String error) {
        this.error = error;
        this.errorDescription = messageSource(error);
        this.isSuccess = false;
        return this;
    }

    public String getTraceId() {
        return traceId;
    }

    public ResultDto<T> setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    public String toJson() throws JsonProcessingException {
        return JsonComponent.encode(this);
    }

}
