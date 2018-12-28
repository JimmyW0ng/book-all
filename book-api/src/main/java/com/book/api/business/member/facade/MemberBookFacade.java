package com.book.api.business.member.facade;

import com.book.api.business.member.dto.MemberBookCollectionOutDto;
import com.book.core.business.book.pojo.po.BookBaseInfoPo;
import com.book.core.business.book.service.BookBaseInfoService;
import com.book.core.business.member.pojo.bo.MemberBookCollectionBo;
import com.book.core.business.member.service.MemberBaseInfoService;
import com.book.core.business.member.service.MemberBookCollectionService;
import com.framework.common.spring.pojo.dto.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * @Description 会员书籍装饰器
 * @Author J.W
 * @Date 2018/12/24 10:59
 **/
@Slf4j
@Component
public class MemberBookFacade {

    @Autowired
    private MemberBaseInfoService memberBaseInfoService;
    @Autowired
    private MemberBookCollectionService memberBookCollectionService;
    @Autowired
    private BookBaseInfoService bookBaseInfoService;

    /**
     * @Description 获取会员藏书
     * @Author J.W
     * @Date 2018/12/27 17:14
     * @Param [existMemberId]
     * @Return com.framework.common.spring.pojo.dto.ResultDto
     **/
    public ResultDto<MemberBookCollectionOutDto> findCollection(Optional<Long> existMemberId) {
        List<MemberBookCollectionBo> memberBookCollection = null;
        if (existMemberId.isPresent()) {
            memberBookCollection = memberBookCollectionService.findByMemberId(existMemberId.get());
        }
        ResultDto<MemberBookCollectionOutDto> resultDto = ResultDto.build();
        return resultDto.setResult(new MemberBookCollectionOutDto(memberBookCollection));
    }

    /**
     * @Description 会员收藏书籍
     * @Author J.W
     * @Date 2018/12/28 17:25
     * @Param [memberId, bookId]
     * @Return com.framework.common.spring.pojo.dto.ResultDto
     **/
    public ResultDto collect(Long memberId, Long bookId) {
        // 会员校验
        ResultDto checkMbr = memberBaseInfoService.checkById(memberId);
        if (checkMbr.isError()) {
            return checkMbr;
        }
        // 书籍校验
        ResultDto<BookBaseInfoPo> checkBk = bookBaseInfoService.checkById(bookId);
        if (checkBk.isError()) {
            return checkBk;
        }
        // 收藏
        return memberBookCollectionService.collect(memberId, bookId);
    }


    /**
     * @Description 会员删除收藏的书籍
     * @Author J.W
     * @Date 2018/12/28 18:12
     * @Param [memberId, bookIds]
     * @Return com.framework.common.spring.pojo.dto.ResultDto
     **/
    public ResultDto delCollection(Long memberId, List<Long> bookIds) {
        memberBookCollectionService.physicalDelByMemberIdAndBookIds(memberId, bookIds);
        return ResultDto.build();
    }

}
