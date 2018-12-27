package com.book.core.business.book.service;

import com.book.core.business.book.pojo.bo.BookCatalogBo;
import com.book.core.business.book.pojo.po.BookBaseCatalogPo;
import com.book.core.business.book.repository.BookBaseCatalogRepository;
import com.book.core.business.book.repository.BookSpiderChapterRepository;
import com.book.core.business.book.repository.BookThirdCopyrightChapterRepository;
import com.book.core.domain.enums.BookBaseCatalogSource;
import com.framework.common.spring.pojo.dto.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.book.core.constant.ErrorCode.ERROR_BOOK_CATALOG_IS_NOT_EXIST;
import static com.book.core.constant.ErrorCode.ERROR_BOOK_CHAPTER_NOT_FREE;

/**
 * @Description 书籍目录服务类
 * @Author J.W
 * @Date 2018/12/27 14:40
 **/
@Slf4j
@Service
public class BookBaseCatalogService {

    @Autowired
    private BookBaseCatalogRepository bookBaseCatalogRepository;
    @Autowired
    private BookSpiderChapterRepository bookSpiderChapterRepository;
    @Autowired
    private BookThirdCopyrightChapterRepository bookThirdCopyrightChapterRepository;

    /**
     * @Description 根据书籍id查询
     * @Author J.W
     * @Date 2018/12/27 14:57
     * @Param [bookId]
     * @Return java.util.List<com.book.core.business.book.pojo.po.BookBaseCatalogPo>
     **/
    public List<BookCatalogBo> findByBookId(Long bookId) {
        return bookBaseCatalogRepository.findByBookId(bookId);
    }

    /**
     * @Description 根据id查询
     * @Author J.W
     * @Date 2018/12/27 15:54
     * @Param [id]
     * @Return java.util.Optional<com.book.core.business.book.pojo.po.BookBaseCatalogPo>
     **/
    public Optional<BookBaseCatalogPo> existById(Long id) {
        return bookBaseCatalogRepository.existById(id);
    }

    /**
     * @Description 根据id获取章节内容
     * @Author J.W
     * @Date 2018/12/27 16:02
     * @Param [id, vipFlag]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<java.lang.String>
     **/
    public ResultDto<String> getChapterById(Long id, boolean vipFlag) {
        // 查询目录
        Optional<BookBaseCatalogPo> existCatalog = this.existById(id);
        if (!existCatalog.isPresent()) {
            log.error("根据id获取章节内容失败, 目录不能存在, id={}", id);
            return ResultDto.build(ERROR_BOOK_CATALOG_IS_NOT_EXIST);
        }
        BookBaseCatalogPo bookBaseCatalog = existCatalog.get();
        if (!bookBaseCatalog.getFreeFlag() && !vipFlag) {
            // 收费章节需要校验会员vip身份
            return ResultDto.build(ERROR_BOOK_CHAPTER_NOT_FREE);
        }
        String content = null;
        if (bookBaseCatalog.getSource().equals(BookBaseCatalogSource.spider)) {
            // 来源是爬虫
            content = bookSpiderChapterRepository.getChapterContentById(bookBaseCatalog.getSourceDetailId());
        } else if (bookBaseCatalog.getSource().equals(BookBaseCatalogSource.third_copyright)) {
            content = bookThirdCopyrightChapterRepository.getChapterContentById(bookBaseCatalog.getSourceDetailId());
        }
        ResultDto<String> resultDto = ResultDto.build();
        return resultDto.setResult(content);
    }

}
