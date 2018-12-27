/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.tables;


import com.book.core.domain.Book;
import com.book.core.domain.Indexes;
import com.book.core.domain.Keys;
import com.book.core.domain.tables.records.BookThirdCopyrightChapterRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 第三方版权书籍章节表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class BookThirdCopyrightChapter extends TableImpl<BookThirdCopyrightChapterRecord> {

    private static final long serialVersionUID = -1733994497;

    /**
     * The reference instance of <code>book.book_third_copyright_chapter</code>
     */
    public static final BookThirdCopyrightChapter BOOK_THIRD_COPYRIGHT_CHAPTER = new BookThirdCopyrightChapter();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BookThirdCopyrightChapterRecord> getRecordType() {
        return BookThirdCopyrightChapterRecord.class;
    }

    /**
     * The column <code>book.book_third_copyright_chapter.id</code>. 主键
     */
    public final TableField<BookThirdCopyrightChapterRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>book.book_third_copyright_chapter.book_id</code>. 书本id
     */
    public final TableField<BookThirdCopyrightChapterRecord, Long> BOOK_ID = createField("book_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "书本id");

    /**
     * The column <code>book.book_third_copyright_chapter.chapter_title</code>. 章节名
     */
    public final TableField<BookThirdCopyrightChapterRecord, String> CHAPTER_TITLE = createField("chapter_title", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "章节名");

    /**
     * The column <code>book.book_third_copyright_chapter.chapter_content</code>. 章节内容
     */
    public final TableField<BookThirdCopyrightChapterRecord, String> CHAPTER_CONTENT = createField("chapter_content", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "章节内容");

    /**
     * The column <code>book.book_third_copyright_chapter.create_at</code>. 创建时间
     */
    public final TableField<BookThirdCopyrightChapterRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>book.book_third_copyright_chapter.update_at</code>. 更新时间
     */
    public final TableField<BookThirdCopyrightChapterRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>book.book_third_copyright_chapter.remark</code>. 备注
     */
    public final TableField<BookThirdCopyrightChapterRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注");

    /**
     * The column <code>book.book_third_copyright_chapter.del_flag</code>. 删除标记
     */
    public final TableField<BookThirdCopyrightChapterRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");

    /**
     * The column <code>book.book_third_copyright_chapter.version</code>. 版本号
     */
    public final TableField<BookThirdCopyrightChapterRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "版本号");

    /**
     * Create a <code>book.book_third_copyright_chapter</code> table reference
     */
    public BookThirdCopyrightChapter() {
        this(DSL.name("book_third_copyright_chapter"), null);
    }

    /**
     * Create an aliased <code>book.book_third_copyright_chapter</code> table reference
     */
    public BookThirdCopyrightChapter(String alias) {
        this(DSL.name(alias), BOOK_THIRD_COPYRIGHT_CHAPTER);
    }

    /**
     * Create an aliased <code>book.book_third_copyright_chapter</code> table reference
     */
    public BookThirdCopyrightChapter(Name alias) {
        this(alias, BOOK_THIRD_COPYRIGHT_CHAPTER);
    }

    private BookThirdCopyrightChapter(Name alias, Table<BookThirdCopyrightChapterRecord> aliased) {
        this(alias, aliased, null);
    }

    private BookThirdCopyrightChapter(Name alias, Table<BookThirdCopyrightChapterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "第三方版权书籍章节表");
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
        return Arrays.<Index>asList(Indexes.BOOK_THIRD_COPYRIGHT_CHAPTER_PRIMARY, Indexes.BOOK_THIRD_COPYRIGHT_CHAPTER_UNIQUE_BOOK_CHAPTER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BookThirdCopyrightChapterRecord, Long> getIdentity() {
        return Keys.IDENTITY_BOOK_THIRD_COPYRIGHT_CHAPTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BookThirdCopyrightChapterRecord> getPrimaryKey() {
        return Keys.KEY_BOOK_THIRD_COPYRIGHT_CHAPTER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BookThirdCopyrightChapterRecord>> getKeys() {
        return Arrays.<UniqueKey<BookThirdCopyrightChapterRecord>>asList(Keys.KEY_BOOK_THIRD_COPYRIGHT_CHAPTER_PRIMARY, Keys.KEY_BOOK_THIRD_COPYRIGHT_CHAPTER_UNIQUE_BOOK_CHAPTER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<BookThirdCopyrightChapterRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookThirdCopyrightChapter as(String alias) {
        return new BookThirdCopyrightChapter(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookThirdCopyrightChapter as(Name alias) {
        return new BookThirdCopyrightChapter(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BookThirdCopyrightChapter rename(String name) {
        return new BookThirdCopyrightChapter(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BookThirdCopyrightChapter rename(Name name) {
        return new BookThirdCopyrightChapter(name, null);
    }
}
