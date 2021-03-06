/*
 * This file is generated by jOOQ.
*/
package com.book.core.domain.tables;


import com.book.core.domain.Book;
import com.book.core.domain.Indexes;
import com.book.core.domain.Keys;
import com.book.core.domain.enums.AuthorityTokenTarget;
import com.book.core.domain.tables.records.AuthorityTokenRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 鉴权登录表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AuthorityToken extends TableImpl<AuthorityTokenRecord> {

    private static final long serialVersionUID = 1505706387;

    /**
     * The reference instance of <code>book.authority_token</code>
     */
    public static final AuthorityToken AUTHORITY_TOKEN = new AuthorityToken();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthorityTokenRecord> getRecordType() {
        return AuthorityTokenRecord.class;
    }

    /**
     * The column <code>book.authority_token.id</code>. 主键
     */
    public final TableField<AuthorityTokenRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>book.authority_token.target_id</code>. 鉴权主体id
     */
    public final TableField<AuthorityTokenRecord, Long> TARGET_ID = createField("target_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "鉴权主体id");

    /**
     * The column <code>book.authority_token.target</code>. 鉴权登录对象：会员；平台；
     */
    public final TableField<AuthorityTokenRecord, AuthorityTokenTarget> TARGET = createField("target", org.jooq.impl.SQLDataType.VARCHAR(8).nullable(false).asEnumDataType(com.book.core.domain.enums.AuthorityTokenTarget.class), this, "鉴权登录对象：会员；平台；");

    /**
     * The column <code>book.authority_token.client_id</code>. 鉴权客户端id
     */
    public final TableField<AuthorityTokenRecord, Long> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "鉴权客户端id");

    /**
     * The column <code>book.authority_token.access_ip</code>. 创建ip
     */
    public final TableField<AuthorityTokenRecord, String> ACCESS_IP = createField("access_ip", org.jooq.impl.SQLDataType.VARCHAR(255), this, "创建ip");

    /**
     * The column <code>book.authority_token.expire_time</code>. 过期时间
     */
    public final TableField<AuthorityTokenRecord, Timestamp> EXPIRE_TIME = createField("expire_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "过期时间");

    /**
     * The column <code>book.authority_token.code</code>. token串
     */
    public final TableField<AuthorityTokenRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(255), this, "token串");

    /**
     * The column <code>book.authority_token.create_at</code>. 创建时间
     */
    public final TableField<AuthorityTokenRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>book.authority_token.update_at</code>. 更新时间
     */
    public final TableField<AuthorityTokenRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>book.authority_token.remark</code>. 备注
     */
    public final TableField<AuthorityTokenRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注");

    /**
     * The column <code>book.authority_token.del_flag</code>. 删除标记
     */
    public final TableField<AuthorityTokenRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");

    /**
     * The column <code>book.authority_token.version</code>. 版本号
     */
    public final TableField<AuthorityTokenRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "版本号");

    /**
     * Create a <code>book.authority_token</code> table reference
     */
    public AuthorityToken() {
        this(DSL.name("authority_token"), null);
    }

    /**
     * Create an aliased <code>book.authority_token</code> table reference
     */
    public AuthorityToken(String alias) {
        this(DSL.name(alias), AUTHORITY_TOKEN);
    }

    /**
     * Create an aliased <code>book.authority_token</code> table reference
     */
    public AuthorityToken(Name alias) {
        this(alias, AUTHORITY_TOKEN);
    }

    private AuthorityToken(Name alias, Table<AuthorityTokenRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuthorityToken(Name alias, Table<AuthorityTokenRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "鉴权登录表");
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
        return Arrays.<Index>asList(Indexes.AUTHORITY_TOKEN_INDEX_CODE, Indexes.AUTHORITY_TOKEN_INDEX_TARGET_ID_TARGET, Indexes.AUTHORITY_TOKEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AuthorityTokenRecord, Long> getIdentity() {
        return Keys.IDENTITY_AUTHORITY_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AuthorityTokenRecord> getPrimaryKey() {
        return Keys.KEY_AUTHORITY_TOKEN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AuthorityTokenRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthorityTokenRecord>>asList(Keys.KEY_AUTHORITY_TOKEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<AuthorityTokenRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityToken as(String alias) {
        return new AuthorityToken(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityToken as(Name alias) {
        return new AuthorityToken(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuthorityToken rename(String name) {
        return new AuthorityToken(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuthorityToken rename(Name name) {
        return new AuthorityToken(name, null);
    }
}
