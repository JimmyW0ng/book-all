package com.book.core.business.book.repository;

import com.book.core.business.book.pojo.bo.BookCatalogBo;
import com.book.core.business.book.pojo.po.BookBaseCatalogPo;
import com.book.core.domain.tables.records.BookBaseCatalogRecord;
import com.framework.spring.boot.jooq.repository.AbstractCRUDRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.book.core.domain.Tables.BOOK_BASE_CATALOG;

/**
 * 书籍目录仓库
 */
@Repository
public class BookBaseCatalogRepository extends AbstractCRUDRepository<BookBaseCatalogRecord, Long, BookBaseCatalogPo> {

    @Autowired
    public BookBaseCatalogRepository(DSLContext dslContext) {
        super(dslContext, BOOK_BASE_CATALOG, BOOK_BASE_CATALOG.ID, BookBaseCatalogPo.class);
    }

    /**
     * @Description 根据id查询
     * @Author J.W
     * @Date 2018/12/27 15:51
     * @Param [id]
     * @Return java.util.Optional<com.book.core.business.book.pojo.po.BookBaseCatalogPo>
     **/
    public Optional<BookBaseCatalogPo> existById(Long id) {
        return dslContext.selectFrom(BOOK_BASE_CATALOG)
                .where(BOOK_BASE_CATALOG.ID.eq(id))
                .and(BOOK_BASE_CATALOG.DEL_FLAG.eq(false))
                .fetchOptionalInto(BookBaseCatalogPo.class);
    }

    /**
     * @Description 根据书籍id查询
     * @Author J.W
     * @Date 2018/12/27 10:59
     * @Param [bookId]
     * @Return java.util.Optional<com.book.core.business.book.pojo.po.BookBaseCatalogPo>
     **/
    public List<BookCatalogBo> findByBookId(Long bookId) {
        return dslContext.select(BOOK_BASE_CATALOG.ID, BOOK_BASE_CATALOG.CHAPTER_TITLE, BOOK_BASE_CATALOG.FREE_FLAG)
                .from(BOOK_BASE_CATALOG)
                .where(BOOK_BASE_CATALOG.BOOK_ID.eq(bookId))
                .and(BOOK_BASE_CATALOG.DEL_FLAG.eq(false))
                .orderBy(BOOK_BASE_CATALOG.SOURCE_DETAIL_ID.asc())
                .fetchInto(BookCatalogBo.class);
    }

}
