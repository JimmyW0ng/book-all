package com.book.core.business.book.repository;

import com.book.core.business.book.pojo.po.BookBaseInfoPo;
import com.book.core.domain.tables.records.BookBaseInfoRecord;
import com.framework.spring.boot.jooq.repository.AbstractCRUDRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.book.core.domain.Tables.BOOK_BASE_INFO;

/**
 * 书籍基础信息仓库
 */
@Repository
public class BookBaseInfoRepository extends AbstractCRUDRepository<BookBaseInfoRecord, Long, BookBaseInfoPo> {

    @Autowired
    public BookBaseInfoRepository(DSLContext dslContext) {
        super(dslContext, BOOK_BASE_INFO, BOOK_BASE_INFO.ID, BookBaseInfoPo.class);
    }

    /**
     * @Description 根据id查询
     * @Author J.W
     * @Date 2018/12/27 10:59
     * @Param [id]
     * @Return java.util.Optional<com.book.core.business.book.pojo.po.BookBaseInfoPo>
     **/
    public Optional<BookBaseInfoPo> existById(Long id) {
        return dslContext.selectFrom(BOOK_BASE_INFO)
                .where(BOOK_BASE_INFO.ID.eq(id))
                .and(BOOK_BASE_INFO.DEL_FLAG.eq(false))
                .fetchOptionalInto(BookBaseInfoPo.class);
    }

}
