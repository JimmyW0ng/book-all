/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.tables.records;


import com.book.core.domain.enums.MemberCoinWithdrawLogStatus;
import com.book.core.domain.tables.MemberCoinWithdrawLog;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * 会员虚拟币提现记录表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MemberCoinWithdrawLogRecord extends UpdatableRecordImpl<MemberCoinWithdrawLogRecord> implements Record11<Long, Long, String, BigDecimal, MemberCoinWithdrawLogStatus, Timestamp, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = -113980501;

    /**
     * Setter for <code>book.member_coin_withdraw_log.id</code>. 主键
     */
    public MemberCoinWithdrawLogRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Create a detached MemberCoinWithdrawLogRecord
     */
    public MemberCoinWithdrawLogRecord() {
        super(MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG);
    }

    /**
     * Setter for <code>book.member_coin_withdraw_log.member_id</code>. 会员id
     */
    public MemberCoinWithdrawLogRecord setMemberId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Create a detached, initialised MemberCoinWithdrawLogRecord
     */
    public MemberCoinWithdrawLogRecord(Long id, Long memberId, String requestNo, BigDecimal amount, MemberCoinWithdrawLogStatus status, Timestamp finishTime, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG);

        set(0, id);
        set(1, memberId);
        set(2, requestNo);
        set(3, amount);
        set(4, status);
        set(5, finishTime);
        set(6, createAt);
        set(7, updateAt);
        set(8, remark);
        set(9, delFlag);
        set(10, version);
    }

    /**
     * Setter for <code>book.member_coin_withdraw_log.request_no</code>. 业务请求号
     */
    public MemberCoinWithdrawLogRecord setRequestNo(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_withdraw_log.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>book.member_coin_withdraw_log.amount</code>. 充值金额
     */
    public MemberCoinWithdrawLogRecord setAmount(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_withdraw_log.member_id</code>. 会员id
     */
    public Long getMemberId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>book.member_coin_withdraw_log.status</code>. 状态：待处理；处理中；成功；失败；
     */
    public MemberCoinWithdrawLogRecord setStatus(MemberCoinWithdrawLogStatus value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_withdraw_log.request_no</code>. 业务请求号
     */
    public String getRequestNo() {
        return (String) get(2);
    }

    /**
     * Setter for <code>book.member_coin_withdraw_log.finish_time</code>. 完成时间
     */
    public MemberCoinWithdrawLogRecord setFinishTime(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_withdraw_log.amount</code>. 充值金额
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>book.member_coin_withdraw_log.create_at</code>. 创建时间
     */
    public MemberCoinWithdrawLogRecord setCreateAt(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_withdraw_log.status</code>. 状态：待处理；处理中；成功；失败；
     */
    public MemberCoinWithdrawLogStatus getStatus() {
        return (MemberCoinWithdrawLogStatus) get(4);
    }

    /**
     * Setter for <code>book.member_coin_withdraw_log.update_at</code>. 更新时间
     */
    public MemberCoinWithdrawLogRecord setUpdateAt(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_withdraw_log.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>book.member_coin_withdraw_log.remark</code>. 备注
     */
    public MemberCoinWithdrawLogRecord setRemark(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_withdraw_log.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(8);
    }

    /**
     * Getter for <code>book.member_coin_withdraw_log.finish_time</code>. 完成时间
     */
    public Timestamp getFinishTime() {
        return (Timestamp) get(5);
    }

    /**
     * Getter for <code>book.member_coin_withdraw_log.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(9);
    }

    /**
     * Getter for <code>book.member_coin_withdraw_log.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(6);
    }

    /**
     * Getter for <code>book.member_coin_withdraw_log.version</code>. 版本号
     */
    public Long getVersion() {
        return (Long) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Long, String, BigDecimal, MemberCoinWithdrawLogStatus, Timestamp, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Long, String, BigDecimal, MemberCoinWithdrawLogStatus, Timestamp, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG.MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG.REQUEST_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<MemberCoinWithdrawLogStatus> field5() {
        return MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG.FINISH_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG.VERSION;
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
    public MemberCoinWithdrawLogStatus component5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getFinishTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
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
    public MemberCoinWithdrawLogStatus value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getFinishTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinWithdrawLogRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinWithdrawLogRecord value2(Long value) {
        setMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinWithdrawLogRecord value3(String value) {
        setRequestNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinWithdrawLogRecord value4(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinWithdrawLogRecord value5(MemberCoinWithdrawLogStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinWithdrawLogRecord value6(Timestamp value) {
        setFinishTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinWithdrawLogRecord value7(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinWithdrawLogRecord value8(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinWithdrawLogRecord value9(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinWithdrawLogRecord value10(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinWithdrawLogRecord value11(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinWithdrawLogRecord values(Long value1, Long value2, String value3, BigDecimal value4, MemberCoinWithdrawLogStatus value5, Timestamp value6, Timestamp value7, Timestamp value8, String value9, Boolean value10, Long value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>book.member_coin_withdraw_log.del_flag</code>. 删除标记
     */
    public MemberCoinWithdrawLogRecord setDelFlag(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Setter for <code>book.member_coin_withdraw_log.version</code>. 版本号
     */
    public MemberCoinWithdrawLogRecord setVersion(Long value) {
        set(10, value);
        return this;
    }
}
