/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.tables;


import com.book.core.domain.Book;
import com.book.core.domain.Indexes;
import com.book.core.domain.Keys;
import com.book.core.domain.enums.MemberCapitalInOutLogAmountType;
import com.book.core.domain.enums.MemberCapitalInOutLogType;
import com.book.core.domain.tables.records.MemberCapitalInOutLogRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 会员资金流水表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MemberCapitalInOutLog extends TableImpl<MemberCapitalInOutLogRecord> {

    private static final long serialVersionUID = -1114404211;

    /**
     * The reference instance of <code>book.member_capital_in_out_log</code>
     */
    public static final MemberCapitalInOutLog MEMBER_CAPITAL_IN_OUT_LOG = new MemberCapitalInOutLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemberCapitalInOutLogRecord> getRecordType() {
        return MemberCapitalInOutLogRecord.class;
    }

    /**
     * The column <code>book.member_capital_in_out_log.id</code>.
     */
    public final TableField<MemberCapitalInOutLogRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>book.member_capital_in_out_log.member_id</code>. 会员标识
     */
    public final TableField<MemberCapitalInOutLogRecord, Long> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.BIGINT, this, "会员标识");

    /**
     * The column <code>book.member_capital_in_out_log.available_balance</code>. 变更后可用余额
     */
    public final TableField<MemberCapitalInOutLogRecord, BigDecimal> AVAILABLE_BALANCE = createField("available_balance", org.jooq.impl.SQLDataType.DECIMAL(12, 2), this, "变更后可用余额");

    /**
     * The column <code>book.member_capital_in_out_log.type</code>. 类型：充值、vip购买
     */
    public final TableField<MemberCapitalInOutLogRecord, MemberCapitalInOutLogType> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(8).nullable(false).asEnumDataType(com.book.core.domain.enums.MemberCapitalInOutLogType.class), this, "类型：充值、vip购买");

    /**
     * The column <code>book.member_capital_in_out_log.amount</code>. 交易金额
     */
    public final TableField<MemberCapitalInOutLogRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL(12, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "交易金额");

    /**
     * The column <code>book.member_capital_in_out_log.amount_type</code>. 收入、支出
     */
    public final TableField<MemberCapitalInOutLogRecord, MemberCapitalInOutLogAmountType> AMOUNT_TYPE = createField("amount_type", org.jooq.impl.SQLDataType.VARCHAR(6).asEnumDataType(com.book.core.domain.enums.MemberCapitalInOutLogAmountType.class), this, "收入、支出");

    /**
     * The column <code>book.member_capital_in_out_log.source_id</code>. 业务id：充值记录id；vip购买记录id；
     */
    public final TableField<MemberCapitalInOutLogRecord, String> SOURCE_ID = createField("source_id", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "业务id：充值记录id；vip购买记录id；");

    /**
     * The column <code>book.member_capital_in_out_log.remark</code>.
     */
    public final TableField<MemberCapitalInOutLogRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>book.member_capital_in_out_log.create_at</code>. 创建时间
     */
    public final TableField<MemberCapitalInOutLogRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>book.member_capital_in_out_log.del_flag</code>. 删除标记
     */
    public final TableField<MemberCapitalInOutLogRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");

    /**
     * The column <code>book.member_capital_in_out_log.update_at</code>. 更新时间
     */
    public final TableField<MemberCapitalInOutLogRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>book.member_capital_in_out_log.version</code>. 版本号
     */
    public final TableField<MemberCapitalInOutLogRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "版本号");

    /**
     * Create a <code>book.member_capital_in_out_log</code> table reference
     */
    public MemberCapitalInOutLog() {
        this(DSL.name("member_capital_in_out_log"), null);
    }

    /**
     * Create an aliased <code>book.member_capital_in_out_log</code> table reference
     */
    public MemberCapitalInOutLog(String alias) {
        this(DSL.name(alias), MEMBER_CAPITAL_IN_OUT_LOG);
    }

    /**
     * Create an aliased <code>book.member_capital_in_out_log</code> table reference
     */
    public MemberCapitalInOutLog(Name alias) {
        this(alias, MEMBER_CAPITAL_IN_OUT_LOG);
    }

    private MemberCapitalInOutLog(Name alias, Table<MemberCapitalInOutLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemberCapitalInOutLog(Name alias, Table<MemberCapitalInOutLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "会员资金流水表");
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
        return Arrays.<Index>asList(Indexes.MEMBER_CAPITAL_IN_OUT_LOG_INDEX_MEMBER_ID, Indexes.MEMBER_CAPITAL_IN_OUT_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MemberCapitalInOutLogRecord, Long> getIdentity() {
        return Keys.IDENTITY_MEMBER_CAPITAL_IN_OUT_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MemberCapitalInOutLogRecord> getPrimaryKey() {
        return Keys.KEY_MEMBER_CAPITAL_IN_OUT_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MemberCapitalInOutLogRecord>> getKeys() {
        return Arrays.<UniqueKey<MemberCapitalInOutLogRecord>>asList(Keys.KEY_MEMBER_CAPITAL_IN_OUT_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<MemberCapitalInOutLogRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalInOutLog as(String alias) {
        return new MemberCapitalInOutLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCapitalInOutLog as(Name alias) {
        return new MemberCapitalInOutLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberCapitalInOutLog rename(String name) {
        return new MemberCapitalInOutLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberCapitalInOutLog rename(Name name) {
        return new MemberCapitalInOutLog(name, null);
    }
}
