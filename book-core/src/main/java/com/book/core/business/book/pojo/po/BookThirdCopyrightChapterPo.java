package com.book.core.business.book.pojo.po;

import com.framework.spring.boot.jooq.pojo.BaseDomainPo;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 第三方版权书籍章节表
 */
@Data
public class BookThirdCopyrightChapterPo extends BaseDomainPo {

    private Long id;
    private Long bookId;
    private String chapterTitle;
    private String chapterContent;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String remark;
    private Boolean delFlag;
    private Long version;

}
