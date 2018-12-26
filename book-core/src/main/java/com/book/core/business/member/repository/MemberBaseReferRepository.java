package com.book.core.business.member.repository;

import com.book.core.business.member.pojo.po.MemberBaseReferPo;
import com.book.core.domain.tables.records.MemberBaseReferRecord;
import com.framework.spring.boot.jooq.repository.AbstractCRUDRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.book.core.domain.Tables.MEMBER_BASE_REFER;

/**
 * @Description: 会员推荐Repository
 * @Author: J.W
 * @Date: 上午10:35 2017/11/27
 */
@Repository
public class MemberBaseReferRepository extends AbstractCRUDRepository<MemberBaseReferRecord, Long, MemberBaseReferPo> {

    @Autowired
    public MemberBaseReferRepository(DSLContext dslContext) {
        super(dslContext, MEMBER_BASE_REFER, MEMBER_BASE_REFER.ID, MemberBaseReferPo.class);
    }

    /**
     * @Description 新增
     * @Author J.W
     * @Date 2018/12/24 18:41
     * @Param [memberId, referralId, level]
     * @Return int
     **/
    public void insert(Long memberId, Long referralId, Integer level) {
        MemberBaseReferPo insertPo = new MemberBaseReferPo();
        insertPo.setMemberId(memberId);
        insertPo.setReferralId(referralId);
        insertPo.setLevel(level);
        super.insert(insertPo);
    }

    /**
     * @Description 根据会员id和推荐等级查询推荐人id
     * @Author J.W
     * @Date 2018/12/24 18:36
     * @Param [memberId, level]
     * @Return java.util.Optional<java.lang.Long>
     **/
    public Optional<Long> getReferralIdByMemberIdAndLevel(Long memberId, Integer level) {
        return dslContext.select(MEMBER_BASE_REFER.REFERRAL_ID)
                .from(MEMBER_BASE_REFER)
                .where(MEMBER_BASE_REFER.MEMBER_ID.eq(memberId))
                .and(MEMBER_BASE_REFER.LEVEL.eq(level))
                .and(MEMBER_BASE_REFER.ARCHIVED.eq(true))
                .and(MEMBER_BASE_REFER.DEL_FLAG.eq(false))
                .fetchOptionalInto(Long.class);
    }

}
