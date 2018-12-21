package com.book.core.business.member.repository;

import com.book.core.business.member.pojo.po.MemberBaseInfoPo;
import com.book.core.domain.tables.records.MemberBaseInfoRecord;
import com.framework.spring.boot.jooq.repository.AbstractCRUDRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.book.core.domain.Tables.MEMBER_BASE_INFO;

/**
 * * 会员-基础信息仓库
 */
@Repository
public class MemberBaseInfoRepository extends AbstractCRUDRepository<MemberBaseInfoRecord, Long, MemberBaseInfoPo> {

    @Autowired
    public MemberBaseInfoRepository(DSLContext dslContext) {
        super(dslContext, MEMBER_BASE_INFO, MEMBER_BASE_INFO.ID, MemberBaseInfoPo.class);
    }

    /**
     * @Description 根据手机号查询
     * @Author J.W
     * @Date 2018/12/21 17:14
     * @Param [mobile]
     * @Return java.util.Optional<java.lang.Long>
     **/
    public Optional<Long> existByMobile(Long mobile) {
        return dslContext.select(MEMBER_BASE_INFO.ID)
                .from(MEMBER_BASE_INFO)
                .where(MEMBER_BASE_INFO.MOBILE.eq(mobile))
                .fetchOptionalInto(Long.class);
    }

}
