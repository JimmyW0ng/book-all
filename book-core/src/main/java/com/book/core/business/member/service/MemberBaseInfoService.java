package com.book.core.business.member.service;

import com.book.core.business.member.pojo.po.MemberBaseInfoPo;
import com.book.core.business.member.repository.MemberBaseInfoRepository;
import com.book.core.business.member.repository.MemberReferRepository;
import com.book.core.domain.enums.MemberBaseInfoSex;
import com.book.core.domain.enums.MemberBaseInfoStatus;
import com.framework.common.spring.pojo.dto.ResultDto;
import com.framework.common.tool.DateTools;
import com.framework.common.tool.StringTools;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Optional;

import static com.book.core.business.member.constant.MemberConstant.*;
import static com.book.core.constant.ErrorCode.*;

/**
 * @Description 会员-基础信息服务类
 * @Author J.W
 * @Date 2018/12/21 16:59
 **/
@Slf4j
@Service
public class MemberBaseInfoService {

    @Autowired
    private MemberBaseInfoRepository memberBaseInfoRepository;
    @Autowired
    private MemberReferRepository memberReferRepository;

    /**
     * @Description 判断当前手机号是否被使用（包括已冻结和已注销）
     * @Author J.W
     * @Date 2018/12/21 17:08
     * @Param [mobile]
     * @Return boolean
     **/
    public boolean existMobileIncludeDel(Long mobile) {
        Optional existMobile = memberBaseInfoRepository.existByMobile(mobile);
        return existMobile.isPresent();
    }

    /**
     * @Description 推荐人校验
     * @Author J.W
     * @Date 2018/12/24 11:32
     * @Param [shortUrl]
     * @Return java.util.Optional<java.lang.Long>
     **/
    public ResultDto<Long> checkInviter(String shortUrl) {
        if (shortUrl.length() < MEMBER_SHORT_URL_MIN_LENGTH) {
            return ResultDto.build(ERROR_REGISTER_INVITER_IS_NOT_EXIST);
        }
        Optional<MemberBaseInfoPo> existInviter = memberBaseInfoRepository.existByShortUrl(shortUrl);
        if (!existInviter.isPresent()) {
            return ResultDto.build(ERROR_REGISTER_INVITER_IS_NOT_EXIST);
        }
        MemberBaseInfoPo inviter = existInviter.get();
        // 校验推荐人状态
        if (inviter.getStatus().equals(MemberBaseInfoStatus.freeze)) {
            return ResultDto.build(ERROR_REGISTER_INVITER_IS_FREEZE);
        } else if (inviter.getStatus().equals(MemberBaseInfoStatus.cancel)) {
            return ResultDto.build(ERROR_REGISTER_INVITER_IS_NOT_EXIST);
        }
        // 会员未付费或付费时间已过期
        if (inviter.getTimePaymentEnd() == null) {
            return ResultDto.build(ERROR_REGISTER_INVITER_IS_NOT_EXIST);
        }
        Timestamp sysTime = DateTools.getCurrentDateTime();
        Timestamp invalidTime = DateTools.addDate(sysTime, MEMBER_SHORT_URL_OVERDUE_EXTEND_DAY);
        if (sysTime.after(invalidTime)) {
            return ResultDto.build(ERROR_REGISTER_INVITER_IS_INVALID);
        }
        ResultDto<Long> resultDto = ResultDto.build();
        return resultDto.setResult(inviter.getId());
    }

    /**
     * @Description 保存会员
     * @Author J.W
     * @Date 2018/12/24 14:32
     * @Param [mobile, clientId, hasInviteCode, inviterId, traceSource, traceNo, ip]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<java.lang.Long>
     **/
    @Transactional(rollbackFor = Exception.class)
    public ResultDto<Long> save(Long mobile,
                                Long clientId,
                                boolean hasInviteCode,
                                Long inviterId,
                                String traceSource,
                                String traceNo,
                                String ip) {
        // 保存账户信息
        MemberBaseInfoPo insertPo = new MemberBaseInfoPo();
        insertPo.setMobile(mobile);
        insertPo.setStatus(MemberBaseInfoStatus.normal);
        insertPo.setSex(MemberBaseInfoSex.unknow);
        insertPo.setShortUrl(mobile.toString());
        insertPo.setRegisterClient(clientId);
        insertPo.setRegisterTime(DateTools.getCurrentDateTime());
        insertPo.setRegisterIp(ip);
        if (StringTools.isNotBlank(traceSource)) {
            // 推广渠道（一级）
            insertPo.setRegisterTraceSource(traceSource);
        }
        // 注册来源编码
        if (StringTools.isNotBlank(traceNo)) {
            // 推广渠道（二级）
            insertPo.setRegisterTraceNo(traceNo);
        }
        memberBaseInfoRepository.insert(insertPo);
        Long memberId = insertPo.getId();
        // 会员数据初始化
        this.initMemberData(memberId, hasInviteCode, inviterId);
        // 返回会员标识
        ResultDto<Long> resultDto = ResultDto.build();
        return resultDto.setResult(memberId);
    }

    /**
     * @Description 会员数据初始化
     * @Author J.W
     * @Date 2018/12/24 18:26
     * @Param [memberId, hasInviteCode, inviterId]
     * @Return void
     **/
    private void initMemberData(Long memberId, boolean hasInviteCode, Long inviterId) {
        // 保存推荐关系
        if (hasInviteCode) {
            log.info("增加推荐关系, 会员id={}, 一级推荐人={}", memberId, inviterId);
            memberReferRepository.insert(memberId, inviterId, MEMBER_REFER_LEVEL_ONE);
        }
        Optional<Long> existReferLevelTwo = memberReferRepository.getReferralIdByMemberIdAndLevel(inviterId, MEMBER_REFER_LEVEL_TWO);
        if (existReferLevelTwo.isPresent()) {
            Long referLevelTwo = existReferLevelTwo.get();
            log.info("增加推荐关系, 会员id={}, 二级推荐人={}", memberId, referLevelTwo);
            memberReferRepository.insert(memberId, inviterId, MEMBER_REFER_LEVEL_TWO);
        }
    }

}
