package com.book.core.business.book.pojo.po;

import com.framework.spring.boot.jooq.pojo.BaseDomainPo;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 爬虫书籍基础信息表
 */
@Data
public class BookSpiderInfoPo extends BaseDomainPo {

    private Long id;
    private String authorName;
    private String title;
    private String tag;
    private String source;
    private String url;
    private String shortDesc;
    private String imgCover;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String remark;
    private Boolean delFlag;
    private Long version;

}
