package com.book.core.business.member.pojo.po;

import com.framework.spring.boot.jooq.pojo.BaseDomainPo;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 会员推荐表
 */
@Data
public class MemberReferPo extends BaseDomainPo {

    private Long id;
    private Long memberId;
    private Long referralId;
    private Integer level;
    private Boolean archived;
    private String remark;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Boolean delFlag;
    private Long version;

}
