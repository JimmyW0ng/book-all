/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.tables;


import com.book.core.domain.Book;
import com.book.core.domain.Indexes;
import com.book.core.domain.Keys;
import com.book.core.domain.tables.records.MemberTimePaymentLogRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 会员时间段付费日志表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MemberTimePaymentLog extends TableImpl<MemberTimePaymentLogRecord> {

    /**
     * The reference instance of <code>book.member_time_payment_log</code>
     */
    public static final MemberTimePaymentLog MEMBER_TIME_PAYMENT_LOG = new MemberTimePaymentLog();
    private static final long serialVersionUID = 798462161;
    /**
     * The column <code>book.member_time_payment_log.id</code>. 主键
     */
    public final TableField<MemberTimePaymentLogRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");
    /**
     * The column <code>book.member_time_payment_log.member_id</code>. 会员id
     */
    public final TableField<MemberTimePaymentLogRecord, Long> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "会员id");
    /**
     * The column <code>book.member_time_payment_log.real_pay_amount</code>. 实际支付金额
     */
    public final TableField<MemberTimePaymentLogRecord, BigDecimal> REAL_PAY_AMOUNT = createField("real_pay_amount", org.jooq.impl.SQLDataType.DECIMAL(12, 2).nullable(false), this, "实际支付金额");
    /**
     * The column <code>book.member_time_payment_log.start_time</code>. 开始时间
     */
    public final TableField<MemberTimePaymentLogRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "开始时间");
    /**
     * The column <code>book.member_time_payment_log.end_time</code>. 结束时间
     */
    public final TableField<MemberTimePaymentLogRecord, Timestamp> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "结束时间");
    /**
     * The column <code>book.member_time_payment_log.remark</code>. 备注
     */
    public final TableField<MemberTimePaymentLogRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注");
    /**
     * The column <code>book.member_time_payment_log.create_at</code>. 创建时间
     */
    public final TableField<MemberTimePaymentLogRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");
    /**
     * The column <code>book.member_time_payment_log.update_at</code>. 更新时间
     */
    public final TableField<MemberTimePaymentLogRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");
    /**
     * The column <code>book.member_time_payment_log.del_flag</code>. 删除标志
     */
    public final TableField<MemberTimePaymentLogRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");
    /**
     * The column <code>book.member_time_payment_log.version</code>. 版本号
     */
    public final TableField<MemberTimePaymentLogRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "版本号");

    /**
     * Create a <code>book.member_time_payment_log</code> table reference
     */
    public MemberTimePaymentLog() {
        this(DSL.name("member_time_payment_log"), null);
    }

    /**
     * Create an aliased <code>book.member_time_payment_log</code> table reference
     */
    public MemberTimePaymentLog(String alias) {
        this(DSL.name(alias), MEMBER_TIME_PAYMENT_LOG);
    }

    /**
     * Create an aliased <code>book.member_time_payment_log</code> table reference
     */
    public MemberTimePaymentLog(Name alias) {
        this(alias, MEMBER_TIME_PAYMENT_LOG);
    }

    private MemberTimePaymentLog(Name alias, Table<MemberTimePaymentLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemberTimePaymentLog(Name alias, Table<MemberTimePaymentLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "会员时间段付费日志表");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemberTimePaymentLogRecord> getRecordType() {
        return MemberTimePaymentLogRecord.class;
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
        return Arrays.<Index>asList(Indexes.MEMBER_TIME_PAYMENT_LOG_INDEX_MEMBER_ID, Indexes.MEMBER_TIME_PAYMENT_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MemberTimePaymentLogRecord, Long> getIdentity() {
        return Keys.IDENTITY_MEMBER_TIME_PAYMENT_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MemberTimePaymentLogRecord> getPrimaryKey() {
        return Keys.KEY_MEMBER_TIME_PAYMENT_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MemberTimePaymentLogRecord>> getKeys() {
        return Arrays.<UniqueKey<MemberTimePaymentLogRecord>>asList(Keys.KEY_MEMBER_TIME_PAYMENT_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<MemberTimePaymentLogRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberTimePaymentLog as(String alias) {
        return new MemberTimePaymentLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberTimePaymentLog as(Name alias) {
        return new MemberTimePaymentLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberTimePaymentLog rename(String name) {
        return new MemberTimePaymentLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberTimePaymentLog rename(Name name) {
        return new MemberTimePaymentLog(name, null);
    }
}