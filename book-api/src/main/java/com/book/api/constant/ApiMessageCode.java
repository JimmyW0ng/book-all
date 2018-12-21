package com.book.api.constant;

/**
 * @Description API错误码
 * @Author J.W
 * @Date 2018/12/21 10:23
 **/
public class ApiMessageCode {

    /**
     * 加密解密
     */
    public static final String ERROR_ENCODE = "ERROR_ENCODE";
    public static final String ERROR_DECODE = "ERROR_DECODE";
    /**
     * 鉴权
     */
    public static final String ERROR_ACCESS_NEED_AUTH = "ERROR_ACCESS_NEED_AUTH";
    public static final String ERROR_ACCESS_DENIED = "ERROR_ACCESS_DENIED";
    public static final String ERROR_ACCESS_PRINCIPAL_CHECK = "ERROR_ACCESS_PRINCIPAL_CHECK";
    public static final String ERROR_ACCESS_TOKEN_NOT_EXIST = "ERROR_ACCESS_TOKEN_NOT_EXIST";

}
