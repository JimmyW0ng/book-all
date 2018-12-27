package com.book.core.business.book.pojo.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description 书籍目录bo
 * @Author J.W
 * @Date 2018/12/27 15:04
 **/
@Data
public class BookCatalogBo implements Serializable {

    private Long id;
    private String chapterTitle;
    private Boolean freeFlag;

}
