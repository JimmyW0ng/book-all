package com.book.core.business.member.service;

import com.book.core.business.member.pojo.bo.MemberBookCollectionBo;
import com.book.core.business.member.pojo.po.MemberBookCollectionPo;
import com.book.core.business.member.repository.MemberBookCollectionRepository;
import com.framework.common.spring.pojo.dto.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Description 会员书籍收藏服务类
 * @Author J.W
 * @Date 2018/12/27 17:22
 **/
@Slf4j
@Service
public class MemberBookCollectionService {

    @Autowired
    private MemberBookCollectionRepository memberBookCollectionRepository;

    /**
     * @Description 根据会员查询收藏记录
     * @Author J.W
     * @Date 2018/12/28 10:42
     * @Param [memberId]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<java.util.List < com.book.core.business.member.pojo.bo.MemberBookCollectionBo>>
     **/
    public List<MemberBookCollectionBo> findByMemberId(Long memberId) {
        return memberBookCollectionRepository.findByMemberId(memberId);
    }

    /**
     * @Description 会员书籍收藏
     * @Author J.W
     * @Date 2018/12/28 17:56
     * @Param [memberId, bookId]
     * @Return com.framework.common.spring.pojo.dto.ResultDto
     **/
    public ResultDto collect(Long memberId, Long bookId) {
        Optional<MemberBookCollectionPo> existCollection = memberBookCollectionRepository.existByMemberIdAndBookId(memberId, bookId);
        if (existCollection.isPresent()) {
            log.error("会员书籍收藏失败, 记录已存在, memberId={}, bookId={}, id={}", memberId, bookId, existCollection.get().getId());
            return ResultDto.build();
        }
        MemberBookCollectionPo insertPo = new MemberBookCollectionPo();
        insertPo.setMemberId(memberId);
        insertPo.setBookId(bookId);
        memberBookCollectionRepository.insert(insertPo);
        return ResultDto.build();
    }

    /**
     * @Description 根据会员id和书籍id数组删除记录（物理删除）
     * @Author J.W
     * @Date 2018/12/28 18:13
     * @Param [memberId, bookIds]
     * @Return com.framework.common.spring.pojo.dto.ResultDto
     **/
    public int physicalDelByMemberIdAndBookIds(Long memberId, List<Long> bookIds) {
        return memberBookCollectionRepository.physicalDelByMemberIdAndBookIds(memberId, bookIds);
    }

}
