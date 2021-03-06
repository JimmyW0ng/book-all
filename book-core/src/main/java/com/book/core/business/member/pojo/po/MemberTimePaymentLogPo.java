package com.book.core.business.member.pojo.po;

import com.framework.spring.boot.jooq.pojo.BaseDomainPo;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 会员时间段付费日志表
 */
@Data
public class MemberTimePaymentLogPo extends BaseDomainPo {

    private Long id;
    private Long memberId;
    private BigDecimal realPayAmount;
    private Timestamp startTime;
    private Timestamp endTime;
    private String remark;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Boolean delFlag;
    private Long version;

}
