/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.tables.records;


import com.book.core.domain.tables.BookBaseInfo;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 书籍基础信息表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class BookBaseInfoRecord extends UpdatableRecordImpl<BookBaseInfoRecord> implements Record12<Long, Long, String, String, Boolean, String, String, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = -1060732808;

    /**
     * Setter for <code>book.book_base_info.id</code>. 主键
     */
    public BookBaseInfoRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Create a detached BookBaseInfoRecord
     */
    public BookBaseInfoRecord() {
        super(BookBaseInfo.BOOK_BASE_INFO);
    }

    /**
     * Setter for <code>book.book_base_info.classification_id</code>. 分类id
     */
    public BookBaseInfoRecord setClassificationId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Create a detached, initialised BookBaseInfoRecord
     */
    public BookBaseInfoRecord(Long id, Long classificationId, String authorName, String title, Boolean endFlag, String shortDesc, String imgCover, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(BookBaseInfo.BOOK_BASE_INFO);

        set(0, id);
        set(1, classificationId);
        set(2, authorName);
        set(3, title);
        set(4, endFlag);
        set(5, shortDesc);
        set(6, imgCover);
        set(7, createAt);
        set(8, updateAt);
        set(9, remark);
        set(10, delFlag);
        set(11, version);
    }

    /**
     * Setter for <code>book.book_base_info.author_name</code>. 作者
     */
    public BookBaseInfoRecord setAuthorName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>book.book_base_info.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>book.book_base_info.title</code>. 书名
     */
    public BookBaseInfoRecord setTitle(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>book.book_base_info.classification_id</code>. 分类id
     */
    public Long getClassificationId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>book.book_base_info.end_flag</code>. 完结标记
     */
    public BookBaseInfoRecord setEndFlag(Boolean value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>book.book_base_info.author_name</code>. 作者
     */
    public String getAuthorName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>book.book_base_info.short_desc</code>. 简介
     */
    public BookBaseInfoRecord setShortDesc(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>book.book_base_info.title</code>. 书名
     */
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>book.book_base_info.img_cover</code>. 封面图片
     */
    public BookBaseInfoRecord setImgCover(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>book.book_base_info.end_flag</code>. 完结标记
     */
    public Boolean getEndFlag() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>book.book_base_info.create_at</code>. 创建时间
     */
    public BookBaseInfoRecord setCreateAt(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>book.book_base_info.short_desc</code>. 简介
     */
    public String getShortDesc() {
        return (String) get(5);
    }

    /**
     * Setter for <code>book.book_base_info.update_at</code>. 更新时间
     */
    public BookBaseInfoRecord setUpdateAt(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>book.book_base_info.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>book.book_base_info.remark</code>. 备注
     */
    public BookBaseInfoRecord setRemark(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>book.book_base_info.img_cover</code>. 封面图片
     */
    public String getImgCover() {
        return (String) get(6);
    }

    /**
     * Getter for <code>book.book_base_info.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(7);
    }

    /**
     * Getter for <code>book.book_base_info.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(9);
    }

    /**
     * Getter for <code>book.book_base_info.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(10);
    }

    /**
     * Getter for <code>book.book_base_info.version</code>. 版本号
     */
    public Long getVersion() {
        return (Long) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Long, String, String, Boolean, String, String, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Long, String, String, Boolean, String, String, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return BookBaseInfo.BOOK_BASE_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return BookBaseInfo.BOOK_BASE_INFO.CLASSIFICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BookBaseInfo.BOOK_BASE_INFO.AUTHOR_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return BookBaseInfo.BOOK_BASE_INFO.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return BookBaseInfo.BOOK_BASE_INFO.END_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return BookBaseInfo.BOOK_BASE_INFO.SHORT_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return BookBaseInfo.BOOK_BASE_INFO.IMG_COVER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return BookBaseInfo.BOOK_BASE_INFO.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return BookBaseInfo.BOOK_BASE_INFO.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return BookBaseInfo.BOOK_BASE_INFO.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return BookBaseInfo.BOOK_BASE_INFO.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return BookBaseInfo.BOOK_BASE_INFO.VERSION;
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
        return getClassificationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getAuthorName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getEndFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getShortDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getImgCover();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component12() {
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
        return getClassificationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAuthorName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getEndFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getShortDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getImgCover();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value12() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseInfoRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseInfoRecord value2(Long value) {
        setClassificationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseInfoRecord value3(String value) {
        setAuthorName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseInfoRecord value4(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseInfoRecord value5(Boolean value) {
        setEndFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseInfoRecord value6(String value) {
        setShortDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseInfoRecord value7(String value) {
        setImgCover(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseInfoRecord value8(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseInfoRecord value9(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseInfoRecord value10(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseInfoRecord value11(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseInfoRecord value12(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookBaseInfoRecord values(Long value1, Long value2, String value3, String value4, Boolean value5, String value6, String value7, Timestamp value8, Timestamp value9, String value10, Boolean value11, Long value12) {
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
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>book.book_base_info.del_flag</code>. 删除标记
     */
    public BookBaseInfoRecord setDelFlag(Boolean value) {
        set(10, value);
        return this;
    }

    /**
     * Setter for <code>book.book_base_info.version</code>. 版本号
     */
    public BookBaseInfoRecord setVersion(Long value) {
        set(11, value);
        return this;
    }
}
