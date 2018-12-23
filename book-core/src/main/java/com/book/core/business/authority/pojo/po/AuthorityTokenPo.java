package com.book.core.business.authority.pojo.po;

import com.book.core.domain.enums.AuthorityTokenTarget;
import com.framework.spring.boot.jooq.pojo.BaseDomainPo;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 鉴权登录表
 */
@Data
public class AuthorityTokenPo extends BaseDomainPo {

    private Long id;
    private Long targetId;
    private AuthorityTokenTarget target;
    private Long clientId;
    private String accessIp;
    private Timestamp expireTime;
    private String code;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String remark;
    private Boolean delFlag;
    private Long version;

}
