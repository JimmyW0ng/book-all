package com.book.api.business.book.controller;

import com.book.api.business.BaseController;
import com.book.api.business.book.dto.BookCatalogOutDto;
import com.book.api.business.book.dto.BookIndexOutDto;
import com.book.api.business.book.facade.BookBaseFacade;
import com.framework.common.spring.pojo.dto.ResultDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 书籍安全路由
 * @Author J.W
 * @Date 2018/12/20 15:15
 **/
@Slf4j
@RestController
@RequestMapping("s/bk")
@Api(value = "security-book", description = "书籍安全路由")
public class SecurityBookController extends BaseController {

    @Autowired
    private BookBaseFacade bookBaseFacade;

    @ApiOperation("书籍信息")
    @PostMapping(value = "/index", headers = "Accept-Version=1.0")
    public ResultDto<BookIndexOutDto> bookIndex(@ApiParam(name = "bookId", value = "书籍id", required = true)
                                                @RequestParam(name = "bookId") Long bookId) {
        return bookBaseFacade.bookIndex(bookId);
    }

    @ApiOperation("书籍目录")
    @PostMapping(value = "/catalog", headers = "Accept-Version=1.0")
    public ResultDto<BookCatalogOutDto> bookCatalog(@ApiParam(name = "bookId", value = "书籍id", required = true)
                                                    @RequestParam(name = "bookId") Long bookId) {
        return bookBaseFacade.bookCatalog(bookId);
    }

    @ApiOperation("书籍章节内容")
    @PostMapping(value = "/chapter", headers = "Accept-Version=1.0")
    public ResultDto<String> bookChapter(@ApiParam(name = "catalogId", value = "目录id", required = true)
                                         @RequestParam(name = "catalogId") Long catalogId) {
        return bookBaseFacade.bookChapter(catalogId);
    }

}
