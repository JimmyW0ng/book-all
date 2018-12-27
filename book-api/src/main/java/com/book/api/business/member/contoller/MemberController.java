package com.book.api.business.member.contoller;

import com.book.api.business.BaseController;
import com.book.api.business.member.dto.MemberCenterOutDto;
import com.book.api.business.member.facade.MemberFacade;
import com.book.api.business.member.facade.MemberReadActionFacade;
import com.framework.common.spring.pojo.dto.ResultDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description 会员路由
 * @Author J.W
 * @Date 2018/12/20 15:15
 **/
@Slf4j
@RestController
@RequestMapping("a/mbr")
@Api(value = "auth-member", description = "会员路由")
public class MemberController extends BaseController {

    @Autowired
    private MemberFacade memberFacade;
    @Autowired
    private MemberReadActionFacade memberReadActionFacade;

    @ApiOperation("会员中心")
    @PostMapping(value = "/center", headers = "Accept-Version=1.0")
    public ResultDto<MemberCenterOutDto> memberRegister(HttpServletRequest request) {
        Long memberId = super.getCurrentMemberId(request);
        return memberFacade.memberCenter(memberId);
    }

    @ApiOperation("会员藏书查询")
    @PostMapping(value = "/collection", headers = "Accept-Version=1.0")
    public ResultDto<MemberCenterOutDto> memberCollection(HttpServletRequest request) {
        Long memberId = super.getCurrentMemberId(request);
        return memberReadActionFacade.memberBookCollection(memberId);
    }

}
