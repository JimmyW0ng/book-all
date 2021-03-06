/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.tables;


import com.book.core.domain.Book;
import com.book.core.domain.Indexes;
import com.book.core.domain.Keys;
import com.book.core.domain.enums.MemberCoinWithdrawLogStatus;
import com.book.core.domain.tables.records.MemberCoinWithdrawLogRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


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
public class MemberCoinWithdrawLog extends TableImpl<MemberCoinWithdrawLogRecord> {

    private static final long serialVersionUID = 2063496419;

    /**
     * The reference instance of <code>book.member_coin_withdraw_log</code>
     */
    public static final MemberCoinWithdrawLog MEMBER_COIN_WITHDRAW_LOG = new MemberCoinWithdrawLog();

    private MemberCoinWithdrawLog(Name alias, Table<MemberCoinWithdrawLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "会员虚拟币提现记录表");
    }

    /**
     * The column <code>book.member_coin_withdraw_log.id</code>. 主键
     */
    public final TableField<MemberCoinWithdrawLogRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>book.member_coin_withdraw_log.member_id</code>. 会员id
     */
    public final TableField<MemberCoinWithdrawLogRecord, Long> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "会员id");

    /**
     * The column <code>book.member_coin_withdraw_log.request_no</code>. 业务请求号
     */
    public final TableField<MemberCoinWithdrawLogRecord, String> REQUEST_NO = createField("request_no", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "业务请求号");

    /**
     * The column <code>book.member_coin_withdraw_log.amount</code>. 充值金额
     */
    public final TableField<MemberCoinWithdrawLogRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL(12, 2).nullable(false), this, "充值金额");

    /**
     * The column <code>book.member_coin_withdraw_log.status</code>. 状态：待处理；处理中；成功；失败；
     */
    public final TableField<MemberCoinWithdrawLogRecord, MemberCoinWithdrawLogStatus> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false).asEnumDataType(com.book.core.domain.enums.MemberCoinWithdrawLogStatus.class), this, "状态：待处理；处理中；成功；失败；");

    /**
     * The column <code>book.member_coin_withdraw_log.finish_time</code>. 完成时间
     */
    public final TableField<MemberCoinWithdrawLogRecord, Timestamp> FINISH_TIME = createField("finish_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "完成时间");

    /**
     * The column <code>book.member_coin_withdraw_log.create_at</code>. 创建时间
     */
    public final TableField<MemberCoinWithdrawLogRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>book.member_coin_withdraw_log.update_at</code>. 更新时间
     */
    public final TableField<MemberCoinWithdrawLogRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>book.member_coin_withdraw_log.remark</code>. 备注
     */
    public final TableField<MemberCoinWithdrawLogRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注");

    /**
     * The column <code>book.member_coin_withdraw_log.del_flag</code>. 删除标记
     */
    public final TableField<MemberCoinWithdrawLogRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");

    /**
     * The column <code>book.member_coin_withdraw_log.version</code>. 版本号
     */
    public final TableField<MemberCoinWithdrawLogRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "版本号");

    /**
     * Create a <code>book.member_coin_withdraw_log</code> table reference
     */
    public MemberCoinWithdrawLog() {
        this(DSL.name("member_coin_withdraw_log"), null);
    }

    /**
     * Create an aliased <code>book.member_coin_withdraw_log</code> table reference
     */
    public MemberCoinWithdrawLog(String alias) {
        this(DSL.name(alias), MEMBER_COIN_WITHDRAW_LOG);
    }

    /**
     * Create an aliased <code>book.member_coin_withdraw_log</code> table reference
     */
    public MemberCoinWithdrawLog(Name alias) {
        this(alias, MEMBER_COIN_WITHDRAW_LOG);
    }

    private MemberCoinWithdrawLog(Name alias, Table<MemberCoinWithdrawLogRecord> aliased) {
        this(alias, aliased, null);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemberCoinWithdrawLogRecord> getRecordType() {
        return MemberCoinWithdrawLogRecord.class;
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
        return Arrays.<Index>asList(Indexes.MEMBER_COIN_WITHDRAW_LOG_INDEX_MEMBER_ID, Indexes.MEMBER_COIN_WITHDRAW_LOG_PRIMARY, Indexes.MEMBER_COIN_WITHDRAW_LOG_UNIQUE_REQUEST_NO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MemberCoinWithdrawLogRecord, Long> getIdentity() {
        return Keys.IDENTITY_MEMBER_COIN_WITHDRAW_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MemberCoinWithdrawLogRecord> getPrimaryKey() {
        return Keys.KEY_MEMBER_COIN_WITHDRAW_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MemberCoinWithdrawLogRecord>> getKeys() {
        return Arrays.<UniqueKey<MemberCoinWithdrawLogRecord>>asList(Keys.KEY_MEMBER_COIN_WITHDRAW_LOG_PRIMARY, Keys.KEY_MEMBER_COIN_WITHDRAW_LOG_UNIQUE_REQUEST_NO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<MemberCoinWithdrawLogRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinWithdrawLog as(String alias) {
        return new MemberCoinWithdrawLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinWithdrawLog as(Name alias) {
        return new MemberCoinWithdrawLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberCoinWithdrawLog rename(String name) {
        return new MemberCoinWithdrawLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberCoinWithdrawLog rename(Name name) {
        return new MemberCoinWithdrawLog(name, null);
    }
}
