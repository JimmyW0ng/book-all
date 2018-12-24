/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.tables;


import com.book.core.domain.Book;
import com.book.core.domain.Indexes;
import com.book.core.domain.Keys;
import com.book.core.domain.tables.records.MemberCoinBalanceRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 会员虚拟币余额表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MemberCoinBalance extends TableImpl<MemberCoinBalanceRecord> {

    /**
     * The reference instance of <code>book.member_coin_balance</code>
     */
    public static final MemberCoinBalance MEMBER_COIN_BALANCE = new MemberCoinBalance();
    private static final long serialVersionUID = 1189201676;
    /**
     * The column <code>book.member_coin_balance.id</code>. 主键
     */
    public final TableField<MemberCoinBalanceRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");
    /**
     * The column <code>book.member_coin_balance.member_id</code>. 会员标识
     */
    public final TableField<MemberCoinBalanceRecord, Long> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "会员标识");
    /**
     * The column <code>book.member_coin_balance.balance</code>. 总余额
     */
    public final TableField<MemberCoinBalanceRecord, BigDecimal> BALANCE = createField("balance", org.jooq.impl.SQLDataType.DECIMAL(12, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "总余额");
    /**
     * The column <code>book.member_coin_balance.available_balance</code>. 可用余额
     */
    public final TableField<MemberCoinBalanceRecord, BigDecimal> AVAILABLE_BALANCE = createField("available_balance", org.jooq.impl.SQLDataType.DECIMAL(12, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "可用余额");
    /**
     * The column <code>book.member_coin_balance.remark</code>. 备注
     */
    public final TableField<MemberCoinBalanceRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注");
    /**
     * The column <code>book.member_coin_balance.create_at</code>. 创建时间
     */
    public final TableField<MemberCoinBalanceRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");
    /**
     * The column <code>book.member_coin_balance.update_at</code>. 更新时间
     */
    public final TableField<MemberCoinBalanceRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");
    /**
     * The column <code>book.member_coin_balance.del_flag</code>. 删除标志
     */
    public final TableField<MemberCoinBalanceRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");
    /**
     * The column <code>book.member_coin_balance.version</code>.
     */
    public final TableField<MemberCoinBalanceRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>book.member_coin_balance</code> table reference
     */
    public MemberCoinBalance() {
        this(DSL.name("member_coin_balance"), null);
    }

    /**
     * Create an aliased <code>book.member_coin_balance</code> table reference
     */
    public MemberCoinBalance(String alias) {
        this(DSL.name(alias), MEMBER_COIN_BALANCE);
    }

    /**
     * Create an aliased <code>book.member_coin_balance</code> table reference
     */
    public MemberCoinBalance(Name alias) {
        this(alias, MEMBER_COIN_BALANCE);
    }

    private MemberCoinBalance(Name alias, Table<MemberCoinBalanceRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemberCoinBalance(Name alias, Table<MemberCoinBalanceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "会员虚拟币余额表");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemberCoinBalanceRecord> getRecordType() {
        return MemberCoinBalanceRecord.class;
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
        return Arrays.<Index>asList(Indexes.MEMBER_COIN_BALANCE_PRIMARY, Indexes.MEMBER_COIN_BALANCE_UNIQUE_MEMBER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MemberCoinBalanceRecord, Long> getIdentity() {
        return Keys.IDENTITY_MEMBER_COIN_BALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MemberCoinBalanceRecord> getPrimaryKey() {
        return Keys.KEY_MEMBER_COIN_BALANCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MemberCoinBalanceRecord>> getKeys() {
        return Arrays.<UniqueKey<MemberCoinBalanceRecord>>asList(Keys.KEY_MEMBER_COIN_BALANCE_PRIMARY, Keys.KEY_MEMBER_COIN_BALANCE_UNIQUE_MEMBER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<MemberCoinBalanceRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinBalance as(String alias) {
        return new MemberCoinBalance(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemberCoinBalance as(Name alias) {
        return new MemberCoinBalance(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberCoinBalance rename(String name) {
        return new MemberCoinBalance(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemberCoinBalance rename(Name name) {
        return new MemberCoinBalance(name, null);
    }
}
