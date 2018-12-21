/*
 * This file is generated by jOOQ.
 */
package com.book.core.domain.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;

import javax.annotation.Generated;


/**
 * 类型：短信
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public enum MessageCaptchaType implements EnumType {

    short_msg("short_msg");

    private final String literal;

    private MessageCaptchaType(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "message_captcha_type";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
