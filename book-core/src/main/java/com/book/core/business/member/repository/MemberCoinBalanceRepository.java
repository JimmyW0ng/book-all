package com.book.core.business.member.repository;

import com.book.core.business.member.pojo.po.MemberCoinBalancePo;
import com.book.core.domain.tables.records.MemberCoinBalanceRecord;
import com.framework.spring.boot.jooq.repository.AbstractCRUDRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.book.core.domain.Tables.MEMBER_COIN_BALANCE;

/**
 * * 会员虚拟币余额仓库
 */
@Repository
public class MemberCoinBalanceRepository extends AbstractCRUDRepository<MemberCoinBalanceRecord, Long, MemberCoinBalancePo> {

    @Autowired
    public MemberCoinBalanceRepository(DSLContext dslContext) {
        super(dslContext, MEMBER_COIN_BALANCE, MEMBER_COIN_BALANCE.ID, MemberCoinBalancePo.class);
    }

    /**
     * @Description 根据会员id查询
     * @Author J.W
     * @Date 2018/12/25 18:35
     * @Param [memberId]
     * @Return com.book.core.business.member.pojo.po.MemberCoinBalancePo
     **/
    public MemberCoinBalancePo getByMemberId(Long memberId) {
        return dslContext.selectFrom(MEMBER_COIN_BALANCE)
                .where(MEMBER_COIN_BALANCE.MEMBER_ID.eq(memberId))
                .and(MEMBER_COIN_BALANCE.DEL_FLAG.eq(false))
                .fetchOneInto(MemberCoinBalancePo.class);
    }

}
