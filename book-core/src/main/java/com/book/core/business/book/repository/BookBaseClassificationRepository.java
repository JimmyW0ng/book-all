package com.book.core.business.book.repository;

import com.book.core.business.book.pojo.po.BookBaseClassificationPo;
import com.book.core.domain.tables.records.BookBaseClassificationRecord;
import com.framework.spring.boot.jooq.repository.AbstractCRUDRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.book.core.domain.Tables.BOOK_BASE_CLASSIFICATION;

/**
 * 书籍分类仓库
 */
@Repository
public class BookBaseClassificationRepository extends AbstractCRUDRepository<BookBaseClassificationRecord, Long, BookBaseClassificationPo> {

    @Autowired
    public BookBaseClassificationRepository(DSLContext dslContext) {
        super(dslContext, BOOK_BASE_CLASSIFICATION, BOOK_BASE_CLASSIFICATION.ID, BookBaseClassificationPo.class);
    }

    /**
     * @Description 根据id查询
     * @Author J.W
     * @Date 2018/12/27 10:59
     * @Param [id]
     * @Return java.util.Optional<com.book.core.business.book.pojo.po.BookBaseClassificationPo>
     **/
    public Optional<BookBaseClassificationPo> existById(Long id) {
        return dslContext.selectFrom(BOOK_BASE_CLASSIFICATION)
                .where(BOOK_BASE_CLASSIFICATION.ID.eq(id))
                .and(BOOK_BASE_CLASSIFICATION.DEL_FLAG.eq(false))
                .fetchOptionalInto(BookBaseClassificationPo.class);
    }

}
