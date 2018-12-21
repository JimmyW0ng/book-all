package com.book.core.business.message.repository;

import com.book.core.business.message.pojo.MessageCaptchaPo;
import com.book.core.domain.tables.records.MessageCaptchaRecord;
import com.framework.spring.boot.jooq.repository.AbstractCRUDRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.book.core.domain.Tables.MESSAGE_CAPTCHA;

/**
 * 消息-验证码仓库
 */
@Repository
public class MessageCaptchaRepository extends AbstractCRUDRepository<MessageCaptchaRecord, Long, MessageCaptchaPo> {

    @Autowired
    public MessageCaptchaRepository(DSLContext dslContext) {
        super(dslContext, MESSAGE_CAPTCHA, MESSAGE_CAPTCHA.ID, MessageCaptchaPo.class);
    }

}
