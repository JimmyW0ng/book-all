package com.book.api.business.book.facade;

import com.book.api.business.book.dto.BookCatalogOutDto;
import com.book.api.business.book.dto.BookIndexOutDto;
import com.book.core.business.book.pojo.bo.BookCatalogBo;
import com.book.core.business.book.pojo.po.BookBaseClassificationPo;
import com.book.core.business.book.pojo.po.BookBaseInfoPo;
import com.book.core.business.book.service.BookBaseCatalogService;
import com.book.core.business.book.service.BookBaseClassificationService;
import com.book.core.business.book.service.BookBaseInfoService;
import com.book.core.business.member.service.MemberBaseInfoService;
import com.framework.common.spring.pojo.dto.ResultDto;
import com.framework.common.tool.CollectionsTools;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static com.book.core.constant.ErrorCode.ERROR_BOOK_CATALOG_IS_NOT_EXIST;
import static com.book.core.constant.ErrorCode.ERROR_BOOK_CLASSIFY_IS_NOT_EXIST;

/**
 * @Description 书籍装饰器
 * @Author J.W
 * @Date 2018/12/27 10:44
 **/
@Slf4j
@Component
public class BookBaseFacade {

    @Autowired
    private BookBaseInfoService bookBaseInfoService;
    @Autowired
    private BookBaseClassificationService bookBaseClassificationService;
    @Autowired
    private BookBaseCatalogService bookBaseCatalogService;
    @Autowired
    private MemberBaseInfoService memberBaseInfoService;

    /**
     * @Description 书籍首页信息
     * @Author J.W
     * @Date 2018/12/27 11:21
     * @Param [bookId]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<com.book.api.business.book.dto.BookIndexOutDto>
     **/
    public ResultDto<BookIndexOutDto> bookIndex(Long bookId) {
        // 书籍校验
        ResultDto<BookBaseInfoPo> checkBk = bookBaseInfoService.checkById(bookId);
        if (checkBk.isError()) {
            return ResultDto.build(checkBk.getError());
        }
        BookBaseInfoPo bookBaseInfo = checkBk.getResult();
        // 查询书籍分类
        ResultDto<BookBaseClassificationPo> checkClassify = bookBaseClassificationService.checkById(bookBaseInfo.getClassificationId());
        if (checkClassify.isError()) {
            return ResultDto.build(ERROR_BOOK_CLASSIFY_IS_NOT_EXIST);
        }
        // 查询目录
        List<BookCatalogBo> bookCatalog = bookBaseCatalogService.findByBookId(bookId);
        if (CollectionsTools.isEmpty(bookCatalog)) {
            return ResultDto.build(ERROR_BOOK_CATALOG_IS_NOT_EXIST);
        }
        BookIndexOutDto outDto = new BookIndexOutDto();
        // 书籍id
        outDto.setId(bookBaseInfo.getId());
        // 作者
        outDto.setAuthorName(bookBaseInfo.getAuthorName());
        // 完结标记
        outDto.setEndFlag(bookBaseInfo.getEndFlag());
        // 书名
        outDto.setTitle(bookBaseInfo.getTitle());
        // 简介
        outDto.setShortDesc(bookBaseInfo.getShortDesc());
        // 封面
        outDto.setImgCover(bookBaseInfo.getImgCover());
        // 分类
        outDto.setClassification(checkClassify.getResult().getName());
        // 目录
        outDto.setCatalog(bookCatalog);
        ResultDto<BookIndexOutDto> resultDto = ResultDto.build();
        return resultDto.setResult(outDto);
    }

    /**
     * @Description 书籍目录
     * @Author J.W
     * @Date 2018/12/27 14:31
     * @Param [bookId]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<com.book.api.business.book.dto.BookCatalogOutDto>
     **/
    public ResultDto<BookCatalogOutDto> bookCatalog(Long bookId) {
        // 查询目录
        List<BookCatalogBo> bookCatalog = bookBaseCatalogService.findByBookId(bookId);
        if (CollectionsTools.isEmpty(bookCatalog)) {
            return ResultDto.build(ERROR_BOOK_CATALOG_IS_NOT_EXIST);
        }
        ResultDto<BookCatalogOutDto> resultDto = ResultDto.build();
        return resultDto.setResult(new BookCatalogOutDto(bookCatalog));
    }

    /**
     * @Description 书籍章节
     * @Author J.W
     * @Date 2018/12/27 14:31
     * @Param [catalogId, existMemberId]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<com.book.api.business.book.dto.BookChapterOutDto>
     **/
    public ResultDto<String> bookChapter(Long catalogId, Optional<Long> existMemberId) {
        // 未登录
        if (!existMemberId.isPresent()) {
            // 查询目录
            return bookBaseCatalogService.getChapterById(catalogId, false);
        }
        // 登录需要校验会员vip身份
        ResultDto<Boolean> checkVip = memberBaseInfoService.isVip(existMemberId.get());
        if (checkVip.isError()) {
            return ResultDto.build(checkVip.getError());
        }
        // 查询目录
        return bookBaseCatalogService.getChapterById(catalogId, checkVip.getResult());

    }

}
