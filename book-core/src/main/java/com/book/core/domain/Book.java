/*
 * This file is generated by jOOQ.
*/
package com.book.core.domain;


import com.book.core.domain.tables.AuthorityToken;
import com.book.core.domain.tables.MemberBaseInfo;
import com.book.core.domain.tables.MessageCaptcha;
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

    private static final long serialVersionUID = 1393892565;

    /**
     * The reference instance of <code>book</code>
     */
    public static final Book BOOK = new Book();

    /**
     * 鉴权登录表
     */
    public final AuthorityToken AUTHORITY_TOKEN = com.book.core.domain.tables.AuthorityToken.AUTHORITY_TOKEN;

    /**
     * 会员基础信息表
     */
    public final MemberBaseInfo MEMBER_BASE_INFO = com.book.core.domain.tables.MemberBaseInfo.MEMBER_BASE_INFO;

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
                AuthorityToken.AUTHORITY_TOKEN,
                MemberBaseInfo.MEMBER_BASE_INFO,
                MessageCaptcha.MESSAGE_CAPTCHA);
    }
}
