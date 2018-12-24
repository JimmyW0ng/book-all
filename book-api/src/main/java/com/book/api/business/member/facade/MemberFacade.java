package com.book.api.business.member.facade;

import com.book.core.business.authority.service.AuthorityTokenService;
import com.book.core.business.member.service.MemberBaseInfoService;
import com.book.core.business.message.service.MessageCaptchaService;
import com.book.core.domain.enums.MessageCaptchaScene;
import com.book.core.domain.enums.MessageCaptchaType;
import com.framework.common.spring.pojo.dto.ResultDto;
import com.framework.common.tool.StringTools;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.book.core.constant.ErrorCode.ERROR_REGISTER_MOBILE_IS_EXIST;

/**
 * @Description 会员装饰器
 * @Author J.W
 * @Date 2018/12/24 10:59
 **/
@Slf4j
@Component
public class MemberFacade {

    @Autowired
    private MemberBaseInfoService memberBaseInfoService;
    @Autowired
    private MessageCaptchaService messageCaptchaService;
    @Autowired
    private AuthorityTokenService authorityTokenService;

    /**
     * @Description 会员注册
     * @Author J.W
     * @Date 2018/12/24 16:13
     * @Param [mobile, clientId, captchaCode, captchaContent, inviteCode, traceSource, traceNo, ip]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<java.lang.String>
     **/
    public ResultDto<String> register(Long mobile,
                                      Long clientId,
                                      String captchaCode,
                                      String captchaContent,
                                      String inviteCode,
                                      String traceSource,
                                      String traceNo,
                                      String ip) {
        log.info("会员注册开始, mobile={}, clientId={}, captchaCode={}, captchaContent={}, inviteCode={}, traceSource={}, traceNo={}, ip={}",
                mobile,
                clientId,
                captchaCode,
                captchaContent,
                inviteCode,
                traceSource,
                traceNo,
                ip);
        // 校验邀请码
        boolean hasInviteCode = false;
        Long inviterId = null;
        if (StringTools.isNotBlank(inviteCode)) {
            hasInviteCode = true;
            ResultDto<Long> checkInviter = memberBaseInfoService.checkInviter(inviteCode);
            if (checkInviter.isError()) {
                return ResultDto.build(checkInviter.getError());
            }
            inviterId = checkInviter.getResult();
        }
        // 检察手机号是否已经存在
        if (memberBaseInfoService.existMobileIncludeDel(mobile)) {
            log.error("会员注册失败, 该手机号已被注册, mobile={}", mobile);
            return ResultDto.build(ERROR_REGISTER_MOBILE_IS_EXIST);
        }
        // 使用验证码
        ResultDto checkCaptcha = messageCaptchaService.useCaptcha(mobile,
                clientId,
                captchaCode,
                captchaContent,
                MessageCaptchaType.short_msg,
                MessageCaptchaScene.member_register);
        if (checkCaptcha.isError()) {
            return checkCaptcha;
        }
        // 保存会员
        ResultDto<Long> saveResult = memberBaseInfoService.save(mobile,
                clientId,
                hasInviteCode,
                inviterId,
                traceSource,
                traceNo,
                ip);
        // 自动登录
        return authorityTokenService.loginForApi(clientId, saveResult.getResult(), ip);
    }

}
