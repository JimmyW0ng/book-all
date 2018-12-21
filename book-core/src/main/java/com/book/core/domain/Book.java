/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain;


import com.book.core.domain.tables.*;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Book extends SchemaImpl {

    private static final long serialVersionUID = 1910755229;

    /**
     * The reference instance of <code>book</code>
     */
    public static final Book BOOK = new Book();

    /**
     * 会员-基础信息表
     */
    public final MemberBaseInfo MEMBER_BASE_INFO = com.book.core.domain.tables.MemberBaseInfo.MEMBER_BASE_INFO;

    /**
     * 消息-验证码表
     */
    public final MessageCaptcha MESSAGE_CAPTCHA = com.book.core.domain.tables.MessageCaptcha.MESSAGE_CAPTCHA;

    /**
     * 爬虫-作者基础信息表
     */
    public final SpiderAuthorBaseInfo SPIDER_AUTHOR_BASE_INFO = com.book.core.domain.tables.SpiderAuthorBaseInfo.SPIDER_AUTHOR_BASE_INFO;

    /**
     * 爬虫-图书基础信息表
     */
    public final SpiderBookBaseInfo SPIDER_BOOK_BASE_INFO = com.book.core.domain.tables.SpiderBookBaseInfo.SPIDER_BOOK_BASE_INFO;

    /**
     * 爬虫-图书内容
     */
    public final SpiderBookDetailInfo SPIDER_BOOK_DETAIL_INFO = com.book.core.domain.tables.SpiderBookDetailInfo.SPIDER_BOOK_DETAIL_INFO;

    /**
     * No further instances allowed
     */
    private Book() {
        super("book", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
                MemberBaseInfo.MEMBER_BASE_INFO,
                MessageCaptcha.MESSAGE_CAPTCHA,
                SpiderAuthorBaseInfo.SPIDER_AUTHOR_BASE_INFO,
                SpiderBookBaseInfo.SPIDER_BOOK_BASE_INFO,
                SpiderBookDetailInfo.SPIDER_BOOK_DETAIL_INFO);
    }
}
