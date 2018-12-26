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
     * @Description 根据手机号查询（包括删除的记录）
     * @Author J.W
     * @Date 2018/12/21 17:14
     * @Param [mobile]
     * @Return java.util.Optional<java.lang.Long>
     **/
    public Optional<Long> existMobileIncludeDel(Long mobile) {
        return dslContext.select(MEMBER_BASE_INFO.ID)
                .from(MEMBER_BASE_INFO)
                .where(MEMBER_BASE_INFO.MOBILE.eq(mobile))
                .fetchOptionalInto(Long.class);
    }

    /**
     * @Description 根据手机号查询
     * @Author J.W
     * @Date 2018/12/26 14:38
     * @Param [mobile]
     * @Return com.book.core.business.member.pojo.po.MemberBaseInfoPo
     **/
    public MemberBaseInfoPo getByMobile(Long mobile) {
        return dslContext.selectFrom(MEMBER_BASE_INFO)
                .where(MEMBER_BASE_INFO.MOBILE.eq(mobile))
                .and(MEMBER_BASE_INFO.DEL_FLAG.eq(false))
                .fetchOneInto(MemberBaseInfoPo.class);
    }

    /**
     * @Description 根据推荐码查询
     * @Author J.W
     * @Date 2018/12/24 15:32
     * @Param [shortUrl]
     * @Return java.util.Optional<com.book.core.business.member.pojo.po.MemberBaseInfoPo>
     **/
    public Optional<MemberBaseInfoPo> existByShortUrl(String shortUrl) {
        return dslContext.selectFrom(MEMBER_BASE_INFO)
                .where(MEMBER_BASE_INFO.SHORT_URL.eq(shortUrl))
                .and(MEMBER_BASE_INFO.DEL_FLAG.eq(false))
                .fetchOptionalInto(MemberBaseInfoPo.class);
    }

    /**
     * @Description 更新会员推荐码
     * @Author J.W
     * @Date 2018/12/25 10:39
     * @Param [memberId, shortUrl]
     * @Return int
     **/
    public int updateShortUrl(Long memberId, String shortUrl) {
        return dslContext.update(MEMBER_BASE_INFO)
                .set(MEMBER_BASE_INFO.SHORT_URL, shortUrl)
                .where(MEMBER_BASE_INFO.ID.eq(memberId))
                .execute();
    }

}
