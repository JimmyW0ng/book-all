package com.book.api.business.book.dto;

import com.book.core.business.book.pojo.bo.BookCatalogBo;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Description 书籍目录outDto
 * @Author J.W
 * @Date 2018/12/27 11:07
 **/
@AllArgsConstructor
@Data
public class BookCatalogOutDto implements Serializable {

    private List<BookCatalogBo> catalog;

}
