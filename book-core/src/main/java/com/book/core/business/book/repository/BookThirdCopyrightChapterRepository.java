package com.book.core.business.book.repository;

import com.book.core.business.book.pojo.po.BookThirdCopyrightChapterPo;
import com.book.core.domain.tables.records.BookThirdCopyrightChapterRecord;
import com.framework.spring.boot.jooq.repository.AbstractCRUDRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.book.core.domain.Tables.BOOK_THIRD_COPYRIGHT_CHAPTER;

/**
 * 第三方版权书籍章节仓库
 */
@Repository
public class BookThirdCopyrightChapterRepository extends AbstractCRUDRepository<BookThirdCopyrightChapterRecord, Long, BookThirdCopyrightChapterPo> {

    @Autowired
    public BookThirdCopyrightChapterRepository(DSLContext dslContext) {
        super(dslContext, BOOK_THIRD_COPYRIGHT_CHAPTER, BOOK_THIRD_COPYRIGHT_CHAPTER.ID, BookThirdCopyrightChapterPo.class);
    }

    /**
     * @Description 根据id查询章节内容
     * @Author J.W
     * @Date 2018/12/27 16:04
     * @Param [id]
     * @Return java.lang.String
     **/
    public String getChapterContentById(Long id) {
        return dslContext.select(BOOK_THIRD_COPYRIGHT_CHAPTER.CHAPTER_CONTENT)
                .from(BOOK_THIRD_COPYRIGHT_CHAPTER)
                .where(BOOK_THIRD_COPYRIGHT_CHAPTER.ID.eq(id))
                .and(BOOK_THIRD_COPYRIGHT_CHAPTER.DEL_FLAG.eq(false))
                .fetchOneInto(String.class);

    }

}
