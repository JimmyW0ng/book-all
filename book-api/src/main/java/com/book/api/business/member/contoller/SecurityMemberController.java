package com.book.api.business.member.contoller;

import com.book.api.business.BaseController;
import com.book.api.business.member.facade.MemberFacade;
import com.framework.common.spring.pojo.dto.ResultDto;
import com.framework.common.tool.IpTools;
import com.framework.common.tool.RegexTools;
import com.framework.common.tool.StringTools;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static com.framework.common.constant.CommonMessage.ERROR_MOBILE_FORMAT;
import static com.framework.common.constant.CommonMessage.ERROR_SYSTEM_PARAM_FORMAT;

/**
 * @Description 会员安全路由
 * @Author J.W
 * @Date 2018/12/20 15:15
 **/
@Slf4j
@RestController
@RequestMapping("s/mbr")
@Api(value = "security-member", description = "会员安全路由")
public class SecurityMemberController extends BaseController {

    @Autowired
    private MemberFacade memberFacade;

    @ApiOperation("会员注册")
    @PostMapping(value = "/register/member", headers = "Accept-Version=1.0")
    public ResultDto<String> memberRegister(HttpServletRequest request,
                                            @ApiParam(name = "mobile", value = "手机号", required = true)
                                            @RequestParam(name = "mobile") String mobile,
                                            @ApiParam(name = "captchaCode", value = "短信验证码编码", required = true)
                                            @RequestParam(name = "captchaCode") String captchaCode,
                                            @ApiParam(name = "captchaContent", value = "短信验证码", required = true)
                                            @RequestParam(name = "captchaContent") String captchaContent,
                                            @ApiParam(name = "inviteCode", value = "推荐码")
                                            @RequestParam(name = "inviteCode", required = false) String inviteCode,
                                            @ApiParam(name = "traceSource", value = "注册来源")
                                            @RequestParam(name = "traceSource", required = false) String traceSource,
                                            @ApiParam(name = "traceNo", value = "注册来源编号")
                                            @RequestParam(name = "traceNo", required = false) String traceNo) {
        // 校验手机号
        if (StringTools.isBlank(mobile) || !RegexTools.checkMobileFormat(mobile)) {
            log.error("会员注册失败, 手机号格式不正确, mobile={}", mobile);
            return ResultDto.build(ERROR_MOBILE_FORMAT);
        }
        if (StringTools.isBlank(captchaCode) || StringTools.isBlank(captchaContent)) {
            log.error("会员注册失败, 验证码code或content缺失, mobile={}, captchaCode={}, captchaContent={}",
                    mobile,
                    captchaCode,
                    captchaContent);
            return ResultDto.build(ERROR_SYSTEM_PARAM_FORMAT);
        }
        Long mobileFormat = Long.parseLong(mobile);
        Long clientId = super.getCurrentClientId(request);
        String ip = IpTools.getIpAddr(request);
        return memberFacade.register(mobileFormat,
                clientId,
                captchaCode,
                captchaContent,
                inviteCode,
                traceSource,
                traceNo,
                ip);
    }

}
