package com.book.core.business.member.repository;

import com.book.core.business.member.pojo.po.MemberReferPo;
import com.book.core.domain.tables.records.MemberReferRecord;
import com.framework.spring.boot.jooq.repository.AbstractCRUDRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.book.core.domain.Tables.MEMBER_REFER;

/**
 * @Description: 会员推荐Repository
 * @Author: J.W
 * @Date: 上午10:35 2017/11/27
 */
@Repository
public class MemberReferRepository extends AbstractCRUDRepository<MemberReferRecord, Long, MemberReferPo> {

    @Autowired
    public MemberReferRepository(DSLContext dslContext) {
        super(dslContext, MEMBER_REFER, MEMBER_REFER.ID, MemberReferPo.class);
    }

    /**
     * @Description 新增
     * @Author J.W
     * @Date 2018/12/24 18:41
     * @Param [memberId, referralId, level]
     * @Return int
     **/
    public void insert(Long memberId, Long referralId, Integer level) {
        MemberReferPo memberReferPo = new MemberReferPo();
        memberReferPo.setMemberId(memberId);
        memberReferPo.setReferralId(referralId);
        memberReferPo.setLevel(level);
        super.insert(memberReferPo);
    }

    /**
     * @Description 根据会员id和推荐等级查询推荐人id
     * @Author J.W
     * @Date 2018/12/24 18:36
     * @Param [memberId, level]
     * @Return java.util.Optional<java.lang.Long>
     **/
    public Optional<Long> getReferralIdByMemberIdAndLevel(Long memberId, Integer level) {
        return dslContext.select(MEMBER_REFER.REFERRAL_ID)
                .from(MEMBER_REFER)
                .where(MEMBER_REFER.MEMBER_ID.eq(memberId))
                .and(MEMBER_REFER.LEVEL.eq(level))
                .and(MEMBER_REFER.ARCHIVED.eq(true))
                .and(MEMBER_REFER.DEL_FLAG.eq(false))
                .fetchOptionalInto(Long.class);
    }

}
