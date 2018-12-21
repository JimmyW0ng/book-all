package com.book.api.business.message.controller;

import com.book.api.business.BaseController;
import com.framework.common.spring.pojo.dto.ResultDto;
import com.framework.common.tool.IpTools;
import com.framework.common.tool.RegexTools;
import com.framework.common.tool.StringTools;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static com.framework.common.constant.CommonMessage.ERROR_MOBILE_FORMAT;

/**
 * @Description 消息安全路由
 * @Author J.W
 * @Date 2018/12/21 14:32
 **/
@Slf4j
@RestController
@RequestMapping("s/msg")
public class SecurityMessageContoller extends BaseController {

    /**
     * @return com.framework.common.spring.pojo.dto.ResultDto<java.lang.String>
     * @Description 发送会员注册验证码
     * @Author J.W
     * @Date 2018/12/21 15:04
     * @Param [request, mobile]
     **/
    @ApiOperation("发送会员注册验证码")
    @PostMapping(value = "/memberRegister", headers = "Accept-Version=1.0")
    public ResultDto<String> smsMemberRegister(HttpServletRequest request,
                                               @ApiParam(name = "mobile", value = "手机号", required = true)
                                               @RequestParam(value = "mobile") String mobile) {
        // 校验手机号
        if (StringTools.isBlank(mobile) || !RegexTools.checkMobileFormat(mobile)) {
            return ResultDto.buildCustom(ERROR_MOBILE_FORMAT);
        }
        Long mobileFormat = Long.parseLong(mobile);
        Long clientId = super.getCurrentClientId(request);
        String ip = IpTools.getIpAddr(request);

        return ResultDto.build();
    }

}
