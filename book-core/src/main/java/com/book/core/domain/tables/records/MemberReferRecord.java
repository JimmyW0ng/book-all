/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.tables.records;


import com.book.core.domain.tables.MemberRefer;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 会员推荐表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MemberReferRecord extends UpdatableRecordImpl<MemberReferRecord> implements Record10<Long, Long, Long, Integer, Boolean, String, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = 5127056;

    /**
     * Setter for <code>book.member_refer.id</code>. 主键
     */
    public MemberReferRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Create a detached MemberReferRecord
     */
    public MemberReferRecord() {
        super(MemberRefer.MEMBER_REFER);
    }

    /**
     * Setter for <code>book.member_refer.member_id</code>. 会员id
     */
    public MemberReferRecord setMemberId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Create a detached, initialised MemberReferRecord
     */
    public MemberReferRecord(Long id, Long memberId, Long referralId, Integer level, Boolean archived, String remark, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(MemberRefer.MEMBER_REFER);

        set(0, id);
        set(1, memberId);
        set(2, referralId);
        set(3, level);
        set(4, archived);
        set(5, remark);
        set(6, createAt);
        set(7, updateAt);
        set(8, delFlag);
        set(9, version);
    }

    /**
     * Setter for <code>book.member_refer.referral_id</code>. 推荐人id
     */
    public MemberReferRecord setReferralId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>book.member_refer.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>book.member_refer.level</code>. 推荐等级
     */
    public MemberReferRecord setLevel(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>book.member_refer.member_id</code>. 会员id
     */
    public Long getMemberId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>book.member_refer.archived</code>. 激活标志
     */
    public MemberReferRecord setArchived(Boolean value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>book.member_refer.referral_id</code>. 推荐人id
     */
    public Long getReferralId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>book.member_refer.remark</code>. 备注
     */
    public MemberReferRecord setRemark(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>book.member_refer.level</code>. 推荐等级
     */
    public Integer getLevel() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>book.member_refer.create_at</code>. 创建时间
     */
    public MemberReferRecord setCreateAt(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>book.member_refer.archived</code>. 激活标志
     */
    public Boolean getArchived() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>book.member_refer.update_at</code>. 更新时间
     */
    public MemberReferRecord setUpdateAt(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>book.member_refer.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(5);
    }

    /**
     * Getter for <code>book.member_refer.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(6);
    }

    /**
     * Getter for <code>book.member_refer.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(8);
    }

    /**
     * Getter for <code>book.member_refer.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(7);
    }

    /**
     * Getter for <code>book.member_refer.version</code>. 版本号
     */
    public Long getVersion() {
        return (Long) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, Long, Integer, Boolean, String, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, Long, Integer, Boolean, String, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MemberRefer.MEMBER_REFER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return MemberRefer.MEMBER_REFER.MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return MemberRefer.MEMBER_REFER.REFERRAL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return MemberRefer.MEMBER_REFER.LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return MemberRefer.MEMBER_REFER.ARCHIVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MemberRefer.MEMBER_REFER.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return MemberRefer.MEMBER_REFER.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return MemberRefer.MEMBER_REFER.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return MemberRefer.MEMBER_REFER.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return MemberRefer.MEMBER_REFER.VERSION;
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
    public Long component3() {
        return getReferralId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getArchived();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRemark();
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
    public Boolean component9() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
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
    public Long value3() {
        return getReferralId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getArchived();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRemark();
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
    public Boolean value9() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberReferRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberReferRecord value2(Long value) {
        setMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberReferRecord value3(Long value) {
        setReferralId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberReferRecord value4(Integer value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberReferRecord value5(Boolean value) {
        setArchived(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberReferRecord value6(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberReferRecord value7(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberReferRecord value8(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberReferRecord value9(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberReferRecord value10(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberReferRecord values(Long value1, Long value2, Long value3, Integer value4, Boolean value5, String value6, Timestamp value7, Timestamp value8, Boolean value9, Long value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>book.member_refer.del_flag</code>. 删除标志
     */
    public MemberReferRecord setDelFlag(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Setter for <code>book.member_refer.version</code>. 版本号
     */
    public MemberReferRecord setVersion(Long value) {
        set(9, value);
        return this;
    }
}
