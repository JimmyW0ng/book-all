package com.book.core.business.book.pojo.po;

import com.book.core.domain.enums.BookBaseCatalogSource;
import com.framework.spring.boot.jooq.pojo.BaseDomainPo;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 书籍目录表
 */
@Data
public class BookBaseCatalogPo extends BaseDomainPo {

    private Long id;
    private Long bookId;
    private String chapterTitle;
    private Boolean freeFlag;
    private BookBaseCatalogSource source;
    private Long sourceDetailId;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String remark;
    private Boolean delFlag;
    private Long version;

}
