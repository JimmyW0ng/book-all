package com.book.core.business.member.service;

import com.book.core.business.member.pojo.po.MemberCapitalBalancePo;
import com.book.core.business.member.repository.MemberCapitalBalanceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 会员资金余额服务类
 * @Author J.W
 * @Date 2018/12/25 18:22
 **/
@Slf4j
@Service
public class MemberCapitalBalanceService {

    @Autowired
    private MemberCapitalBalanceRepository memberCapitalBalanceRepository;

    /**
     * @Description 根据会员id查询
     * @Author J.W
     * @Date 2018/12/25 18:29
     * @Param [memberId]
     * @Return com.book.core.business.member.pojo.po.MemberCapitalBalancePo
     **/
    public MemberCapitalBalancePo getByMemberId(Long memberId) {
        return memberCapitalBalanceRepository.getByMemberId(memberId);
    }

}
