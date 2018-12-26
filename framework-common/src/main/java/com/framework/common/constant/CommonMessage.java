package com.framework.common.constant;

/**
 * @Description 适用于common包内部的信息常量
 * @Author J·W
 * @Date 2018/12/20 10:09
 **/
public enum CommonMessage {

    /**
     * 系统异常码
     */
    ERROR_SYSTEM("ERROR_SYSTEM", "系统异常"),
    ERROR_SYSTEM_PARAM_FORMAT("ERROR_SYSTEM_PARAM_FORMAT", "请求参数异常"),
    ERROR_API_NOT_FOUND("ERROR_API_NOT_FOUND", "不存在的请求"),
    ERROR_OPERATE_FAIL("ERROR_OPERATE_FAIL", "操作失败，请稍后再试"),

    /**
     * 基础信息异常码
     */
    ERROR_MOBILE_FORMAT("ERROR_MOBILE_FORMAT", "手机号格式不正确"),

    /**
     * oss异常码
     */
    ERROR_OSS_UPLOAD("ERROR_OSS_UPLOAD", "文件上传失败"),
    ERROR_OSS_GENERATE_URL("ERROR_OSS_GENERATE_URL", "生成文件地址失败");

    private final String code;
    private final String msg;

    CommonMessage(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

}
