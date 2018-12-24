package com.book.api.business.message.facade;

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
        log.info("获取会员短信验证码开始...mobile={}, clientId={}, ip={}", mobile, clientId, ip);
        // 检察手机号是否已经存在
        if (memberBaseInfoService.existMobileIncludeDel(mobile)) {
            return ResultDto.build(ERROR_REGISTER_MOBILE_IS_EXIST);
        }
        // 发送验证码
        return messageCaptchaService.getShortMsgCaptcha(mobile, MessageCaptchaScene.member_register, clientId, ip);
    }
}
