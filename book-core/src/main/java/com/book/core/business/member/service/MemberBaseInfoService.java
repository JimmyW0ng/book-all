package com.book.core.business.member.service;

import com.book.core.business.member.repository.MemberBaseInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Description 会员-基础信息服务类
 * @Author J.W
 * @Date 2018/12/21 16:59
 **/
@Service
public class MemberBaseInfoService {

    @Autowired
    private MemberBaseInfoRepository memberBaseInfoRepository;

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

}
