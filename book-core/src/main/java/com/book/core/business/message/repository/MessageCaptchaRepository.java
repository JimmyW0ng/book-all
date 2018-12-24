package com.book.core.business.message.repository;

import com.book.core.business.message.pojo.po.MessageCaptchaPo;
import com.book.core.domain.enums.MessageCaptchaScene;
import com.book.core.domain.enums.MessageCaptchaType;
import com.book.core.domain.tables.records.MessageCaptchaRecord;
import com.framework.spring.boot.jooq.repository.AbstractCRUDRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Optional;

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

    /**
     * @Description 统计同一个业务id当天请求短信验证码次数
     * @Author J.W
     * @Date 2018/12/21 17:56
     * @Param [sourceId, scene, startTime, endTime]
     * @Return int
     **/
    public int countBySourceId(Long sourceId, MessageCaptchaScene scene, Timestamp startTime, Timestamp endTime) {
        return dslContext.select(MESSAGE_CAPTCHA.ID.count()).from(MESSAGE_CAPTCHA)
                .where(MESSAGE_CAPTCHA.SOURCE_ID.eq(sourceId))
                .and(MESSAGE_CAPTCHA.SCENE.eq(scene))
                .and(MESSAGE_CAPTCHA.CREATE_AT.between(startTime, endTime))
                .and(MESSAGE_CAPTCHA.DEL_FLAG.eq(false))
                .fetchOneInto(Integer.class);
    }

    /**
     * @Description 统计一个IP当天请求短信验证码次数
     * @Author J.W
     * @Date 2018/12/21 17:57
     * @Param [ip, startTime, endTime]
     * @Return int
     **/
    public int countByIP(String ip, Timestamp startTime, Timestamp endTime) {
        return dslContext.select(MESSAGE_CAPTCHA.ID.count()).from(MESSAGE_CAPTCHA)
                .where(MESSAGE_CAPTCHA.IP.eq(ip))
                .and(MESSAGE_CAPTCHA.CREATE_AT.between(startTime, endTime))
                .and(MESSAGE_CAPTCHA.DEL_FLAG.eq(false))
                .fetchOneInto(Integer.class);
    }

    /**
     * @Description 根据业务id等查询条件获取验证码信息
     * @Author J.W
     * @Date 2018/12/24 14:24
     * @Param [sourceId, clientId, captchaCode, captchaType, captchaScene]
     * @Return java.util.Optional<com.book.core.business.message.pojo.po.MessageCaptchaPo>
     **/
    public Optional<MessageCaptchaPo> existBySourceId(Long sourceId,
                                                      Long clientId,
                                                      String captchaCode,
                                                      MessageCaptchaType captchaType,
                                                      MessageCaptchaScene captchaScene) {
        return dslContext.selectFrom(MESSAGE_CAPTCHA)
                .where(MESSAGE_CAPTCHA.SOURCE_ID.eq(sourceId))
                .and(MESSAGE_CAPTCHA.TYPE.eq(captchaType))
                .and(MESSAGE_CAPTCHA.SCENE.eq(captchaScene))
                .and(MESSAGE_CAPTCHA.CLIENT_ID.eq(clientId))
                .and(MESSAGE_CAPTCHA.CODE.eq(captchaCode))
                .and(MESSAGE_CAPTCHA.DEL_FLAG.eq(false))
                .fetchOptionalInto(MessageCaptchaPo.class);
    }

    /**
     * @Description 按类型和场景删除业务id对应的验证码
     * @Author J.W
     * @Date 2018/12/24 14:29
     * @Param [sourceId, captchaType, captchaScene]
     * @Return int
     **/
    public int delBySourceIdAndTypeAndSence(Long sourceId,
                                            MessageCaptchaType captchaType,
                                            MessageCaptchaScene captchaScene) {
        return dslContext.update(MESSAGE_CAPTCHA)
                .set(MESSAGE_CAPTCHA.DEL_FLAG, true)
                .where(MESSAGE_CAPTCHA.DEL_FLAG.eq(false))
                .and(MESSAGE_CAPTCHA.SOURCE_ID.eq(sourceId))
                .and(MESSAGE_CAPTCHA.TYPE.eq(captchaType))
                .and(MESSAGE_CAPTCHA.SCENE.eq(captchaScene))
                .execute();
    }
}
