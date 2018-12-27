package com.book.core.business.book.pojo.po;

import com.framework.spring.boot.jooq.pojo.BaseDomainPo;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 书籍基础信息表
 */
@Data
public class BookBaseInfoPo extends BaseDomainPo {

    private Long id;
    private Long classificationId;
    private String authorName;
    private String title;
    private Boolean endFlag;
    private String shortDesc;
    private String imgCover;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String remark;
    private Boolean delFlag;
    private Long version;

}
