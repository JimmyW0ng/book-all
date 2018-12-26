package com.book.api.business.member.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description 会员中心outDto
 * @Author J.W
 * @Date 2018/12/25 11:26
 **/
@Data
public class MemberCenterOutDto implements Serializable {

    private String nickName;
    private String avatar;
    private Boolean vipFlag;
    private BigDecimal availableCapital;
    private BigDecimal availableCoin;

}
