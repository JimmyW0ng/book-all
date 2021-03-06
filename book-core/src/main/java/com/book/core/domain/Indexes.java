/*
 * This file is generated by jOOQ.
*/
package com.book.core.domain;


import com.book.core.domain.tables.*;
import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;

import javax.annotation.Generated;


/**
 * A class modelling indexes of tables of the <code>book</code> schema.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index AUTHORITY_CLIENT_PRIMARY = Indexes0.AUTHORITY_CLIENT_PRIMARY;
    public static final Index AUTHORITY_CLIENT_UNIQUE_NAME = Indexes0.AUTHORITY_CLIENT_UNIQUE_NAME;
    public static final Index AUTHORITY_TOKEN_INDEX_CODE = Indexes0.AUTHORITY_TOKEN_INDEX_CODE;
    public static final Index AUTHORITY_TOKEN_INDEX_TARGET_ID_TARGET = Indexes0.AUTHORITY_TOKEN_INDEX_TARGET_ID_TARGET;
    public static final Index AUTHORITY_TOKEN_PRIMARY = Indexes0.AUTHORITY_TOKEN_PRIMARY;
    public static final Index BOOK_BASE_CATALOG_PRIMARY = Indexes0.BOOK_BASE_CATALOG_PRIMARY;
    public static final Index BOOK_BASE_CATALOG_UNIQUE_BOOK_CHAPTER = Indexes0.BOOK_BASE_CATALOG_UNIQUE_BOOK_CHAPTER;
    public static final Index BOOK_BASE_CLASSIFICATION_PRIMARY = Indexes0.BOOK_BASE_CLASSIFICATION_PRIMARY;
    public static final Index BOOK_BASE_INFO_PRIMARY = Indexes0.BOOK_BASE_INFO_PRIMARY;
    public static final Index BOOK_SPIDER_CHAPTER_PRIMARY = Indexes0.BOOK_SPIDER_CHAPTER_PRIMARY;
    public static final Index BOOK_SPIDER_CHAPTER_UNIQUE_BOOK_CHAPTER = Indexes0.BOOK_SPIDER_CHAPTER_UNIQUE_BOOK_CHAPTER;
    public static final Index BOOK_SPIDER_INFO_PRIMARY = Indexes0.BOOK_SPIDER_INFO_PRIMARY;
    public static final Index BOOK_THIRD_COPYRIGHT_CHAPTER_PRIMARY = Indexes0.BOOK_THIRD_COPYRIGHT_CHAPTER_PRIMARY;
    public static final Index BOOK_THIRD_COPYRIGHT_CHAPTER_UNIQUE_BOOK_CHAPTER = Indexes0.BOOK_THIRD_COPYRIGHT_CHAPTER_UNIQUE_BOOK_CHAPTER;
    public static final Index BOOK_THIRD_COPYRIGHT_INFO_PRIMARY = Indexes0.BOOK_THIRD_COPYRIGHT_INFO_PRIMARY;
    public static final Index MEMBER_BASE_INFO_INDEX_IDENTITY_NUMBER = Indexes0.MEMBER_BASE_INFO_INDEX_IDENTITY_NUMBER;
    public static final Index MEMBER_BASE_INFO_INDEX_SHORT_URL = Indexes0.MEMBER_BASE_INFO_INDEX_SHORT_URL;
    public static final Index MEMBER_BASE_INFO_PRIMARY = Indexes0.MEMBER_BASE_INFO_PRIMARY;
    public static final Index MEMBER_BASE_INFO_UNIQUE_MEMBER_MOBILE = Indexes0.MEMBER_BASE_INFO_UNIQUE_MEMBER_MOBILE;
    public static final Index MEMBER_BASE_REFER_INDEX_MEMBER_ID = Indexes0.MEMBER_BASE_REFER_INDEX_MEMBER_ID;
    public static final Index MEMBER_BASE_REFER_PRIMARY = Indexes0.MEMBER_BASE_REFER_PRIMARY;
    public static final Index MEMBER_BOOK_COLLECTION_INDEX_MEMBER_ID = Indexes0.MEMBER_BOOK_COLLECTION_INDEX_MEMBER_ID;
    public static final Index MEMBER_BOOK_COLLECTION_PRIMARY = Indexes0.MEMBER_BOOK_COLLECTION_PRIMARY;
    public static final Index MEMBER_BOOK_READ_LOG_INDEX_MEMBER_ID = Indexes0.MEMBER_BOOK_READ_LOG_INDEX_MEMBER_ID;
    public static final Index MEMBER_BOOK_READ_LOG_PRIMARY = Indexes0.MEMBER_BOOK_READ_LOG_PRIMARY;
    public static final Index MEMBER_CAPITAL_BALANCE_PRIMARY = Indexes0.MEMBER_CAPITAL_BALANCE_PRIMARY;
    public static final Index MEMBER_CAPITAL_BALANCE_UNIQUE_MEMBER_ID = Indexes0.MEMBER_CAPITAL_BALANCE_UNIQUE_MEMBER_ID;
    public static final Index MEMBER_CAPITAL_IN_OUT_LOG_INDEX_MEMBER_ID = Indexes0.MEMBER_CAPITAL_IN_OUT_LOG_INDEX_MEMBER_ID;
    public static final Index MEMBER_CAPITAL_IN_OUT_LOG_PRIMARY = Indexes0.MEMBER_CAPITAL_IN_OUT_LOG_PRIMARY;
    public static final Index MEMBER_CAPITAL_RECHARGE_LOG_INDEX_MEMBER_ID = Indexes0.MEMBER_CAPITAL_RECHARGE_LOG_INDEX_MEMBER_ID;
    public static final Index MEMBER_CAPITAL_RECHARGE_LOG_PRIMARY = Indexes0.MEMBER_CAPITAL_RECHARGE_LOG_PRIMARY;
    public static final Index MEMBER_CAPITAL_RECHARGE_LOG_UNIQUE_REQUEST_NO = Indexes0.MEMBER_CAPITAL_RECHARGE_LOG_UNIQUE_REQUEST_NO;
    public static final Index MEMBER_COIN_BALANCE_PRIMARY = Indexes0.MEMBER_COIN_BALANCE_PRIMARY;
    public static final Index MEMBER_COIN_BALANCE_UNIQUE_MEMBER_ID = Indexes0.MEMBER_COIN_BALANCE_UNIQUE_MEMBER_ID;
    public static final Index MEMBER_COIN_IN_OUT_LOG_INDEX_MEMBER_ID = Indexes0.MEMBER_COIN_IN_OUT_LOG_INDEX_MEMBER_ID;
    public static final Index MEMBER_COIN_IN_OUT_LOG_PRIMARY = Indexes0.MEMBER_COIN_IN_OUT_LOG_PRIMARY;
    public static final Index MEMBER_COIN_REBATE_PLAN_INDEX_MEMBER_ID = Indexes0.MEMBER_COIN_REBATE_PLAN_INDEX_MEMBER_ID;
    public static final Index MEMBER_COIN_REBATE_PLAN_PRIMARY = Indexes0.MEMBER_COIN_REBATE_PLAN_PRIMARY;
    public static final Index MEMBER_COIN_WITHDRAW_LOG_INDEX_MEMBER_ID = Indexes0.MEMBER_COIN_WITHDRAW_LOG_INDEX_MEMBER_ID;
    public static final Index MEMBER_COIN_WITHDRAW_LOG_PRIMARY = Indexes0.MEMBER_COIN_WITHDRAW_LOG_PRIMARY;
    public static final Index MEMBER_COIN_WITHDRAW_LOG_UNIQUE_REQUEST_NO = Indexes0.MEMBER_COIN_WITHDRAW_LOG_UNIQUE_REQUEST_NO;
    public static final Index MEMBER_VIP_LOG_INDEX_MEMBER_ID = Indexes0.MEMBER_VIP_LOG_INDEX_MEMBER_ID;
    public static final Index MEMBER_VIP_LOG_PRIMARY = Indexes0.MEMBER_VIP_LOG_PRIMARY;
    public static final Index MESSAGE_CAPTCHA_INDEX_EXPIRE_TIME = Indexes0.MESSAGE_CAPTCHA_INDEX_EXPIRE_TIME;
    public static final Index MESSAGE_CAPTCHA_INDEX_IP = Indexes0.MESSAGE_CAPTCHA_INDEX_IP;
    public static final Index MESSAGE_CAPTCHA_INDEX_SOURCE_ID = Indexes0.MESSAGE_CAPTCHA_INDEX_SOURCE_ID;
    public static final Index MESSAGE_CAPTCHA_PRIMARY = Indexes0.MESSAGE_CAPTCHA_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index AUTHORITY_CLIENT_PRIMARY = Internal.createIndex("PRIMARY", AuthorityClient.AUTHORITY_CLIENT, new OrderField[]{AuthorityClient.AUTHORITY_CLIENT.ID}, true);
        public static Index AUTHORITY_CLIENT_UNIQUE_NAME = Internal.createIndex("UNIQUE_NAME", AuthorityClient.AUTHORITY_CLIENT, new OrderField[]{AuthorityClient.AUTHORITY_CLIENT.NAME}, true);
        public static Index AUTHORITY_TOKEN_INDEX_CODE = Internal.createIndex("INDEX_CODE", AuthorityToken.AUTHORITY_TOKEN, new OrderField[]{AuthorityToken.AUTHORITY_TOKEN.CODE}, false);
        public static Index AUTHORITY_TOKEN_INDEX_TARGET_ID_TARGET = Internal.createIndex("INDEX_TARGET_ID_TARGET", AuthorityToken.AUTHORITY_TOKEN, new OrderField[]{AuthorityToken.AUTHORITY_TOKEN.TARGET_ID, AuthorityToken.AUTHORITY_TOKEN.TARGET}, false);
        public static Index AUTHORITY_TOKEN_PRIMARY = Internal.createIndex("PRIMARY", AuthorityToken.AUTHORITY_TOKEN, new OrderField[]{AuthorityToken.AUTHORITY_TOKEN.ID}, true);
        public static Index BOOK_BASE_CATALOG_PRIMARY = Internal.createIndex("PRIMARY", BookBaseCatalog.BOOK_BASE_CATALOG, new OrderField[]{BookBaseCatalog.BOOK_BASE_CATALOG.ID}, true);
        public static Index BOOK_BASE_CATALOG_UNIQUE_BOOK_CHAPTER = Internal.createIndex("UNIQUE_BOOK_CHAPTER", BookBaseCatalog.BOOK_BASE_CATALOG, new OrderField[]{BookBaseCatalog.BOOK_BASE_CATALOG.BOOK_ID, BookBaseCatalog.BOOK_BASE_CATALOG.CHAPTER_TITLE}, true);
        public static Index BOOK_BASE_CLASSIFICATION_PRIMARY = Internal.createIndex("PRIMARY", BookBaseClassification.BOOK_BASE_CLASSIFICATION, new OrderField[]{BookBaseClassification.BOOK_BASE_CLASSIFICATION.ID}, true);
        public static Index BOOK_BASE_INFO_PRIMARY = Internal.createIndex("PRIMARY", BookBaseInfo.BOOK_BASE_INFO, new OrderField[]{BookBaseInfo.BOOK_BASE_INFO.ID}, true);
        public static Index BOOK_SPIDER_CHAPTER_PRIMARY = Internal.createIndex("PRIMARY", BookSpiderChapter.BOOK_SPIDER_CHAPTER, new OrderField[]{BookSpiderChapter.BOOK_SPIDER_CHAPTER.ID}, true);
        public static Index BOOK_SPIDER_CHAPTER_UNIQUE_BOOK_CHAPTER = Internal.createIndex("UNIQUE_BOOK_CHAPTER", BookSpiderChapter.BOOK_SPIDER_CHAPTER, new OrderField[]{BookSpiderChapter.BOOK_SPIDER_CHAPTER.BOOK_ID, BookSpiderChapter.BOOK_SPIDER_CHAPTER.CHAPTER_TITLE}, true);
        public static Index BOOK_SPIDER_INFO_PRIMARY = Internal.createIndex("PRIMARY", BookSpiderInfo.BOOK_SPIDER_INFO, new OrderField[]{BookSpiderInfo.BOOK_SPIDER_INFO.ID}, true);
        public static Index BOOK_THIRD_COPYRIGHT_CHAPTER_PRIMARY = Internal.createIndex("PRIMARY", BookThirdCopyrightChapter.BOOK_THIRD_COPYRIGHT_CHAPTER, new OrderField[]{BookThirdCopyrightChapter.BOOK_THIRD_COPYRIGHT_CHAPTER.ID}, true);
        public static Index BOOK_THIRD_COPYRIGHT_CHAPTER_UNIQUE_BOOK_CHAPTER = Internal.createIndex("UNIQUE_BOOK_CHAPTER", BookThirdCopyrightChapter.BOOK_THIRD_COPYRIGHT_CHAPTER, new OrderField[]{BookThirdCopyrightChapter.BOOK_THIRD_COPYRIGHT_CHAPTER.BOOK_ID, BookThirdCopyrightChapter.BOOK_THIRD_COPYRIGHT_CHAPTER.CHAPTER_TITLE}, true);
        public static Index BOOK_THIRD_COPYRIGHT_INFO_PRIMARY = Internal.createIndex("PRIMARY", BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO, new OrderField[]{BookThirdCopyrightInfo.BOOK_THIRD_COPYRIGHT_INFO.ID}, true);
        public static Index MEMBER_BASE_INFO_INDEX_IDENTITY_NUMBER = Internal.createIndex("INDEX_IDENTITY_NUMBER", MemberBaseInfo.MEMBER_BASE_INFO, new OrderField[]{MemberBaseInfo.MEMBER_BASE_INFO.IDENTITY_NUMBER}, false);
        public static Index MEMBER_BASE_INFO_INDEX_SHORT_URL = Internal.createIndex("INDEX_SHORT_URL", MemberBaseInfo.MEMBER_BASE_INFO, new OrderField[]{MemberBaseInfo.MEMBER_BASE_INFO.SHORT_URL}, false);
        public static Index MEMBER_BASE_INFO_PRIMARY = Internal.createIndex("PRIMARY", MemberBaseInfo.MEMBER_BASE_INFO, new OrderField[]{MemberBaseInfo.MEMBER_BASE_INFO.ID}, true);
        public static Index MEMBER_BASE_INFO_UNIQUE_MEMBER_MOBILE = Internal.createIndex("UNIQUE_MEMBER_MOBILE", MemberBaseInfo.MEMBER_BASE_INFO, new OrderField[]{MemberBaseInfo.MEMBER_BASE_INFO.MOBILE}, true);
        public static Index MEMBER_BASE_REFER_INDEX_MEMBER_ID = Internal.createIndex("INDEX_MEMBER_ID", MemberBaseRefer.MEMBER_BASE_REFER, new OrderField[]{MemberBaseRefer.MEMBER_BASE_REFER.MEMBER_ID}, false);
        public static Index MEMBER_BASE_REFER_PRIMARY = Internal.createIndex("PRIMARY", MemberBaseRefer.MEMBER_BASE_REFER, new OrderField[]{MemberBaseRefer.MEMBER_BASE_REFER.ID}, true);
        public static Index MEMBER_BOOK_COLLECTION_INDEX_MEMBER_ID = Internal.createIndex("INDEX_MEMBER_ID", MemberBookCollection.MEMBER_BOOK_COLLECTION, new OrderField[]{MemberBookCollection.MEMBER_BOOK_COLLECTION.MEMBER_ID}, false);
        public static Index MEMBER_BOOK_COLLECTION_PRIMARY = Internal.createIndex("PRIMARY", MemberBookCollection.MEMBER_BOOK_COLLECTION, new OrderField[]{MemberBookCollection.MEMBER_BOOK_COLLECTION.ID}, true);
        public static Index MEMBER_BOOK_READ_LOG_INDEX_MEMBER_ID = Internal.createIndex("INDEX_MEMBER_ID", MemberBookReadLog.MEMBER_BOOK_READ_LOG, new OrderField[]{MemberBookReadLog.MEMBER_BOOK_READ_LOG.MEMBER_ID}, false);
        public static Index MEMBER_BOOK_READ_LOG_PRIMARY = Internal.createIndex("PRIMARY", MemberBookReadLog.MEMBER_BOOK_READ_LOG, new OrderField[]{MemberBookReadLog.MEMBER_BOOK_READ_LOG.ID}, true);
        public static Index MEMBER_CAPITAL_BALANCE_PRIMARY = Internal.createIndex("PRIMARY", MemberCapitalBalance.MEMBER_CAPITAL_BALANCE, new OrderField[]{MemberCapitalBalance.MEMBER_CAPITAL_BALANCE.ID}, true);
        public static Index MEMBER_CAPITAL_BALANCE_UNIQUE_MEMBER_ID = Internal.createIndex("UNIQUE_MEMBER_ID", MemberCapitalBalance.MEMBER_CAPITAL_BALANCE, new OrderField[]{MemberCapitalBalance.MEMBER_CAPITAL_BALANCE.MEMBER_ID}, true);
        public static Index MEMBER_CAPITAL_IN_OUT_LOG_INDEX_MEMBER_ID = Internal.createIndex("index_member_id", MemberCapitalInOutLog.MEMBER_CAPITAL_IN_OUT_LOG, new OrderField[]{MemberCapitalInOutLog.MEMBER_CAPITAL_IN_OUT_LOG.MEMBER_ID}, false);
        public static Index MEMBER_CAPITAL_IN_OUT_LOG_PRIMARY = Internal.createIndex("PRIMARY", MemberCapitalInOutLog.MEMBER_CAPITAL_IN_OUT_LOG, new OrderField[]{MemberCapitalInOutLog.MEMBER_CAPITAL_IN_OUT_LOG.ID}, true);
        public static Index MEMBER_CAPITAL_RECHARGE_LOG_INDEX_MEMBER_ID = Internal.createIndex("INDEX_MEMBER_ID", MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG, new OrderField[]{MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG.MEMBER_ID}, false);
        public static Index MEMBER_CAPITAL_RECHARGE_LOG_PRIMARY = Internal.createIndex("PRIMARY", MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG, new OrderField[]{MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG.ID}, true);
        public static Index MEMBER_CAPITAL_RECHARGE_LOG_UNIQUE_REQUEST_NO = Internal.createIndex("UNIQUE_REQUEST_NO", MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG, new OrderField[]{MemberCapitalRechargeLog.MEMBER_CAPITAL_RECHARGE_LOG.REQUEST_NO}, true);
        public static Index MEMBER_COIN_BALANCE_PRIMARY = Internal.createIndex("PRIMARY", MemberCoinBalance.MEMBER_COIN_BALANCE, new OrderField[]{MemberCoinBalance.MEMBER_COIN_BALANCE.ID}, true);
        public static Index MEMBER_COIN_BALANCE_UNIQUE_MEMBER_ID = Internal.createIndex("UNIQUE_MEMBER_ID", MemberCoinBalance.MEMBER_COIN_BALANCE, new OrderField[]{MemberCoinBalance.MEMBER_COIN_BALANCE.MEMBER_ID}, true);
        public static Index MEMBER_COIN_IN_OUT_LOG_INDEX_MEMBER_ID = Internal.createIndex("index_member_id", MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG, new OrderField[]{MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG.MEMBER_ID}, false);
        public static Index MEMBER_COIN_IN_OUT_LOG_PRIMARY = Internal.createIndex("PRIMARY", MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG, new OrderField[]{MemberCoinInOutLog.MEMBER_COIN_IN_OUT_LOG.ID}, true);
        public static Index MEMBER_COIN_REBATE_PLAN_INDEX_MEMBER_ID = Internal.createIndex("INDEX_MEMBER_ID", MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN, new OrderField[]{MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN.MEMBER_ID}, false);
        public static Index MEMBER_COIN_REBATE_PLAN_PRIMARY = Internal.createIndex("PRIMARY", MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN, new OrderField[]{MemberCoinRebatePlan.MEMBER_COIN_REBATE_PLAN.ID}, true);
        public static Index MEMBER_COIN_WITHDRAW_LOG_INDEX_MEMBER_ID = Internal.createIndex("INDEX_MEMBER_ID", MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG, new OrderField[]{MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG.MEMBER_ID}, false);
        public static Index MEMBER_COIN_WITHDRAW_LOG_PRIMARY = Internal.createIndex("PRIMARY", MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG, new OrderField[]{MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG.ID}, true);
        public static Index MEMBER_COIN_WITHDRAW_LOG_UNIQUE_REQUEST_NO = Internal.createIndex("UNIQUE_REQUEST_NO", MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG, new OrderField[]{MemberCoinWithdrawLog.MEMBER_COIN_WITHDRAW_LOG.REQUEST_NO}, true);
        public static Index MEMBER_VIP_LOG_INDEX_MEMBER_ID = Internal.createIndex("INDEX_MEMBER_ID", MemberVipLog.MEMBER_VIP_LOG, new OrderField[]{MemberVipLog.MEMBER_VIP_LOG.MEMBER_ID}, false);
        public static Index MEMBER_VIP_LOG_PRIMARY = Internal.createIndex("PRIMARY", MemberVipLog.MEMBER_VIP_LOG, new OrderField[]{MemberVipLog.MEMBER_VIP_LOG.ID}, true);
        public static Index MESSAGE_CAPTCHA_INDEX_EXPIRE_TIME = Internal.createIndex("INDEX_EXPIRE_TIME", MessageCaptcha.MESSAGE_CAPTCHA, new OrderField[]{MessageCaptcha.MESSAGE_CAPTCHA.EXPIRE_TIME}, false);
        public static Index MESSAGE_CAPTCHA_INDEX_IP = Internal.createIndex("INDEX_IP", MessageCaptcha.MESSAGE_CAPTCHA, new OrderField[]{MessageCaptcha.MESSAGE_CAPTCHA.IP}, false);
        public static Index MESSAGE_CAPTCHA_INDEX_SOURCE_ID = Internal.createIndex("INDEX_SOURCE_ID", MessageCaptcha.MESSAGE_CAPTCHA, new OrderField[]{MessageCaptcha.MESSAGE_CAPTCHA.SOURCE_ID}, false);
        public static Index MESSAGE_CAPTCHA_PRIMARY = Internal.createIndex("PRIMARY", MessageCaptcha.MESSAGE_CAPTCHA, new OrderField[]{MessageCaptcha.MESSAGE_CAPTCHA.ID}, true);
    }
}
