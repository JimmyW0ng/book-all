package com.book.api.business.member.facade;

import com.book.core.business.member.service.MemberBookCollectionService;
import com.framework.common.spring.pojo.dto.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description 会员阅读行为装饰器
 * @Author J.W
 * @Date 2018/12/24 10:59
 **/
@Slf4j
@Component
public class MemberReadActionFacade {

    @Autowired
    private MemberBookCollectionService memberBookCollectionService;

    /**
     * @Description 获取会员藏书
     * @Author J.W
     * @Date 2018/12/27 17:14
     * @Param [memberId]
     * @Return com.framework.common.spring.pojo.dto.ResultDto
     **/
    public ResultDto memberBookCollection(Long memberId) {
        return ResultDto.build();
    }

}
