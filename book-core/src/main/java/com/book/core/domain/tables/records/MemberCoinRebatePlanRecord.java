/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.tables.records;


import com.book.core.domain.enums.MemberCoinRebatePlanStatus;
import com.book.core.domain.tables.MemberCoinRebatePlan;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * 会员虚拟币返利计划表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MemberCoinRebatePlanRecord extends UpdatableRecordImpl<MemberCoinRebatePlanRecord> implements Record11<Long, Long, String, MemberCoinRebatePlanStatus, Timestamp, BigDecimal, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = -530190521;

    /**
     * Setter for <code>book.member_coin_rebate_plan.id</code>. 主键
     */
    public MemberCoinRebatePlanRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Create a detached MemberCoinRebatePlanRecord
     */
    public MemberCoinRebatePlanRecord() {
        super(MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN);
    }

    /**
     * Setter for <code>book.member_coin_rebate_plan.member_id</code>. 会员id
     */
    public MemberCoinRebatePlanRecord setMemberId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Create a detached, initialised MemberCoinRebatePlanRecord
     */
    public MemberCoinRebatePlanRecord(Long id, Long memberId, String vipLogId, MemberCoinRebatePlanStatus status, Timestamp rebateTime, BigDecimal amount, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN);

        set(0, id);
        set(1, memberId);
        set(2, vipLogId);
        set(3, status);
        set(4, rebateTime);
        set(5, amount);
        set(6, createAt);
        set(7, updateAt);
        set(8, remark);
        set(9, delFlag);
        set(10, version);
    }

    /**
     * Setter for <code>book.member_coin_rebate_plan.vip_log_id</code>. vip购买记录id
     */
    public MemberCoinRebatePlanRecord setVipLogId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_rebate_plan.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>book.member_coin_rebate_plan.status</code>. 状态：待处理；成功；失败；
     */
    public MemberCoinRebatePlanRecord setStatus(MemberCoinRebatePlanStatus value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_rebate_plan.member_id</code>. 会员id
     */
    public Long getMemberId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>book.member_coin_rebate_plan.rebate_time</code>. 返利时间
     */
    public MemberCoinRebatePlanRecord setRebateTime(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_rebate_plan.vip_log_id</code>. vip购买记录id
     */
    public String getVipLogId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>book.member_coin_rebate_plan.amount</code>. 返利金额
     */
    public MemberCoinRebatePlanRecord setAmount(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_rebate_plan.status</code>. 状态：待处理；成功；失败；
     */
    public MemberCoinRebatePlanStatus getStatus() {
        return (MemberCoinRebatePlanStatus) get(3);
    }

    /**
     * Setter for <code>book.member_coin_rebate_plan.create_at</code>. 创建时间
     */
    public MemberCoinRebatePlanRecord setCreateAt(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_rebate_plan.rebate_time</code>. 返利时间
     */
    public Timestamp getRebateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>book.member_coin_rebate_plan.update_at</code>. 更新时间
     */
    public MemberCoinRebatePlanRecord setUpdateAt(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_rebate_plan.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>book.member_coin_rebate_plan.remark</code>. 备注
     */
    public MemberCoinRebatePlanRecord setRemark(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>book.member_coin_rebate_plan.amount</code>. 返利金额
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(5);
    }

    /**
     * Getter for <code>book.member_coin_rebate_plan.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(6);
    }

    /**
     * Getter for <code>book.member_coin_rebate_plan.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(8);
    }

    /**
     * Getter for <code>book.member_coin_rebate_plan.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(9);
    }

    /**
     * Getter for <code>book.member_coin_rebate_plan.version</code>. 版本号
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
    public Row11<Long, Long, String, MemberCoinRebatePlanStatus, Timestamp, BigDecimal, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Long, String, MemberCoinRebatePlanStatus, Timestamp, BigDecimal, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN.MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN.VIP_LOG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<MemberCoinRebatePlanStatus> field4() {
        return MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN.REBATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN.VERSION;
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
        return getVipLogId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinRebatePlanStatus component4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getRebateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getAmount();
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
        return getVipLogId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinRebatePlanStatus value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getRebateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getAmount();
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
    public MemberCoinRebatePlanRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinRebatePlanRecord value2(Long value) {
        setMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinRebatePlanRecord value3(String value) {
        setVipLogId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinRebatePlanRecord value4(MemberCoinRebatePlanStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinRebatePlanRecord value5(Timestamp value) {
        setRebateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinRebatePlanRecord value6(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinRebatePlanRecord value7(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinRebatePlanRecord value8(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinRebatePlanRecord value9(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinRebatePlanRecord value10(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinRebatePlanRecord value11(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinRebatePlanRecord values(Long value1, Long value2, String value3, MemberCoinRebatePlanStatus value4, Timestamp value5, BigDecimal value6, Timestamp value7, Timestamp value8, String value9, Boolean value10, Long value11) {
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
     * Setter for <code>book.member_coin_rebate_plan.del_flag</code>. 删除标记
     */
    public MemberCoinRebatePlanRecord setDelFlag(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Setter for <code>book.member_coin_rebate_plan.version</code>. 版本号
     */
    public MemberCoinRebatePlanRecord setVersion(Long value) {
        set(10, value);
        return this;
    }
}
