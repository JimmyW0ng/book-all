/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.tables;


import com.book.core.domain.Book;
import com.book.core.domain.Indexes;
import com.book.core.domain.Keys;
import com.book.core.domain.tables.records.MemberReferRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


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
public class MemberRefer extends TableImpl<MemberReferRecord> {

    private static final long serialVersionUID = -1930227098;

    /**
     * The reference instance of <code>book.member_refer</code>
     */
    public static final MemberRefer MEMBER_REFER = new MemberRefer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemberReferRecord> getRecordType() {
        return MemberReferRecord.class;
    }

    /**
     * The column <code>book.member_refer.id</code>. 主键
     */
    public final TableField<MemberReferRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>book.member_refer.member_id</code>. 会员id
     */
    public final TableField<MemberReferRecord, Long> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "会员id");

    /**
     * The column <code>book.member_refer.referral_id</code>. 推荐人id
     */
    public final TableField<MemberReferRecord, Long> REFERRAL_ID = createField("referral_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "推荐人id");

    /**
     * The column <code>book.member_refer.level</code>. 推荐等级
     */
    public final TableField<MemberReferRecord, Integer> LEVEL = createField("level", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "推荐等级");

    /**
     * The column <code>book.member_refer.archived</code>. 激活标志
     */
    public final TableField<MemberReferRecord, Boolean> ARCHIVED = createField("archived", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'1'", org.jooq.impl.SQLDataType.BIT)), this, "激活标志");

    /**
     * The column <code>book.member_refer.remark</code>. 备注
     */
    public final TableField<MemberReferRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注");

    /**
     * The column <code>book.member_refer.create_at</code>. 创建时间
     */
    public final TableField<MemberReferRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>book.member_refer.update_at</code>. 更新时间
     */
    public final TableField<MemberReferRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>book.member_refer.del_flag</code>. 删除标志
     */
    public final TableField<MemberReferRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>book.member_refer.version</code>. 版本号
     */
    public final TableField<MemberReferRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "版本号");

    /**
     * Create a <code>book.member_refer</code> table reference
     */
    public MemberRefer() {
        this(DSL.name("member_refer"), null);
    }

    /**
     * Create an aliased <code>book.member_refer</code> table reference
     */
    public MemberRefer(String alias) {
        this(DSL.name(alias), MEMBER_REFER);
    }

    /**
     * Create an aliased <code>book.member_refer</code> table reference
     */
    public MemberRefer(Name alias) {
        this(alias, MEMBER_REFER);
    }

    private MemberRefer(Name alias, Table<MemberReferRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemberRefer(Name alias, Table<MemberReferRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "会员推荐表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Book.BOOK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MEMBER_REFER_INDEX_MEMBER_ID, Indexes.MEMBER_REFER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MemberReferRecord, Long> getIdentity() {
        return Keys.IDENTITY_MEMBER_REFER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MemberReferRecord> getPrimaryKey() {
        return Keys.KEY_MEMBER_REFER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MemberReferRecord>> getKeys() {
        return Arrays.<UniqueKey<MemberReferRecord>>asList(Keys.KEY_MEMBER_REFER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<MemberReferRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRefer as(String alias) {
        return new MemberRefer(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberRefer as(Name alias) {
        return new MemberRefer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberRefer rename(String name) {
        return new MemberRefer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberRefer rename(Name name) {
        return new MemberRefer(name, null);
    }
}
