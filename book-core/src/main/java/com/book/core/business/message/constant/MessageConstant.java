package com.book.core.business.message.constant;

/**
 * @Description 消息常量
 * @Author J.W
 * @Date 2018/12/21 17:46
 **/
public class MessageConstant {

    /**
     * 短信验证码长度
     */
    public static final int CAPTCHA_SHORT_MSG_LENGTH = 4;
    /**
     * 短信有效时间
     */
    public static final Integer CAPTCHA_SHORT_MSG_EXPIRE_MINUTE = 5;
    /**
     * 测试环境统一验证码
     */
    public static final String CAPTCHA_IN_TEST = "0000";
    /**
     * 一个手机号同一个场景可发送短信数量
     */
    public static final long CAPTCHA_SCENE_SOURCE_NUM_LIMIT = 10L;
    /**
     * 一个IP同一个场景可发送短信数量
     */
    public static final long CAPTCHA_SCENE_IP_NUM_LIMIT = 100L;

}
