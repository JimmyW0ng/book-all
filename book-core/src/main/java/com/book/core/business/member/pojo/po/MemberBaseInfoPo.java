package com.book.core.business.member.pojo.po;

import com.book.core.domain.enums.MemberBaseInfoSex;
import com.book.core.domain.enums.MemberBaseInfoStatus;
import com.framework.spring.boot.jooq.pojo.BaseDomainPo;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 会员-基础信息表
 */
@Data
public class MemberBaseInfoPo extends BaseDomainPo {

    private Long id;
    private Long mobile;
    private MemberBaseInfoStatus status;
    private Timestamp timePaymentEnd;
    private String nickName;
    private MemberBaseInfoSex sex;
    private Timestamp birthday;
    private String trueName;
    private String identityNumber;
    private String shortUrl;
    private String avatar;
    private Long registerClient;
    private String registerTraceSource;
    private String registerTraceNo;
    private Timestamp registerTime;
    private String registerIp;
    private String remark;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Boolean delFlag;
    private Long version;

}
