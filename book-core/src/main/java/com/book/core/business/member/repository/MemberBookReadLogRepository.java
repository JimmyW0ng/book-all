package com.book.core.business.member.repository;

import com.book.core.business.member.pojo.po.MemberBookReadLogPo;
import com.book.core.domain.tables.records.MemberBookReadLogRecord;
import com.framework.spring.boot.jooq.repository.AbstractCRUDRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.book.core.domain.Tables.MEMBER_BOOK_READ_LOG;

/**
 * * 会员书籍阅读日志仓库
 */
@Repository
public class MemberBookReadLogRepository extends AbstractCRUDRepository<MemberBookReadLogRecord, Long, MemberBookReadLogPo> {

    @Autowired
    public MemberBookReadLogRepository(DSLContext dslContext) {
        super(dslContext, MEMBER_BOOK_READ_LOG, MEMBER_BOOK_READ_LOG.ID, MemberBookReadLogPo.class);
    }

}
