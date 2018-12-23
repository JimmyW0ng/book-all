package com.book.core.business.authority.pojo.po;

import com.book.core.domain.enums.AuthorityClientLoginSource;
import com.framework.spring.boot.jooq.pojo.BaseDomainPo;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 鉴权客户端表
 */
@Data
public class AuthorityClientPo extends BaseDomainPo {

    private Long id;
    private String name;
    private String secret;
    private String salt;
    private String role;
    private Integer accessTokenValidity;
    private Integer refreshTokenValidity;
    private String description;
    private Boolean archived;
    private AuthorityClientLoginSource loginSource;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String remark;
    private Boolean delFlag;
    private Long version;

}
