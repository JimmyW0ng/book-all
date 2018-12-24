/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.tables.records;


import com.book.core.domain.tables.MemberCapitalBalance;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * 会员资金余额表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MemberCapitalBalanceRecord extends UpdatableRecordImpl<MemberCapitalBalanceRecord> implements Record9<Long, Long, BigDecimal, BigDecimal, String, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = -1912720184;

    /**
     * Create a detached MemberCapitalBalanceRecord
     */
    public MemberCapitalBalanceRecord() {
        super(MemberCapitalBalance.MEMBER_CAPITAL_BALANCE);
    }

    /**
     * Create a detached, initialised MemberCapitalBalanceRecord
     */
    public MemberCapitalBalanceRecord(Long id, Long memberId, BigDecimal balance, BigDecimal availableBalance, String remark, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(MemberCapitalBalance.MEMBER_CAPITAL_BALANCE);

        set(0, id);
        set(1, memberId);
        set(2, balance);
        set(3, availableBalance);
        set(4, remark);
        set(5, createAt);
        set(6, updateAt);
        set(7, delFlag);
        set(8, version);
    }

    /**
     * Getter for <code>book.member_capital_balance.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>book.member_capital_balance.id</code>. 主键
     */
    public MemberCapitalBalanceRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>book.member_capital_balance.member_id</code>. 会员标识
     */
    public Long getMemberId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>book.member_capital_balance.member_id</code>. 会员标识
     */
    public MemberCapitalBalanceRecord setMemberId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>book.member_capital_balance.balance</code>. 总余额
     */
    public BigDecimal getBalance() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>book.member_capital_balance.balance</code>. 总余额
     */
    public MemberCapitalBalanceRecord setBalance(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>book.member_capital_balance.available_balance</code>. 可用余额
     */
    public BigDecimal getAvailableBalance() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>book.member_capital_balance.available_balance</code>. 可用余额
     */
    public MemberCapitalBalanceRecord setAvailableBalance(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>book.member_capital_balance.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(4);
    }

    /**
     * Setter for <code>book.member_capital_balance.remark</code>. 备注
     */
    public MemberCapitalBalanceRecord setRemark(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>book.member_capital_balance.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>book.member_capital_balance.create_at</code>. 创建时间
     */
    public MemberCapitalBalanceRecord setCreateAt(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>book.member_capital_balance.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>book.member_capital_balance.update_at</code>. 更新时间
     */
    public MemberCapitalBalanceRecord setUpdateAt(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>book.member_capital_balance.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>book.member_capital_balance.del_flag</code>. 删除标志
     */
    public MemberCapitalBalanceRecord setDelFlag(Boolean value) {
        set(7, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>book.member_capital_balance.version</code>.
     */
    public Long getVersion() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>book.member_capital_balance.version</code>.
     */
    public MemberCapitalBalanceRecord setVersion(Long value) {
        set(8, value);
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
    public Row9<Long, Long, BigDecimal, BigDecimal, String, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Long, BigDecimal, BigDecimal, String, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MemberCapitalBalance.MEMBER_CAPITAL_BALANCE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return MemberCapitalBalance.MEMBER_CAPITAL_BALANCE.MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return MemberCapitalBalance.MEMBER_CAPITAL_BALANCE.BALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return MemberCapitalBalance.MEMBER_CAPITAL_BALANCE.AVAILABLE_BALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MemberCapitalBalance.MEMBER_CAPITAL_BALANCE.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return MemberCapitalBalance.MEMBER_CAPITAL_BALANCE.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return MemberCapitalBalance.MEMBER_CAPITAL_BALANCE.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return MemberCapitalBalance.MEMBER_CAPITAL_BALANCE.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return MemberCapitalBalance.MEMBER_CAPITAL_BALANCE.VERSION;
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
        return getBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getAvailableBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
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
        return getBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getAvailableBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalBalanceRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalBalanceRecord value2(Long value) {
        setMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalBalanceRecord value3(BigDecimal value) {
        setBalance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalBalanceRecord value4(BigDecimal value) {
        setAvailableBalance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalBalanceRecord value5(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalBalanceRecord value6(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalBalanceRecord value7(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalBalanceRecord value8(Boolean value) {
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
    public MemberCapitalBalanceRecord value9(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalBalanceRecord values(Long value1, Long value2, BigDecimal value3, BigDecimal value4, String value5, Timestamp value6, Timestamp value7, Boolean value8, Long value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }
}