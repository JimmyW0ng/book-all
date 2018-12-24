package com.book.core.business.member.pojo.po;

import com.framework.spring.boot.jooq.pojo.BaseDomainPo;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 会员资金余额表
 */
@Data
public class MemberCapitalBalancePo extends BaseDomainPo {

    private Long id;
    private Long memberId;
    private BigDecimal balance;
    private BigDecimal availableBalance;
    private String remark;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Boolean delFlag;
    private Long version;

}
