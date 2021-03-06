/*
 * This file is generated by jOOQ.
*/
package com.book.core.domain.tables.records;


import com.book.core.domain.enums.MessageCaptchaScene;
import com.book.core.domain.enums.MessageCaptchaType;
import com.book.core.domain.tables.MessageCaptcha;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 消息-验证码表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MessageCaptchaRecord extends UpdatableRecordImpl<MessageCaptchaRecord> implements Record14<Long, MessageCaptchaType, Long, String, String, MessageCaptchaScene, Long, Timestamp, String, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = -1070795893;

    /**
     * Setter for <code>book.message_captcha.id</code>. 主键
     */
    public MessageCaptchaRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Create a detached MessageCaptchaRecord
     */
    public MessageCaptchaRecord() {
        super(MessageCaptcha.MESSAGE_CAPTCHA);
    }

    /**
     * Setter for <code>book.message_captcha.type</code>. 类型：短信
     */
    public MessageCaptchaRecord setType(MessageCaptchaType value) {
        set(1, value);
        return this;
    }

    /**
     * Create a detached, initialised MessageCaptchaRecord
     */
    public MessageCaptchaRecord(Long id, MessageCaptchaType type, Long sourceId, String code, String content, MessageCaptchaScene scene, Long clientId, Timestamp expireTime, String ip, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(MessageCaptcha.MESSAGE_CAPTCHA);

        set(0, id);
        set(1, type);
        set(2, sourceId);
        set(3, code);
        set(4, content);
        set(5, scene);
        set(6, clientId);
        set(7, expireTime);
        set(8, ip);
        set(9, createAt);
        set(10, updateAt);
        set(11, remark);
        set(12, delFlag);
        set(13, version);
    }

    /**
     * Setter for <code>book.message_captcha.source_id</code>. 业务标识
     */
    public MessageCaptchaRecord setSourceId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>book.message_captcha.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>book.message_captcha.code</code>. 业务编码
     */
    public MessageCaptchaRecord setCode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>book.message_captcha.type</code>. 类型：短信
     */
    public MessageCaptchaType getType() {
        return (MessageCaptchaType) get(1);
    }

    /**
     * Setter for <code>book.message_captcha.content</code>. 验证码内容
     */
    public MessageCaptchaRecord setContent(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>book.message_captcha.content</code>. 验证码内容
     */
    public String getContent() {
        return (String) get(4);
    }

    /**
     * Setter for <code>book.message_captcha.scene</code>. 验证场景：会员注册；会员登录；
     */
    public MessageCaptchaRecord setScene(MessageCaptchaScene value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>book.message_captcha.scene</code>. 验证场景：会员注册；会员登录；
     */
    public MessageCaptchaScene getScene() {
        return (MessageCaptchaScene) get(5);
    }

    /**
     * Getter for <code>book.message_captcha.source_id</code>. 业务标识
     */
    public Long getSourceId() {
        return (Long) get(2);
    }

    /**
     * Getter for <code>book.message_captcha.client_id</code>. 客户端标识
     */
    public Long getClientId() {
        return (Long) get(6);
    }

    /**
     * Getter for <code>book.message_captcha.code</code>. 业务编码
     */
    public String getCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>book.message_captcha.client_id</code>. 客户端标识
     */
    public MessageCaptchaRecord setClientId(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Setter for <code>book.message_captcha.ip</code>. 访问ip
     */
    public MessageCaptchaRecord setIp(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>book.message_captcha.expire_time</code>. 过期时间
     */
    public Timestamp getExpireTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>book.message_captcha.create_at</code>. 创建时间
     */
    public MessageCaptchaRecord setCreateAt(Timestamp value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>book.message_captcha.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>book.message_captcha.update_at</code>. 更新时间
     */
    public MessageCaptchaRecord setUpdateAt(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Setter for <code>book.message_captcha.expire_time</code>. 过期时间
     */
    public MessageCaptchaRecord setExpireTime(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Setter for <code>book.message_captcha.remark</code>. 备注
     */
    public MessageCaptchaRecord setRemark(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>book.message_captcha.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(11);
    }

    /**
     * Getter for <code>book.message_captcha.ip</code>. 访问ip
     */
    public String getIp() {
        return (String) get(8);
    }

    /**
     * Getter for <code>book.message_captcha.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(12);
    }

    /**
     * Getter for <code>book.message_captcha.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>book.message_captcha.del_flag</code>. 删除标记
     */
    public MessageCaptchaRecord setDelFlag(Boolean value) {
        set(12, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Long, MessageCaptchaType, Long, String, String, MessageCaptchaScene, Long, Timestamp, String, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Long, MessageCaptchaType, Long, String, String, MessageCaptchaScene, Long, Timestamp, String, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MessageCaptcha.MESSAGE_CAPTCHA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<MessageCaptchaType> field2() {
        return MessageCaptcha.MESSAGE_CAPTCHA.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return MessageCaptcha.MESSAGE_CAPTCHA.SOURCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MessageCaptcha.MESSAGE_CAPTCHA.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MessageCaptcha.MESSAGE_CAPTCHA.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<MessageCaptchaScene> field6() {
        return MessageCaptcha.MESSAGE_CAPTCHA.SCENE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return MessageCaptcha.MESSAGE_CAPTCHA.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return MessageCaptcha.MESSAGE_CAPTCHA.EXPIRE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return MessageCaptcha.MESSAGE_CAPTCHA.IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return MessageCaptcha.MESSAGE_CAPTCHA.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return MessageCaptcha.MESSAGE_CAPTCHA.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return MessageCaptcha.MESSAGE_CAPTCHA.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return MessageCaptcha.MESSAGE_CAPTCHA.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return MessageCaptcha.MESSAGE_CAPTCHA.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaType component2() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getSourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaScene component6() {
        return getScene();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getExpireTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component13() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component14() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaType value2() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getSourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaScene value6() {
        return getScene();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getExpireTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaRecord value2(MessageCaptchaType value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaRecord value3(Long value) {
        setSourceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaRecord value4(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaRecord value5(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaRecord value6(MessageCaptchaScene value) {
        setScene(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaRecord value7(Long value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaRecord value8(Timestamp value) {
        setExpireTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaRecord value9(String value) {
        setIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaRecord value10(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaRecord value11(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaRecord value12(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaRecord value13(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaRecord value14(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageCaptchaRecord values(Long value1, MessageCaptchaType value2, Long value3, String value4, String value5, MessageCaptchaScene value6, Long value7, Timestamp value8, String value9, Timestamp value10, Timestamp value11, String value12, Boolean value13, Long value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>book.message_captcha.version</code>. 版本号
     */
    public Long getVersion() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>book.message_captcha.version</code>. 版本号
     */
    public MessageCaptchaRecord setVersion(Long value) {
        set(13, value);
        return this;
    }
}
