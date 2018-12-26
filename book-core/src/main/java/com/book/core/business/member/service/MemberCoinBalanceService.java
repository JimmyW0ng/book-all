package com.book.core.business.member.service;

import com.book.core.business.member.pojo.po.MemberCoinBalancePo;
import com.book.core.business.member.repository.MemberCoinBalanceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 会员虚拟币余额服务类
 * @Author J.W
 * @Date 2018/12/25 18:22
 **/
@Slf4j
@Service
public class MemberCoinBalanceService {

    @Autowired
    private MemberCoinBalanceRepository memberCoinBalanceRepository;

    /**
     * @Description 根据会员id查询
     * @Author J.W
     * @Date 2018/12/25 18:29
     * @Param [memberId]
     * @Return com.book.core.business.member.pojo.po.MemberCapitalBalancePo
     **/
    public MemberCoinBalancePo getByMemberId(Long memberId) {
        return memberCoinBalanceRepository.getByMemberId(memberId);
    }

}
