/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.tables.records;


import com.book.core.domain.enums.MemberCapitalRechargeLogStatus;
import com.book.core.domain.enums.MemberCapitalRechargeLogType;
import com.book.core.domain.tables.MemberCapitalRechargeLog;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * 会员资金充值记录
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MemberCapitalRechargeLogRecord extends UpdatableRecordImpl<MemberCapitalRechargeLogRecord> implements Record13<Long, Long, String, BigDecimal, MemberCapitalRechargeLogStatus, MemberCapitalRechargeLogType, Long, Timestamp, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = -2047684136;

    /**
     * Create a detached MemberCapitalRechargeLogRecord
     */
    public MemberCapitalRechargeLogRecord() {
        super(MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG);
    }

    /**
     * Create a detached, initialised MemberCapitalRechargeLogRecord
     */
    public MemberCapitalRechargeLogRecord(Long id, Long memberId, String requestNo, BigDecimal amount, MemberCapitalRechargeLogStatus status, MemberCapitalRechargeLogType type, Long sourceId, Timestamp finishTime, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG);

        set(0, id);
        set(1, memberId);
        set(2, requestNo);
        set(3, amount);
        set(4, status);
        set(5, type);
        set(6, sourceId);
        set(7, finishTime);
        set(8, createAt);
        set(9, updateAt);
        set(10, remark);
        set(11, delFlag);
        set(12, version);
    }

    /**
     * Getter for <code>book.member_capital_recharge_log.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>book.member_capital_recharge_log.id</code>. 主键
     */
    public MemberCapitalRechargeLogRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>book.member_capital_recharge_log.member_id</code>. 会员id
     */
    public Long getMemberId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>book.member_capital_recharge_log.member_id</code>. 会员id
     */
    public MemberCapitalRechargeLogRecord setMemberId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>book.member_capital_recharge_log.request_no</code>. 业务请求号
     */
    public String getRequestNo() {
        return (String) get(2);
    }

    /**
     * Setter for <code>book.member_capital_recharge_log.request_no</code>. 业务请求号
     */
    public MemberCapitalRechargeLogRecord setRequestNo(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>book.member_capital_recharge_log.amount</code>. 充值金额
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>book.member_capital_recharge_log.amount</code>. 充值金额
     */
    public MemberCapitalRechargeLogRecord setAmount(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>book.member_capital_recharge_log.status</code>. 状态：待处理；处理中；成功；失败；
     */
    public MemberCapitalRechargeLogStatus getStatus() {
        return (MemberCapitalRechargeLogStatus) get(4);
    }

    /**
     * Setter for <code>book.member_capital_recharge_log.status</code>. 状态：待处理；处理中；成功；失败；
     */
    public MemberCapitalRechargeLogRecord setStatus(MemberCapitalRechargeLogStatus value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>book.member_capital_recharge_log.type</code>. 类型：时间段付费充值；
     */
    public MemberCapitalRechargeLogType getType() {
        return (MemberCapitalRechargeLogType) get(5);
    }

    /**
     * Setter for <code>book.member_capital_recharge_log.type</code>. 类型：时间段付费充值；
     */
    public MemberCapitalRechargeLogRecord setType(MemberCapitalRechargeLogType value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>book.member_capital_recharge_log.source_id</code>. 业务id
     */
    public Long getSourceId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>book.member_capital_recharge_log.source_id</code>. 业务id
     */
    public MemberCapitalRechargeLogRecord setSourceId(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>book.member_capital_recharge_log.finish_time</code>. 完成时间
     */
    public Timestamp getFinishTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>book.member_capital_recharge_log.finish_time</code>. 完成时间
     */
    public MemberCapitalRechargeLogRecord setFinishTime(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>book.member_capital_recharge_log.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>book.member_capital_recharge_log.create_at</code>. 创建时间
     */
    public MemberCapitalRechargeLogRecord setCreateAt(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>book.member_capital_recharge_log.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>book.member_capital_recharge_log.update_at</code>. 更新时间
     */
    public MemberCapitalRechargeLogRecord setUpdateAt(Timestamp value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>book.member_capital_recharge_log.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(10);
    }

    /**
     * Setter for <code>book.member_capital_recharge_log.remark</code>. 备注
     */
    public MemberCapitalRechargeLogRecord setRemark(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>book.member_capital_recharge_log.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>book.member_capital_recharge_log.del_flag</code>. 删除标记
     */
    public MemberCapitalRechargeLogRecord setDelFlag(Boolean value) {
        set(11, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>book.member_capital_recharge_log.version</code>. 版本号
     */
    public Long getVersion() {
        return (Long) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>book.member_capital_recharge_log.version</code>. 版本号
     */
    public MemberCapitalRechargeLogRecord setVersion(Long value) {
        set(12, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, Long, String, BigDecimal, MemberCapitalRechargeLogStatus, MemberCapitalRechargeLogType, Long, Timestamp, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, Long, String, BigDecimal, MemberCapitalRechargeLogStatus, MemberCapitalRechargeLogType, Long, Timestamp, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG.MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG.REQUEST_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<MemberCapitalRechargeLogStatus> field5() {
        return MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<MemberCapitalRechargeLogType> field6() {
        return MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG.SOURCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG.FINISH_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG.VERSION;
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
    public Long component2() {
        return getMemberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getRequestNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalRechargeLogStatus component5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalRechargeLogType component6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getSourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getFinishTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component13() {
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
    public Long value2() {
        return getMemberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRequestNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalRechargeLogStatus value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalRechargeLogType value6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getSourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getFinishTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalRechargeLogRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalRechargeLogRecord value2(Long value) {
        setMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalRechargeLogRecord value3(String value) {
        setRequestNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalRechargeLogRecord value4(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalRechargeLogRecord value5(MemberCapitalRechargeLogStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalRechargeLogRecord value6(MemberCapitalRechargeLogType value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalRechargeLogRecord value7(Long value) {
        setSourceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalRechargeLogRecord value8(Timestamp value) {
        setFinishTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalRechargeLogRecord value9(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalRechargeLogRecord value10(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalRechargeLogRecord value11(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalRechargeLogRecord value12(Boolean value) {
        setDelFlag(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalRechargeLogRecord value13(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalRechargeLogRecord values(Long value1, Long value2, String value3, BigDecimal value4, MemberCapitalRechargeLogStatus value5, MemberCapitalRechargeLogType value6, Long value7, Timestamp value8, Timestamp value9, Timestamp value10, String value11, Boolean value12, Long value13) {
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
        return this;
    }
}