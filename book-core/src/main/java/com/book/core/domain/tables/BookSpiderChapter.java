/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.tables;


import com.book.core.domain.Book;
import com.book.core.domain.Indexes;
import com.book.core.domain.Keys;
import com.book.core.domain.tables.records.BookSpiderChapterRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 爬虫书籍章节表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class BookSpiderChapter extends TableImpl<BookSpiderChapterRecord> {

    private static final long serialVersionUID = 1371224167;

    /**
     * The reference instance of <code>book.book_spider_chapter</code>
     */
    public static final BookSpiderChapter BOOK_SPIDER_CHAPTER = new BookSpiderChapter();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BookSpiderChapterRecord> getRecordType() {
        return BookSpiderChapterRecord.class;
    }

    /**
     * The column <code>book.book_spider_chapter.id</code>. 主键
     */
    public final TableField<BookSpiderChapterRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>book.book_spider_chapter.book_id</code>. 书本id
     */
    public final TableField<BookSpiderChapterRecord, Long> BOOK_ID = createField("book_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "书本id");

    /**
     * The column <code>book.book_spider_chapter.chapter_title</code>. 章节名
     */
    public final TableField<BookSpiderChapterRecord, String> CHAPTER_TITLE = createField("chapter_title", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "章节名");

    /**
     * The column <code>book.book_spider_chapter.chapter_content</code>. 章节内容
     */
    public final TableField<BookSpiderChapterRecord, String> CHAPTER_CONTENT = createField("chapter_content", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "章节内容");

    /**
     * The column <code>book.book_spider_chapter.create_at</code>. 创建时间
     */
    public final TableField<BookSpiderChapterRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>book.book_spider_chapter.update_at</code>. 更新时间
     */
    public final TableField<BookSpiderChapterRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>book.book_spider_chapter.remark</code>. 备注
     */
    public final TableField<BookSpiderChapterRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注");

    /**
     * The column <code>book.book_spider_chapter.del_flag</code>. 删除标记
     */
    public final TableField<BookSpiderChapterRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");

    /**
     * The column <code>book.book_spider_chapter.version</code>. 版本号
     */
    public final TableField<BookSpiderChapterRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "版本号");

    /**
     * Create a <code>book.book_spider_chapter</code> table reference
     */
    public BookSpiderChapter() {
        this(DSL.name("book_spider_chapter"), null);
    }

    /**
     * Create an aliased <code>book.book_spider_chapter</code> table reference
     */
    public BookSpiderChapter(String alias) {
        this(DSL.name(alias), BOOK_SPIDER_CHAPTER);
    }

    /**
     * Create an aliased <code>book.book_spider_chapter</code> table reference
     */
    public BookSpiderChapter(Name alias) {
        this(alias, BOOK_SPIDER_CHAPTER);
    }

    private BookSpiderChapter(Name alias, Table<BookSpiderChapterRecord> aliased) {
        this(alias, aliased, null);
    }

    private BookSpiderChapter(Name alias, Table<BookSpiderChapterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "爬虫书籍章节表");
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
        return Arrays.<Index>asList(Indexes.BOOK_SPIDER_CHAPTER_PRIMARY, Indexes.BOOK_SPIDER_CHAPTER_UNIQUE_BOOK_CHAPTER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BookSpiderChapterRecord, Long> getIdentity() {
        return Keys.IDENTITY_BOOK_SPIDER_CHAPTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BookSpiderChapterRecord> getPrimaryKey() {
        return Keys.KEY_BOOK_SPIDER_CHAPTER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BookSpiderChapterRecord>> getKeys() {
        return Arrays.<UniqueKey<BookSpiderChapterRecord>>asList(Keys.KEY_BOOK_SPIDER_CHAPTER_PRIMARY, Keys.KEY_BOOK_SPIDER_CHAPTER_UNIQUE_BOOK_CHAPTER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<BookSpiderChapterRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookSpiderChapter as(String alias) {
        return new BookSpiderChapter(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookSpiderChapter as(Name alias) {
        return new BookSpiderChapter(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BookSpiderChapter rename(String name) {
        return new BookSpiderChapter(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BookSpiderChapter rename(Name name) {
        return new BookSpiderChapter(name, null);
    }
}
