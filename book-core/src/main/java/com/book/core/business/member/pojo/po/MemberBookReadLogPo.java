package com.book.core.business.member.pojo.po;

import com.framework.spring.boot.jooq.pojo.BaseDomainPo;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 会员书籍阅读日志表
 */
@Data
public class MemberBookReadLogPo extends BaseDomainPo {

    private Long id;
    private Long memberId;
    private Long bookId;
    private Long bookCatalogId;
    private String remark;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Boolean delFlag;
    private Long version;

}
