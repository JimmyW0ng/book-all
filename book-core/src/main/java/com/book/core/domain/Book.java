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

    private static final long serialVersionUID = -673335873;

    /**
     * The reference instance of <code>book</code>
     */
    public static final Book BOOK = new Book();

    /**
     * 鉴权客户端表
     */
    public final AuthorityClient AUTHORITY_CLIENT = com.book.core.domain.tables.AuthorityClient.AUTHORITY_CLIENT;

    /**
     * 鉴权登录表
     */
    public final AuthorityToken AUTHORITY_TOKEN = com.book.core.domain.tables.AuthorityToken.AUTHORITY_TOKEN;

    /**
     * 书籍目录表
     */
    public final BookBaseCatalog BOOK_BASE_CATALOG = com.book.core.domain.tables.BookBaseCatalog.BOOK_BASE_CATALOG;

    /**
     * 书籍分类表
     */
    public final BookBaseClassification BOOK_BASE_CLASSIFICATION = com.book.core.domain.tables.BookBaseClassification.BOOK_BASE_CLASSIFICATION;

    /**
     * 书籍基础信息表
     */
    public final BookBaseInfo BOOK_BASE_INFO = com.book.core.domain.tables.BookBaseInfo.BOOK_BASE_INFO;

    /**
     * 爬虫书籍章节表
     */
    public final BookSpiderChapter BOOK_SPIDER_CHAPTER = com.book.core.domain.tables.BookSpiderChapter.BOOK_SPIDER_CHAPTER;

    /**
     * 爬虫书籍基础信息表
     */
    public final BookSpiderInfo BOOK_SPIDER_INFO = com.book.core.domain.tables.BookSpiderInfo.BOOK_SPIDER_INFO;

    /**
     * 第三方版权书籍章节表
     */
    public final BookThirdCopyrightChapter BOOK_THIRD_COPYRIGHT_CHAPTER = com.book.core.domain.tables.BookThirdCopyrightChapter.BOOK_THIRD_COPYRIGHT_CHAPTER;

    /**
     * 第三方版权书籍基础信息表
     */
    public final BookThirdCopyrightInfo BOOK_THIRD_COPYRIGHT_INFO = com.book.core.domain.tables.BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO;

    /**
     * 会员基础信息表
     */
    public final MemberBaseInfo MEMBER_BASE_INFO = com.book.core.domain.tables.MemberBaseInfo.MEMBER_BASE_INFO;

    /**
     * 会员推荐表
     */
    public final MemberBaseRefer MEMBER_BASE_REFER = com.book.core.domain.tables.MemberBaseRefer.MEMBER_BASE_REFER;

    /**
     * 会员书籍收藏表
     */
    public final MemberBookCollection MEMBER_BOOK_COLLECTION = com.book.core.domain.tables.MemberBookCollection.MEMBER_BOOK_COLLECTION;

    /**
     * 会员书籍阅读日志表
     */
    public final MemberBookReadLog MEMBER_BOOK_READ_LOG = com.book.core.domain.tables.MemberBookReadLog.MEMBER_BOOK_READ_LOG;

    /**
     * 会员资金余额表
     */
    public final MemberCapitalBalance MEMBER_CAPITAL_BALANCE = com.book.core.domain.tables.MemberCapitalBalance.MEMBER_CAPITAL_BALANCE;

    /**
     * 会员资金流水表
     */
    public final MemberCapitalInOutLog MEMBER_CAPITAL_IN_OUT_LOG = com.book.core.domain.tables.MemberCapitalInOutLog.MEMBER_CAPITAL_IN_OUT_LOG;

    /**
     * 会员资金充值记录表
     */
    public final MemberCapitalRechargeLog MEMBER_CAPITAL_RECHARGE_LOG = com.book.core.domain.tables.MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG;

    /**
     * 会员虚拟币余额表
     */
    public final MemberCoinBalance MEMBER_COIN_BALANCE = com.book.core.domain.tables.MemberCoinBalance.MEMBER_COIN_BALANCE;

    /**
     * 会员虚拟币流水表
     */
    public final MemberCoinInOutLog MEMBER_COIN_IN_OUT_LOG = com.book.core.domain.tables.MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG;

    /**
     * 会员虚拟币返利计划表
     */
    public final MemberCoinRebatePlan MEMBER_COIN_REBATE_PLAN = com.book.core.domain.tables.MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN;

    /**
     * 会员虚拟币提现记录表
     */
    public final MemberCoinWithdrawLog MEMBER_COIN_WITHDRAW_LOG = com.book.core.domain.tables.MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG;

    /**
     * 会员vip购买记录表
     */
    public final MemberVipLog MEMBER_VIP_LOG = com.book.core.domain.tables.MemberVipLog.MEMBER_VIP_LOG;

    /**
     * 消息-验证码表
     */
    public final MessageCaptcha MESSAGE_CAPTCHA = com.book.core.domain.tables.MessageCaptcha.MESSAGE_CAPTCHA;

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
                AuthorityClient.AUTHORITY_CLIENT,
                AuthorityToken.AUTHORITY_TOKEN,
                BookBaseCatalog.BOOK_BASE_CATALOG,
                BookBaseClassification.BOOK_BASE_CLASSIFICATION,
                BookBaseInfo.BOOK_BASE_INFO,
                BookSpiderChapter.BOOK_SPIDER_CHAPTER,
                BookSpiderInfo.BOOK_SPIDER_INFO,
                BookThirdCopyrightChapter.BOOK_THIRD_COPYRIGHT_CHAPTER,
                BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO,
                MemberBaseInfo.MEMBER_BASE_INFO,
                MemberBaseRefer.MEMBER_BASE_REFER,
                MemberBookCollection.MEMBER_BOOK_COLLECTION,
                MemberBookReadLog.MEMBER_BOOK_READ_LOG,
                MemberCapitalBalance.MEMBER_CAPITAL_BALANCE,
                MemberCapitalInOutLog.MEMBER_CAPITAL_IN_OUT_LOG,
                MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG,
                MemberCoinBalance.MEMBER_COIN_BALANCE,
                MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG,
                MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN,
                MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG,
                MemberVipLog.MEMBER_VIP_LOG,
                MessageCaptcha.MESSAGE_CAPTCHA);
    }
}
