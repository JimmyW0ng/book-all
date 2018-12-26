package com.book.core.business.member.service;

import com.book.core.business.member.pojo.po.MemberBaseInfoPo;
import com.book.core.business.member.pojo.po.MemberCapitalBalancePo;
import com.book.core.business.member.pojo.po.MemberCoinBalancePo;
import com.book.core.business.member.repository.MemberBaseInfoRepository;
import com.book.core.business.member.repository.MemberBaseReferRepository;
import com.book.core.business.member.repository.MemberCapitalBalanceRepository;
import com.book.core.business.member.repository.MemberCoinBalanceRepository;
import com.book.core.domain.enums.MemberBaseInfoSex;
import com.book.core.domain.enums.MemberBaseInfoStatus;
import com.framework.common.spring.pojo.dto.ResultDto;
import com.framework.common.tool.DateTools;
import com.framework.common.tool.StringTools;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
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

    @Value("${member.shortUrl.salt}")
    private String memberShortUrlSalt;

    @Autowired
    private MemberBaseInfoRepository memberBaseInfoRepository;
    @Autowired
    private MemberBaseReferRepository memberBaseReferRepository;
    @Autowired
    private MemberCapitalBalanceRepository memberCapitalBalanceRepository;
    @Autowired
    private MemberCoinBalanceRepository memberCoinBalanceRepository;

    /**
     * @Description 判断当前手机号是否被使用（包括已冻结和已注销）
     * @Author J.W
     * @Date 2018/12/21 17:08
     * @Param [mobile]
     * @Return boolean
     **/
    public boolean existMobileIncludeDel(Long mobile) {
        Optional existMobile = memberBaseInfoRepository.existMobileIncludeDel(mobile);
        return existMobile.isPresent();
    }

    /**
     * @Description 根据手机号获取和校验会员基础信息
     * @Author J.W
     * @Date 2018/12/26 14:43
     * @Param [mobile]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<com.book.core.business.member.pojo.po.MemberBaseInfoPo>
     **/
    public ResultDto<MemberBaseInfoPo> checkByMobile(Long mobile) {
        MemberBaseInfoPo memberBaseInfo = memberBaseInfoRepository.getByMobile(mobile);
        return this.check(memberBaseInfo);
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
        if (inviter.getVipEnd() == null) {
            return ResultDto.build(ERROR_REGISTER_INVITER_IS_NOT_EXIST);
        }
        Timestamp sysTime = DateTools.getCurrentDateTime();
        Timestamp invalidTime = DateTools.addDate(sysTime, MEMBER_SHORT_URL_OVERDUE_EXTEND_DAY);
        if (invalidTime.after(inviter.getVipEnd())) {
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
        insertPo.setNickName(mobile.toString());
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
     * @Description 获取和校验会员基础信息
     * @Author J.W
     * @Date 2018/12/25 11:37
     * @Param [memberId]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<com.book.core.business.member.pojo.po.MemberBaseInfoPo>
     **/
    public ResultDto<MemberBaseInfoPo> checkById(Long memberId) {
        MemberBaseInfoPo memberBaseInfo = memberBaseInfoRepository.getById(memberId);
        return this.check(memberBaseInfo);
    }

    /**
     * @Description 基础信息校验
     * @Author J.W
     * @Date 2018/12/26 14:42
     * @Param [memberBaseInfo]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<com.book.core.business.member.pojo.po.MemberBaseInfoPo>
     **/
    private ResultDto<MemberBaseInfoPo> check(MemberBaseInfoPo memberBaseInfo) {
        if (memberBaseInfo == null
                || memberBaseInfo.getDelFlag()
                || memberBaseInfo.getStatus().equals(MemberBaseInfoStatus.cancel)) {
            return ResultDto.build(ERROR_MEMBER_IS_NOT_EXIST);
        } else if (memberBaseInfo.getStatus().equals(MemberBaseInfoStatus.freeze)) {
            return ResultDto.build(ERROR_MEMBER_IS_FREEZE);
        }
        ResultDto<MemberBaseInfoPo> resultDto = ResultDto.build();
        return resultDto.setResult(memberBaseInfo);
    }

    /**
     * @Description 会员数据初始化
     * @Author J.W
     * @Date 2018/12/24 18:26
     * @Param [memberId, hasInviteCode, inviterId]
     * @Return void
     **/
    private void initMemberData(Long memberId, boolean hasInviteCode, Long inviterId) {
        log.info("会员数据初始化开始, memberId={}, hasInviteCode={}, inviterId={}", memberId, hasInviteCode, inviterId);
        // 初始化推荐码
        String shortUrl = StringTools.generateShortUrl(memberId, memberShortUrlSalt, MEMBER_SHORT_URL_MIN_LENGTH);
        if (StringTools.isBlank(shortUrl)) {
            throw new RuntimeException("生成会员推荐码失败！");
        }
        memberBaseInfoRepository.updateShortUrl(memberId, shortUrl);
        // 初始化推荐关系
        if (hasInviteCode) {
            // 一级推荐人
            log.info("增加推荐关系, 会员id={}, 一级推荐人={}", memberId, inviterId);
            memberBaseReferRepository.insert(memberId, inviterId, MEMBER_REFER_LEVEL_ONE);
            // 二级推荐人
            Optional<Long> existReferLevelTwo = memberBaseReferRepository.getReferralIdByMemberIdAndLevel(inviterId, MEMBER_REFER_LEVEL_ONE);
            if (existReferLevelTwo.isPresent()) {
                Long referLevelTwo = existReferLevelTwo.get();
                log.info("增加推荐关系, 会员id={}, 二级推荐人={}", memberId, referLevelTwo);
                memberBaseReferRepository.insert(memberId, inviterId, MEMBER_REFER_LEVEL_TWO);
            }
        }
        // 初始化会员资金余额
        MemberCapitalBalancePo capitalBalance = new MemberCapitalBalancePo();
        capitalBalance.setMemberId(memberId);
        capitalBalance.setBalance(BigDecimal.ZERO);
        capitalBalance.setAvailableBalance(BigDecimal.ZERO);
        memberCapitalBalanceRepository.insert(capitalBalance);
        // 初始化会员虚拟币余额
        MemberCoinBalancePo coinBalance = new MemberCoinBalancePo();
        coinBalance.setMemberId(memberId);
        coinBalance.setBalance(BigDecimal.ZERO);
        coinBalance.setAvailableBalance(BigDecimal.ZERO);
        memberCoinBalanceRepository.insert(coinBalance);
    }

}
