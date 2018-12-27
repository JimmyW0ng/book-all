package com.book.core.business.book.repository;

import com.book.core.business.book.pojo.po.BookSpiderChapterPo;
import com.book.core.domain.tables.records.BookSpiderChapterRecord;
import com.framework.spring.boot.jooq.repository.AbstractCRUDRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.book.core.domain.Tables.BOOK_SPIDER_CHAPTER;

/**
 * 爬虫书籍章节仓库
 */
@Repository
public class BookSpiderChapterRepository extends AbstractCRUDRepository<BookSpiderChapterRecord, Long, BookSpiderChapterPo> {

    @Autowired
    public BookSpiderChapterRepository(DSLContext dslContext) {
        super(dslContext, BOOK_SPIDER_CHAPTER, BOOK_SPIDER_CHAPTER.ID, BookSpiderChapterPo.class);
    }

    /**
     * @Description 根据id查询章节内容
     * @Author J.W
     * @Date 2018/12/27 16:04
     * @Param [id]
     * @Return java.lang.String
     **/
    public String getChapterContentById(Long id) {
        return dslContext.select(BOOK_SPIDER_CHAPTER.CHAPTER_CONTENT)
                .from(BOOK_SPIDER_CHAPTER)
                .where(BOOK_SPIDER_CHAPTER.ID.eq(id))
                .and(BOOK_SPIDER_CHAPTER.DEL_FLAG.eq(false))
                .fetchOneInto(String.class);

    }

}
