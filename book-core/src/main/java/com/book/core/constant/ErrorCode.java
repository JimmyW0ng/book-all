package com.book.core.constant;

/**
 * @Description API错误码
 * @Author J.W
 * @Date 2018/12/21 10:23
 **/
public class ErrorCode {

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

    /**
     * 验证码
     */
    public static final String ERROR_CAPTCHA_GET_NUM_OUT_LIMIT = "ERROR_CAPTCHA_GET_NUM_OUT_LIMIT";

    /**
     * 会员
     */
    public static final String ERROR_MOBILE_IS_EXIST = "ERROR_MOBILE_IS_EXIST";

}
