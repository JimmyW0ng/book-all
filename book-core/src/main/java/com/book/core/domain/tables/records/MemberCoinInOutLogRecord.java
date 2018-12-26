/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.tables.records;


import com.book.core.domain.enums.MemberCoinInOutLogAmountType;
import com.book.core.domain.enums.MemberCoinInOutLogType;
import com.book.core.domain.tables.MemberCoinInOutLog;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * 会员虚拟币流水表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MemberCoinInOutLogRecord extends UpdatableRecordImpl<MemberCoinInOutLogRecord> implements Record12<Long, Long, BigDecimal, MemberCoinInOutLogType, BigDecimal, MemberCoinInOutLogAmountType, String, String, Timestamp, Boolean, Timestamp, Long> {

    private static final long serialVersionUID = -1278272524;

    /**
     * Create a detached MemberCoinInOutLogRecord
     */
    public MemberCoinInOutLogRecord() {
        super(MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG);
    }

    /**
     * Create a detached, initialised MemberCoinInOutLogRecord
     */
    public MemberCoinInOutLogRecord(Long id, Long memberId, BigDecimal availableBalance, MemberCoinInOutLogType type, BigDecimal amount, MemberCoinInOutLogAmountType amountType, String sourceId, String remark, Timestamp createAt, Boolean delFlag, Timestamp updateAt, Long version) {
        super(MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG);

        set(0, id);
        set(1, memberId);
        set(2, availableBalance);
        set(3, type);
        set(4, amount);
        set(5, amountType);
        set(6, sourceId);
        set(7, remark);
        set(8, createAt);
        set(9, delFlag);
        set(10, updateAt);
        set(11, version);
    }

    /**
     * Getter for <code>book.member_coin_in_out_log.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>book.member_coin_in_out_log.id</code>.
     */
    public MemberCoinInOutLogRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_in_out_log.member_id</code>. 会员标识
     */
    public Long getMemberId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>book.member_coin_in_out_log.member_id</code>. 会员标识
     */
    public MemberCoinInOutLogRecord setMemberId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_in_out_log.available_balance</code>. 变更后可用余额
     */
    public BigDecimal getAvailableBalance() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>book.member_coin_in_out_log.available_balance</code>. 变更后可用余额
     */
    public MemberCoinInOutLogRecord setAvailableBalance(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_in_out_log.type</code>. 类型：推荐好友分润、提现
     */
    public MemberCoinInOutLogType getType() {
        return (MemberCoinInOutLogType) get(3);
    }

    /**
     * Setter for <code>book.member_coin_in_out_log.type</code>. 类型：推荐好友分润、提现
     */
    public MemberCoinInOutLogRecord setType(MemberCoinInOutLogType value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_in_out_log.amount</code>. 交易金额
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>book.member_coin_in_out_log.amount</code>. 交易金额
     */
    public MemberCoinInOutLogRecord setAmount(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_in_out_log.amount_type</code>. 收入、支出
     */
    public MemberCoinInOutLogAmountType getAmountType() {
        return (MemberCoinInOutLogAmountType) get(5);
    }

    /**
     * Setter for <code>book.member_coin_in_out_log.amount_type</code>. 收入、支出
     */
    public MemberCoinInOutLogRecord setAmountType(MemberCoinInOutLogAmountType value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_in_out_log.source_id</code>. 业务id：分润记录id；提现记录id；
     */
    public String getSourceId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>book.member_coin_in_out_log.source_id</code>. 业务id：分润记录id；提现记录id；
     */
    public MemberCoinInOutLogRecord setSourceId(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_in_out_log.remark</code>.
     */
    public String getRemark() {
        return (String) get(7);
    }

    /**
     * Setter for <code>book.member_coin_in_out_log.remark</code>.
     */
    public MemberCoinInOutLogRecord setRemark(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_in_out_log.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>book.member_coin_in_out_log.create_at</code>. 创建时间
     */
    public MemberCoinInOutLogRecord setCreateAt(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_in_out_log.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>book.member_coin_in_out_log.del_flag</code>. 删除标记
     */
    public MemberCoinInOutLogRecord setDelFlag(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_in_out_log.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>book.member_coin_in_out_log.update_at</code>. 更新时间
     */
    public MemberCoinInOutLogRecord setUpdateAt(Timestamp value) {
        set(10, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>book.member_coin_in_out_log.version</code>. 版本号
     */
    public Long getVersion() {
        return (Long) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>book.member_coin_in_out_log.version</code>. 版本号
     */
    public MemberCoinInOutLogRecord setVersion(Long value) {
        set(11, value);
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
    public Row12<Long, Long, BigDecimal, MemberCoinInOutLogType, BigDecimal, MemberCoinInOutLogAmountType, String, String, Timestamp, Boolean, Timestamp, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Long, BigDecimal, MemberCoinInOutLogType, BigDecimal, MemberCoinInOutLogAmountType, String, String, Timestamp, Boolean, Timestamp, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG.MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG.AVAILABLE_BALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<MemberCoinInOutLogType> field4() {
        return MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<MemberCoinInOutLogAmountType> field6() {
        return MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG.AMOUNT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG.SOURCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG.VERSION;
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
    public BigDecimal component3() {
        return getAvailableBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinInOutLogType component4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinInOutLogAmountType component6() {
        return getAmountType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getRemark();
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
    public Boolean component10() {
        return getDelFlag();
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
    public Long component12() {
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
    public BigDecimal value3() {
        return getAvailableBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinInOutLogType value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinInOutLogAmountType value6() {
        return getAmountType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRemark();
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
    public Boolean value10() {
        return getDelFlag();
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
    public Long value12() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinInOutLogRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinInOutLogRecord value2(Long value) {
        setMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinInOutLogRecord value3(BigDecimal value) {
        setAvailableBalance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinInOutLogRecord value4(MemberCoinInOutLogType value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinInOutLogRecord value5(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinInOutLogRecord value6(MemberCoinInOutLogAmountType value) {
        setAmountType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinInOutLogRecord value7(String value) {
        setSourceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinInOutLogRecord value8(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinInOutLogRecord value9(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinInOutLogRecord value10(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinInOutLogRecord value11(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinInOutLogRecord value12(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinInOutLogRecord values(Long value1, Long value2, BigDecimal value3, MemberCoinInOutLogType value4, BigDecimal value5, MemberCoinInOutLogAmountType value6, String value7, String value8, Timestamp value9, Boolean value10, Timestamp value11, Long value12) {
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
        return this;
    }
}
