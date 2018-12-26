/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.tables.records;


import com.book.core.domain.tables.SpiderBookBaseInfo;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


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
public class SpiderBookBaseInfoRecord extends UpdatableRecordImpl<SpiderBookBaseInfoRecord> implements Record11<Long, Long, String, String, String, String, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = -1256173163;

    /**
     * Setter for <code>book.spider_book_base_info.id</code>. 主键
     */
    public SpiderBookBaseInfoRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Create a detached SpiderBookBaseInfoRecord
     */
    public SpiderBookBaseInfoRecord() {
        super(SpiderBookBaseInfo.SPIDER_BOOK_BASE_INFO);
    }

    /**
     * Setter for <code>book.spider_book_base_info.author_id</code>. 作者id
     */
    public SpiderBookBaseInfoRecord setAuthorId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Create a detached, initialised SpiderBookBaseInfoRecord
     */
    public SpiderBookBaseInfoRecord(Long id, Long authorId, String title, String url, String shortDesc, String imgCover, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(SpiderBookBaseInfo.SPIDER_BOOK_BASE_INFO);

        set(0, id);
        set(1, authorId);
        set(2, title);
        set(3, url);
        set(4, shortDesc);
        set(5, imgCover);
        set(6, createAt);
        set(7, updateAt);
        set(8, remark);
        set(9, delFlag);
        set(10, version);
    }

    /**
     * Setter for <code>book.spider_book_base_info.title</code>. 书名
     */
    public SpiderBookBaseInfoRecord setTitle(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>book.spider_book_base_info.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>book.spider_book_base_info.url</code>. 来源链接
     */
    public SpiderBookBaseInfoRecord setUrl(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>book.spider_book_base_info.author_id</code>. 作者id
     */
    public Long getAuthorId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>book.spider_book_base_info.short_desc</code>. 简介
     */
    public SpiderBookBaseInfoRecord setShortDesc(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>book.spider_book_base_info.title</code>. 书名
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>book.spider_book_base_info.img_cover</code>. 封面图片
     */
    public SpiderBookBaseInfoRecord setImgCover(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>book.spider_book_base_info.url</code>. 来源链接
     */
    public String getUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>book.spider_book_base_info.create_at</code>. 创建时间
     */
    public SpiderBookBaseInfoRecord setCreateAt(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>book.spider_book_base_info.short_desc</code>. 简介
     */
    public String getShortDesc() {
        return (String) get(4);
    }

    /**
     * Setter for <code>book.spider_book_base_info.update_at</code>. 更新时间
     */
    public SpiderBookBaseInfoRecord setUpdateAt(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>book.spider_book_base_info.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>book.spider_book_base_info.remark</code>. 备注
     */
    public SpiderBookBaseInfoRecord setRemark(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>book.spider_book_base_info.img_cover</code>. 封面图片
     */
    public String getImgCover() {
        return (String) get(5);
    }

    /**
     * Getter for <code>book.spider_book_base_info.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(6);
    }

    /**
     * Getter for <code>book.spider_book_base_info.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(8);
    }

    /**
     * Getter for <code>book.spider_book_base_info.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(9);
    }

    /**
     * Getter for <code>book.spider_book_base_info.version</code>. 版本号
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
    public Row11<Long, Long, String, String, String, String, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Long, String, String, String, String, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return SpiderBookBaseInfo.SPIDER_BOOK_BASE_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return SpiderBookBaseInfo.SPIDER_BOOK_BASE_INFO.AUTHOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SpiderBookBaseInfo.SPIDER_BOOK_BASE_INFO.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SpiderBookBaseInfo.SPIDER_BOOK_BASE_INFO.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SpiderBookBaseInfo.SPIDER_BOOK_BASE_INFO.SHORT_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SpiderBookBaseInfo.SPIDER_BOOK_BASE_INFO.IMG_COVER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return SpiderBookBaseInfo.SPIDER_BOOK_BASE_INFO.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return SpiderBookBaseInfo.SPIDER_BOOK_BASE_INFO.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SpiderBookBaseInfo.SPIDER_BOOK_BASE_INFO.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return SpiderBookBaseInfo.SPIDER_BOOK_BASE_INFO.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return SpiderBookBaseInfo.SPIDER_BOOK_BASE_INFO.VERSION;
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
        return getAuthorId();
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
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getShortDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getImgCover();
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
        return getAuthorId();
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
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getShortDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getImgCover();
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
    public SpiderBookBaseInfoRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpiderBookBaseInfoRecord value2(Long value) {
        setAuthorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpiderBookBaseInfoRecord value3(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpiderBookBaseInfoRecord value4(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpiderBookBaseInfoRecord value5(String value) {
        setShortDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpiderBookBaseInfoRecord value6(String value) {
        setImgCover(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpiderBookBaseInfoRecord value7(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpiderBookBaseInfoRecord value8(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpiderBookBaseInfoRecord value9(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpiderBookBaseInfoRecord value10(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpiderBookBaseInfoRecord value11(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpiderBookBaseInfoRecord values(Long value1, Long value2, String value3, String value4, String value5, String value6, Timestamp value7, Timestamp value8, String value9, Boolean value10, Long value11) {
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
     * Setter for <code>book.spider_book_base_info.del_flag</code>. 删除标记
     */
    public SpiderBookBaseInfoRecord setDelFlag(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Setter for <code>book.spider_book_base_info.version</code>. 版本号
     */
    public SpiderBookBaseInfoRecord setVersion(Long value) {
        set(10, value);
        return this;
    }
}
