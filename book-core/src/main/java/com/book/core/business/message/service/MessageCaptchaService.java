package com.book.core.business.message.service;

import com.book.core.business.message.constant.MessageConstant;
import com.book.core.business.message.pojo.po.MessageCaptchaPo;
import com.book.core.business.message.repository.MessageCaptchaRepository;
import com.book.core.constant.ErrorCode;
import com.book.core.domain.enums.MessageCaptchaScene;
import com.book.core.domain.enums.MessageCaptchaType;
import com.framework.common.spring.component.SpringComponent;
import com.framework.common.spring.pojo.dto.ResultDto;
import com.framework.common.tool.DateTools;
import com.framework.common.tool.StringTools;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

/**
 * @Description 消息-验证码服务类
 * @Author J.W
 * @Date 2018/12/21 16:18
 **/
@Service
public class MessageCaptchaService {

    @Autowired
    private MessageCaptchaRepository messageCaptchaRepository;

    /**
     * @Description 获取短信验证码
     * @Author J.W
     * @Date 2018/12/21 17:37
     * @Param [sourceId, scene, clientId, ip]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<java.lang.String>
     **/
    public ResultDto<String> getShortMsgCaptcha(Long sourceId, MessageCaptchaScene scene, Long clientId, String ip) {
        // 校验手机发送短信频率是否异常
        Timestamp now = DateTools.getCurrentDateTime();
        Timestamp startTime = DateTools.zerolizedTime(now);
        Timestamp endTime = DateTools.getEndTime(now);
        // 查看当天已经发送次数
        int count = messageCaptchaRepository.countBySourceId(sourceId, scene, startTime, endTime);
        if (count >= MessageConstant.CAPTCHA_SCENE_SOURCE_NUM_LIMIT) {
            return ResultDto.build(ErrorCode.ERROR_CAPTCHA_GET_NUM_OUT_LIMIT);
        }
        // 校验ip
        int ipCount = messageCaptchaRepository.countByIP(ip, startTime, endTime);
        if (ipCount >= MessageConstant.CAPTCHA_SCENE_IP_NUM_LIMIT) {
            return ResultDto.build(ErrorCode.ERROR_CAPTCHA_GET_NUM_OUT_LIMIT);
        }
        // 生成随机码
        String captchaContent = RandomStringUtils.randomNumeric(MessageConstant.CAPTCHA_SHORT_MSG_LENGTH);
        // 生成业务编码
        String bizCode = StringTools.getUUID();
        // 保存到验证码表
        MessageCaptchaPo insertPo = new MessageCaptchaPo();
        insertPo.setType(MessageCaptchaType.short_msg);
        insertPo.setSourceId(sourceId);
        insertPo.setCode(bizCode);
        insertPo.setContent(captchaContent);
        insertPo.setScene(scene);
        insertPo.setClientId(clientId);
        insertPo.setExpireTime(DateTools.addMinuteTimestamp(DateTools.getCurrentDate(), MessageConstant.CAPTCHA_SHORT_MSG_EXPIRE_MINUTE));
        insertPo.setIp(ip);
        messageCaptchaRepository.insert(insertPo);
        ResultDto<String> resultDto = ResultDto.build();
        // TODO 生产环境发送短信验证码
        if (SpringComponent.isProduct()) {

        }
        return resultDto.setResult(bizCode);
    }

}
