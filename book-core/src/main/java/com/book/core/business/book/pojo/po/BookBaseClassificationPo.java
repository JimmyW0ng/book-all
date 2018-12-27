package com.book.core.business.book.pojo.po;

import com.framework.spring.boot.jooq.pojo.BaseDomainPo;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 书籍分类表
 */
@Data
public class BookBaseClassificationPo extends BaseDomainPo {

    private Long id;
    private String name;
    private Long sort;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String remark;
    private Boolean delFlag;
    private Long version;

}
