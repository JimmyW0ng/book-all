package com.book.core.business.message.pojo.po;

import com.book.core.domain.enums.MessageCaptchaScene;
import com.book.core.domain.enums.MessageCaptchaType;
import com.framework.spring.boot.jooq.pojo.BaseDomainPo;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 消息-验证码表
 */
@Data
public class MessageCaptchaPo extends BaseDomainPo {

    private Long id;
    private MessageCaptchaType type;
    private Long sourceId;
    private String code;
    private String content;
    private MessageCaptchaScene scene;
    private Long clientId;
    private Timestamp expireTime;
    private String ip;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String remark;
    private Boolean delFlag;
    private Long version;

}
