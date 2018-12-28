package com.book.core.business.member.repository;

import com.book.core.business.member.pojo.bo.MemberBookCollectionBo;
import com.book.core.business.member.pojo.po.MemberBookCollectionPo;
import com.book.core.domain.tables.records.MemberBookCollectionRecord;
import com.framework.spring.boot.jooq.repository.AbstractCRUDRepository;
import com.google.common.collect.Lists;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static com.book.core.domain.Tables.*;

/**
 * * 会员书籍收藏仓库
 */
@Repository
public class MemberBookCollectionRepository extends AbstractCRUDRepository<MemberBookCollectionRecord, Long, MemberBookCollectionPo> {

    @Autowired
    public MemberBookCollectionRepository(DSLContext dslContext) {
        super(dslContext, MEMBER_BOOK_COLLECTION, MEMBER_BOOK_COLLECTION.ID, MemberBookCollectionPo.class);
    }

    /**
     * @Description 根据会员查询收藏记录
     * @Author J.W
     * @Date 2018/12/28 10:42
     * @Param [memberId]
     * @Return java.util.List<com.book.core.business.member.pojo.bo.MemberBookCollectionBo>
     **/
    public List<MemberBookCollectionBo> findByMemberId(Long memberId) {
        Collection<Field<?>> conditions = Lists.newArrayList(MEMBER_BOOK_COLLECTION.BOOK_ID,
                MEMBER_BOOK_READ_LOG.BOOK_CATALOG_ID,
                BOOK_BASE_INFO.TITLE,
                BOOK_BASE_CATALOG.CHAPTER_TITLE);
        return dslContext.select(conditions)
                .from(MEMBER_BOOK_COLLECTION)
                .leftJoin(MEMBER_BOOK_READ_LOG)
                .on(MEMBER_BOOK_COLLECTION.MEMBER_ID.eq(MEMBER_BOOK_READ_LOG.MEMBER_ID))
                .and(MEMBER_BOOK_COLLECTION.BOOK_ID.eq(MEMBER_BOOK_READ_LOG.BOOK_ID))
                .and(MEMBER_BOOK_READ_LOG.DEL_FLAG.eq(false))
                .leftJoin(BOOK_BASE_INFO)
                .on(MEMBER_BOOK_COLLECTION.BOOK_ID.eq(BOOK_BASE_INFO.ID))
                .and(BOOK_BASE_INFO.DEL_FLAG.eq(false))
                .leftJoin(BOOK_BASE_CATALOG)
                .on(MEMBER_BOOK_READ_LOG.BOOK_CATALOG_ID.eq(BOOK_BASE_CATALOG.ID))
                .and(BOOK_BASE_CATALOG.DEL_FLAG.eq(false))
                .where(MEMBER_BOOK_COLLECTION.MEMBER_ID.eq(memberId))
                .and(MEMBER_BOOK_COLLECTION.DEL_FLAG.eq(false))
                .orderBy(MEMBER_BOOK_COLLECTION.ID.desc())
                .fetchInto(MemberBookCollectionBo.class);
    }

    /**
     * @Description 根据会员id和书籍id获取书籍收藏记录
     * @Author J.W
     * @Date 2018/12/28 18:00
     * @Param [memberId, bookId]
     * @Return java.util.Optional<com.book.core.business.member.pojo.po.MemberBookCollectionPo>
     **/
    public Optional<MemberBookCollectionPo> existByMemberIdAndBookId(Long memberId, Long bookId) {
        return dslContext.selectFrom(MEMBER_BOOK_COLLECTION)
                .where(MEMBER_BOOK_COLLECTION.MEMBER_ID.eq(memberId))
                .and(MEMBER_BOOK_COLLECTION.BOOK_ID.eq(bookId))
                .and(MEMBER_BOOK_COLLECTION.DEL_FLAG.eq(false))
                .fetchOptionalInto(MemberBookCollectionPo.class);
    }

    /**
     * @Description 根据会员id和书籍id数组删除记录（物理删除）
     * @Author J.W
     * @Date 2018/12/28 18:14
     * @Param [memberId, bookIds]
     * @Return int
     **/
    public int physicalDelByMemberIdAndBookIds(Long memberId, List<Long> bookIds) {
        return dslContext.delete(MEMBER_BOOK_COLLECTION)
                .where(MEMBER_BOOK_COLLECTION.MEMBER_ID.eq(memberId))
                .and(MEMBER_BOOK_COLLECTION.BOOK_ID.in(bookIds))
                .execute();
    }

}
