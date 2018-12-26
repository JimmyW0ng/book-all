package com.book.api.business.message.facade;

import com.book.core.business.member.pojo.po.MemberBaseInfoPo;
import com.book.core.business.member.service.MemberBaseInfoService;
import com.book.core.business.message.service.MessageCaptchaService;
import com.book.core.domain.enums.MessageCaptchaScene;
import com.framework.common.spring.pojo.dto.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.book.core.constant.ErrorCode.ERROR_REGISTER_MOBILE_IS_EXIST;

/**
 * @Description 消息-验证码装饰器
 * @Author J.W
 * @Date 2018/12/21 16:26
 **/
@Slf4j
@Component
public class MessageCaptchaFacade {

    @Autowired
    private MessageCaptchaService messageCaptchaService;
    @Autowired
    private MemberBaseInfoService memberBaseInfoService;

    /**
     * @Description 发送会员注册验证码
     * @Author J.W
     * @Date 2018/12/21 16:29
     * @Param [mobile, clientId, ip]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<java.lang.String>
     **/
    public ResultDto<String> memberRegisterCaptcha(Long mobile, Long clientId, String ip) {
        log.info("发送会员注册短信验证码开始...mobile={}, clientId={}, ip={}", mobile, clientId, ip);
        // 检察手机号是否已经存在
        if (memberBaseInfoService.existMobileIncludeDel(mobile)) {
            return ResultDto.build(ERROR_REGISTER_MOBILE_IS_EXIST);
        }
        // 发送验证码
        return messageCaptchaService.getShortMsgCaptcha(mobile, MessageCaptchaScene.member_register, clientId, ip);
    }

    /**
     * @Description 发送会员登录验证码
     * @Author J.W
     * @Date 2018/12/21 16:29
     * @Param [mobile, clientId, ip]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<java.lang.String>
     **/
    public ResultDto<String> memberLoginCaptcha(Long mobile, Long clientId, String ip) {
        log.info("发送会员登录短信验证码开始...mobile={}, clientId={}, ip={}", mobile, clientId, ip);
        // 校验会员
        ResultDto<MemberBaseInfoPo> checkMbr = memberBaseInfoService.checkByMobile(mobile);
        if (checkMbr.isError()) {
            return ResultDto.build(checkMbr.getError());
        }
        // 发送验证码
        return messageCaptchaService.getShortMsgCaptcha(mobile, MessageCaptchaScene.member_login, clientId, ip);
    }

}
