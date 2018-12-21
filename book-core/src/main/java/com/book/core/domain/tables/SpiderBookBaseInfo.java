/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.tables;


import com.book.core.domain.Book;
import com.book.core.domain.Indexes;
import com.book.core.domain.Keys;
import com.book.core.domain.tables.records.SpiderBookBaseInfoRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 爬虫-图书基础信息表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class SpiderBookBaseInfo extends TableImpl<SpiderBookBaseInfoRecord> {

    /**
     * The reference instance of <code>book.spider_book_base_info</code>
     */
    public static final SpiderBookBaseInfo SPIDER_BOOK_BASE_INFO = new SpiderBookBaseInfo();
    private static final long serialVersionUID = -1353099126;
    /**
     * The column <code>book.spider_book_base_info.id</code>. 主键
     */
    public final TableField<SpiderBookBaseInfoRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");
    /**
     * The column <code>book.spider_book_base_info.author_id</code>. 作者id
     */
    public final TableField<SpiderBookBaseInfoRecord, Long> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "作者id");
    /**
     * The column <code>book.spider_book_base_info.title</code>. 书名
     */
    public final TableField<SpiderBookBaseInfoRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "书名");
    /**
     * The column <code>book.spider_book_base_info.url</code>. 来源链接
     */
    public final TableField<SpiderBookBaseInfoRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(255), this, "来源链接");
    /**
     * The column <code>book.spider_book_base_info.short_desc</code>. 简介
     */
    public final TableField<SpiderBookBaseInfoRecord, String> SHORT_DESC = createField("short_desc", org.jooq.impl.SQLDataType.CLOB, this, "简介");
    /**
     * The column <code>book.spider_book_base_info.img_cover</code>. 封面图片
     */
    public final TableField<SpiderBookBaseInfoRecord, String> IMG_COVER = createField("img_cover", org.jooq.impl.SQLDataType.CLOB, this, "封面图片");
    /**
     * The column <code>book.spider_book_base_info.create_at</code>. 创建时间
     */
    public final TableField<SpiderBookBaseInfoRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");
    /**
     * The column <code>book.spider_book_base_info.update_at</code>. 更新时间
     */
    public final TableField<SpiderBookBaseInfoRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");
    /**
     * The column <code>book.spider_book_base_info.remark</code>. 备注
     */
    public final TableField<SpiderBookBaseInfoRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注");
    /**
     * The column <code>book.spider_book_base_info.del_flag</code>. 删除标记
     */
    public final TableField<SpiderBookBaseInfoRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");
    /**
     * The column <code>book.spider_book_base_info.version</code>. 版本号
     */
    public final TableField<SpiderBookBaseInfoRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "版本号");

    /**
     * Create a <code>book.spider_book_base_info</code> table reference
     */
    public SpiderBookBaseInfo() {
        this(DSL.name("spider_book_base_info"), null);
    }

    /**
     * Create an aliased <code>book.spider_book_base_info</code> table reference
     */
    public SpiderBookBaseInfo(String alias) {
        this(DSL.name(alias), SPIDER_BOOK_BASE_INFO);
    }

    /**
     * Create an aliased <code>book.spider_book_base_info</code> table reference
     */
    public SpiderBookBaseInfo(Name alias) {
        this(alias, SPIDER_BOOK_BASE_INFO);
    }

    private SpiderBookBaseInfo(Name alias, Table<SpiderBookBaseInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private SpiderBookBaseInfo(Name alias, Table<SpiderBookBaseInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "爬虫-图书基础信息表");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpiderBookBaseInfoRecord> getRecordType() {
        return SpiderBookBaseInfoRecord.class;
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
        return Arrays.<Index>asList(Indexes.SPIDER_BOOK_BASE_INFO_PRIMARY, Indexes.SPIDER_BOOK_BASE_INFO_UNIQ_AUTHORID_TITLE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SpiderBookBaseInfoRecord, Long> getIdentity() {
        return Keys.IDENTITY_SPIDER_BOOK_BASE_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SpiderBookBaseInfoRecord> getPrimaryKey() {
        return Keys.KEY_SPIDER_BOOK_BASE_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SpiderBookBaseInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<SpiderBookBaseInfoRecord>>asList(Keys.KEY_SPIDER_BOOK_BASE_INFO_PRIMARY, Keys.KEY_SPIDER_BOOK_BASE_INFO_UNIQ_AUTHORID_TITLE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<SpiderBookBaseInfoRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpiderBookBaseInfo as(String alias) {
        return new SpiderBookBaseInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpiderBookBaseInfo as(Name alias) {
        return new SpiderBookBaseInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SpiderBookBaseInfo rename(String name) {
        return new SpiderBookBaseInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SpiderBookBaseInfo rename(Name name) {
        return new SpiderBookBaseInfo(name, null);
    }
}
