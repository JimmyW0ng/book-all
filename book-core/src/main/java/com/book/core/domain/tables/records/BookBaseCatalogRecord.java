/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.tables.records;


import com.book.core.domain.enums.BookBaseCatalogSource;
import com.book.core.domain.tables.BookBaseCatalog;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 书籍目录表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class BookBaseCatalogRecord extends UpdatableRecordImpl<BookBaseCatalogRecord> implements Record11<Long, Long, String, Boolean, BookBaseCatalogSource, Long, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = -1427614041;

    /**
     * Setter for <code>book.book_base_catalog.id</code>. 主键
     */
    public BookBaseCatalogRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Create a detached BookBaseCatalogRecord
     */
    public BookBaseCatalogRecord() {
        super(BookBaseCatalog.BOOK_BASE_CATALOG);
    }

    /**
     * Create a detached, initialised BookBaseCatalogRecord
     */
    public BookBaseCatalogRecord(Long id, Long bookId, String chapterTitle, Boolean freeFlag, BookBaseCatalogSource source, Long sourceDetailId, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(BookBaseCatalog.BOOK_BASE_CATALOG);

        set(0, id);
        set(1, bookId);
        set(2, chapterTitle);
        set(3, freeFlag);
        set(4, source);
        set(5, sourceDetailId);
        set(6, createAt);
        set(7, updateAt);
        set(8, remark);
        set(9, delFlag);
        set(10, version);
    }

    /**
     * Getter for <code>book.book_base_catalog.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>book.book_base_catalog.chapter_title</code>. 章节名
     */
    public BookBaseCatalogRecord setChapterTitle(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>book.book_base_catalog.book_id</code>. 书籍id
     */
    public Long getBookId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>book.book_base_catalog.free_flag</code>. 免费标记
     */
    public BookBaseCatalogRecord setFreeFlag(Boolean value) {
        set(3, value);
        return this;
    }

    /**
     * Setter for <code>book.book_base_catalog.book_id</code>. 书籍id
     */
    public BookBaseCatalogRecord setBookId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Setter for <code>book.book_base_catalog.source</code>. 来源：爬虫；第三方版权；
     */
    public BookBaseCatalogRecord setSource(BookBaseCatalogSource value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>book.book_base_catalog.chapter_title</code>. 章节名
     */
    public String getChapterTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>book.book_base_catalog.source_detail_id</code>. 来源章节id
     */
    public BookBaseCatalogRecord setSourceDetailId(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>book.book_base_catalog.free_flag</code>. 免费标记
     */
    public Boolean getFreeFlag() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>book.book_base_catalog.create_at</code>. 创建时间
     */
    public BookBaseCatalogRecord setCreateAt(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>book.book_base_catalog.source</code>. 来源：爬虫；第三方版权；
     */
    public BookBaseCatalogSource getSource() {
        return (BookBaseCatalogSource) get(4);
    }

    /**
     * Setter for <code>book.book_base_catalog.update_at</code>. 更新时间
     */
    public BookBaseCatalogRecord setUpdateAt(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>book.book_base_catalog.source_detail_id</code>. 来源章节id
     */
    public Long getSourceDetailId() {
        return (Long) get(5);
    }

    /**
     * Getter for <code>book.book_base_catalog.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(6);
    }

    /**
     * Getter for <code>book.book_base_catalog.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(8);
    }

    /**
     * Getter for <code>book.book_base_catalog.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(7);
    }

    /**
     * Getter for <code>book.book_base_catalog.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>book.book_base_catalog.remark</code>. 备注
     */
    public BookBaseCatalogRecord setRemark(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>book.book_base_catalog.version</code>. 版本号
     */
    public Long getVersion() {
        return (Long) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Long, String, Boolean, BookBaseCatalogSource, Long, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Long, String, Boolean, BookBaseCatalogSource, Long, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return BookBaseCatalog.BOOK_BASE_CATALOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return BookBaseCatalog.BOOK_BASE_CATALOG.BOOK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BookBaseCatalog.BOOK_BASE_CATALOG.CHAPTER_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return BookBaseCatalog.BOOK_BASE_CATALOG.FREE_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BookBaseCatalogSource> field5() {
        return BookBaseCatalog.BOOK_BASE_CATALOG.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return BookBaseCatalog.BOOK_BASE_CATALOG.SOURCE_DETAIL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return BookBaseCatalog.BOOK_BASE_CATALOG.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return BookBaseCatalog.BOOK_BASE_CATALOG.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return BookBaseCatalog.BOOK_BASE_CATALOG.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return BookBaseCatalog.BOOK_BASE_CATALOG.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return BookBaseCatalog.BOOK_BASE_CATALOG.VERSION;
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
        return getBookId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getChapterTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getFreeFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseCatalogSource component5() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getSourceDetailId();
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
    public String component9() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
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
        return getBookId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getChapterTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getFreeFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseCatalogSource value5() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getSourceDetailId();
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
    public String value9() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseCatalogRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseCatalogRecord value2(Long value) {
        setBookId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseCatalogRecord value3(String value) {
        setChapterTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseCatalogRecord value4(Boolean value) {
        setFreeFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseCatalogRecord value5(BookBaseCatalogSource value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseCatalogRecord value6(Long value) {
        setSourceDetailId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseCatalogRecord value7(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseCatalogRecord value8(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseCatalogRecord value9(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseCatalogRecord value10(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseCatalogRecord value11(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseCatalogRecord values(Long value1, Long value2, String value3, Boolean value4, BookBaseCatalogSource value5, Long value6, Timestamp value7, Timestamp value8, String value9, Boolean value10, Long value11) {
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
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>book.book_base_catalog.del_flag</code>. 删除标记
     */
    public BookBaseCatalogRecord setDelFlag(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Setter for <code>book.book_base_catalog.version</code>. 版本号
     */
    public BookBaseCatalogRecord setVersion(Long value) {
        set(10, value);
        return this;
    }
}
