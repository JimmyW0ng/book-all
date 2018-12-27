package com.book.api.business.book.dto;

import com.book.core.business.book.pojo.bo.BookCatalogBo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Description 书籍首页outDto
 * @Author J.W
 * @Date 2018/12/27 11:07
 **/
@Data
public class BookIndexOutDto implements Serializable {

    private Long id;
    private String classification;
    private String authorName;
    private String title;
    private Boolean endFlag;
    private String shortDesc;
    private String imgCover;
    private List<BookCatalogBo> catalog;

}
