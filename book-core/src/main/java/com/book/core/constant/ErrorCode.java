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
    public static final String ERROR_CAPTCHA_NOT_EXIST = "ERROR_CAPTCHA_NOT_EXIST";
    public static final String ERROR_CAPTCHA_EXPIRE = "ERROR_CAPTCHA_EXPIRE";
    public static final String ERROR_CAPTCHA_INCORRECT = "ERROR_CAPTCHA_INCORRECT";

    /**
     * 注册
     */
    public static final String ERROR_REGISTER_MOBILE_IS_EXIST = "ERROR_REGISTER_MOBILE_IS_EXIST";
    public static final String ERROR_REGISTER_INVITER_IS_NOT_EXIST = "ERROR_REGISTER_INVITER_IS_NOT_EXIST";
    public static final String ERROR_REGISTER_INVITER_IS_INVALID = "ERROR_REGISTER_INVITER_IS_INVALID";
    public static final String ERROR_REGISTER_INVITER_IS_FREEZE = "ERROR_REGISTER_INVITER_IS_FREEZE";

    /**
     * 会员
     */
    public static final String ERROR_MEMBER_IS_NOT_EXIST = "ERROR_MEMBER_IS_NOT_EXIST";
    public static final String ERROR_MEMBER_IS_FREEZE = "ERROR_MEMBER_IS_FREEZE";

}
