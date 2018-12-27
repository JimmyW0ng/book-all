/*
 * This file is generated by jOOQ.
*/
package com.book.core.domain;


import com.book.core.domain.tables.*;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in book
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Tables {

    /**
     * 鉴权客户端表
     */
    public static final AuthorityClient AUTHORITY_CLIENT = com.book.core.domain.tables.AuthorityClient.AUTHORITY_CLIENT;

    /**
     * 鉴权登录表
     */
    public static final AuthorityToken AUTHORITY_TOKEN = com.book.core.domain.tables.AuthorityToken.AUTHORITY_TOKEN;

    /**
     * 书籍目录表
     */
    public static final BookBaseCatalog BOOK_BASE_CATALOG = com.book.core.domain.tables.BookBaseCatalog.BOOK_BASE_CATALOG;

    /**
     * 书籍分类表
     */
    public static final BookBaseClassification BOOK_BASE_CLASSIFICATION = com.book.core.domain.tables.BookBaseClassification.BOOK_BASE_CLASSIFICATION;

    /**
     * 书籍基础信息表
     */
    public static final BookBaseInfo BOOK_BASE_INFO = com.book.core.domain.tables.BookBaseInfo.BOOK_BASE_INFO;

    /**
     * 爬虫书籍章节表
     */
    public static final BookSpiderChapter BOOK_SPIDER_CHAPTER = com.book.core.domain.tables.BookSpiderChapter.BOOK_SPIDER_CHAPTER;

    /**
     * 爬虫书籍基础信息表
     */
    public static final BookSpiderInfo BOOK_SPIDER_INFO = com.book.core.domain.tables.BookSpiderInfo.BOOK_SPIDER_INFO;

    /**
     * 第三方版权书籍章节表
     */
    public static final BookThirdCopyrightChapter BOOK_THIRD_COPYRIGHT_CHAPTER = com.book.core.domain.tables.BookThirdCopyrightChapter.BOOK_THIRD_COPYRIGHT_CHAPTER;

    /**
     * 第三方版权书籍基础信息表
     */
    public static final BookThirdCopyrightInfo BOOK_THIRD_COPYRIGHT_INFO = com.book.core.domain.tables.BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO;

    /**
     * 会员基础信息表
     */
    public static final MemberBaseInfo MEMBER_BASE_INFO = com.book.core.domain.tables.MemberBaseInfo.MEMBER_BASE_INFO;

    /**
     * 会员推荐表
     */
    public static final MemberBaseRefer MEMBER_BASE_REFER = com.book.core.domain.tables.MemberBaseRefer.MEMBER_BASE_REFER;

    /**
     * 会员资金余额表
     */
    public static final MemberCapitalBalance MEMBER_CAPITAL_BALANCE = com.book.core.domain.tables.MemberCapitalBalance.MEMBER_CAPITAL_BALANCE;

    /**
     * 会员资金流水表
     */
    public static final MemberCapitalInOutLog MEMBER_CAPITAL_IN_OUT_LOG = com.book.core.domain.tables.MemberCapitalInOutLog.MEMBER_CAPITAL_IN_OUT_LOG;

    /**
     * 会员资金充值记录表
     */
    public static final MemberCapitalRechargeLog MEMBER_CAPITAL_RECHARGE_LOG = com.book.core.domain.tables.MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG;

    /**
     * 会员虚拟币余额表
     */
    public static final MemberCoinBalance MEMBER_COIN_BALANCE = com.book.core.domain.tables.MemberCoinBalance.MEMBER_COIN_BALANCE;

    /**
     * 会员虚拟币流水表
     */
    public static final MemberCoinInOutLog MEMBER_COIN_IN_OUT_LOG = com.book.core.domain.tables.MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG;

    /**
     * 会员虚拟币返利计划表
     */
    public static final MemberCoinRebatePlan MEMBER_COIN_REBATE_PLAN = com.book.core.domain.tables.MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN;

    /**
     * 会员虚拟币提现记录表
     */
    public static final MemberCoinWithdrawLog MEMBER_COIN_WITHDRAW_LOG = com.book.core.domain.tables.MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG;

    /**
     * 会员vip购买记录表
     */
    public static final MemberVipLog MEMBER_VIP_LOG = com.book.core.domain.tables.MemberVipLog.MEMBER_VIP_LOG;

    /**
     * 消息-验证码表
     */
    public static final MessageCaptcha MESSAGE_CAPTCHA = com.book.core.domain.tables.MessageCaptcha.MESSAGE_CAPTCHA;
}
