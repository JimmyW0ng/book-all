/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.tables.records;


import com.book.core.domain.tables.BookThirdCopyrightInfo;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 第三方版权书籍基础信息表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class BookThirdCopyrightInfoRecord extends UpdatableRecordImpl<BookThirdCopyrightInfoRecord> implements Record13<Long, String, String, String, String, String, String, String, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = 1929818036;

    /**
     * Create a detached BookThirdCopyrightInfoRecord
     */
    public BookThirdCopyrightInfoRecord() {
        super(BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO);
    }

    /**
     * Create a detached, initialised BookThirdCopyrightInfoRecord
     */
    public BookThirdCopyrightInfoRecord(Long id, String authorName, String title, String tag, String copyrightName, String url, String shortDesc, String imgCover, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO);

        set(0, id);
        set(1, authorName);
        set(2, title);
        set(3, tag);
        set(4, copyrightName);
        set(5, url);
        set(6, shortDesc);
        set(7, imgCover);
        set(8, createAt);
        set(9, updateAt);
        set(10, remark);
        set(11, delFlag);
        set(12, version);
    }

    /**
     * Getter for <code>book.book_third_copyright_info.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>book.book_third_copyright_info.id</code>. 主键
     */
    public BookThirdCopyrightInfoRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>book.book_third_copyright_info.author_name</code>. 作者
     */
    public String getAuthorName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>book.book_third_copyright_info.author_name</code>. 作者
     */
    public BookThirdCopyrightInfoRecord setAuthorName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>book.book_third_copyright_info.title</code>. 书名
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>book.book_third_copyright_info.title</code>. 书名
     */
    public BookThirdCopyrightInfoRecord setTitle(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>book.book_third_copyright_info.tag</code>. 分类标签
     */
    public String getTag() {
        return (String) get(3);
    }

    /**
     * Setter for <code>book.book_third_copyright_info.tag</code>. 分类标签
     */
    public BookThirdCopyrightInfoRecord setTag(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>book.book_third_copyright_info.copyright_name</code>. 版权方
     */
    public String getCopyrightName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>book.book_third_copyright_info.copyright_name</code>. 版权方
     */
    public BookThirdCopyrightInfoRecord setCopyrightName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>book.book_third_copyright_info.url</code>. 来源链接
     */
    public String getUrl() {
        return (String) get(5);
    }

    /**
     * Setter for <code>book.book_third_copyright_info.url</code>. 来源链接
     */
    public BookThirdCopyrightInfoRecord setUrl(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>book.book_third_copyright_info.short_desc</code>. 简介
     */
    public String getShortDesc() {
        return (String) get(6);
    }

    /**
     * Setter for <code>book.book_third_copyright_info.short_desc</code>. 简介
     */
    public BookThirdCopyrightInfoRecord setShortDesc(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>book.book_third_copyright_info.img_cover</code>. 封面图片
     */
    public String getImgCover() {
        return (String) get(7);
    }

    /**
     * Setter for <code>book.book_third_copyright_info.img_cover</code>. 封面图片
     */
    public BookThirdCopyrightInfoRecord setImgCover(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>book.book_third_copyright_info.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>book.book_third_copyright_info.create_at</code>. 创建时间
     */
    public BookThirdCopyrightInfoRecord setCreateAt(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>book.book_third_copyright_info.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>book.book_third_copyright_info.update_at</code>. 更新时间
     */
    public BookThirdCopyrightInfoRecord setUpdateAt(Timestamp value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>book.book_third_copyright_info.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(10);
    }

    /**
     * Setter for <code>book.book_third_copyright_info.remark</code>. 备注
     */
    public BookThirdCopyrightInfoRecord setRemark(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>book.book_third_copyright_info.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>book.book_third_copyright_info.del_flag</code>. 删除标记
     */
    public BookThirdCopyrightInfoRecord setDelFlag(Boolean value) {
        set(11, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>book.book_third_copyright_info.version</code>. 版本号
     */
    public Long getVersion() {
        return (Long) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>book.book_third_copyright_info.version</code>. 版本号
     */
    public BookThirdCopyrightInfoRecord setVersion(Long value) {
        set(12, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, String, String, String, String, String, String, String, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, String, String, String, String, String, String, String, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO.AUTHOR_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO.TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO.COPYRIGHT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO.SHORT_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO.IMG_COVER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO.VERSION;
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
    public String component2() {
        return getAuthorName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCopyrightName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getShortDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getImgCover();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component13() {
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
    public String value2() {
        return getAuthorName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCopyrightName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getShortDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getImgCover();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookThirdCopyrightInfoRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookThirdCopyrightInfoRecord value2(String value) {
        setAuthorName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookThirdCopyrightInfoRecord value3(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookThirdCopyrightInfoRecord value4(String value) {
        setTag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookThirdCopyrightInfoRecord value5(String value) {
        setCopyrightName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookThirdCopyrightInfoRecord value6(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookThirdCopyrightInfoRecord value7(String value) {
        setShortDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookThirdCopyrightInfoRecord value8(String value) {
        setImgCover(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookThirdCopyrightInfoRecord value9(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookThirdCopyrightInfoRecord value10(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookThirdCopyrightInfoRecord value11(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookThirdCopyrightInfoRecord value12(Boolean value) {
        setDelFlag(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public BookThirdCopyrightInfoRecord value13(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookThirdCopyrightInfoRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, Timestamp value9, Timestamp value10, String value11, Boolean value12, Long value13) {
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
        value13(value13);
        return this;
    }
}
