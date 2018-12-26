package com.book.core.business.member.repository;

import com.book.core.business.member.pojo.po.MemberCapitalBalancePo;
import com.book.core.domain.tables.records.MemberCapitalBalanceRecord;
import com.framework.spring.boot.jooq.repository.AbstractCRUDRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.book.core.domain.Tables.MEMBER_CAPITAL_BALANCE;

/**
 * * 会员资金余额仓库
 */
@Repository
public class MemberCapitalBalanceRepository extends AbstractCRUDRepository<MemberCapitalBalanceRecord, Long, MemberCapitalBalancePo> {

    @Autowired
    public MemberCapitalBalanceRepository(DSLContext dslContext) {
        super(dslContext, MEMBER_CAPITAL_BALANCE, MEMBER_CAPITAL_BALANCE.ID, MemberCapitalBalancePo.class);
    }

    /**
     * @Description 根据会员id查询
     * @Author J.W
     * @Date 2018/12/25 18:28
     * @Param [memberId]
     * @Return com.book.core.business.member.pojo.po.MemberCapitalBalancePo
     **/
    public MemberCapitalBalancePo getByMemberId(Long memberId) {
        return dslContext.selectFrom(MEMBER_CAPITAL_BALANCE)
                .where(MEMBER_CAPITAL_BALANCE.MEMBER_ID.eq(memberId))
                .and(MEMBER_CAPITAL_BALANCE.DEL_FLAG.eq(false))
                .fetchOneInto(MemberCapitalBalancePo.class);
    }

}
