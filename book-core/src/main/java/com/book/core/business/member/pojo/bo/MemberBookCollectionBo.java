package com.book.core.business.member.pojo.bo;

import lombok.Data;

/**
 * @Description 会员藏书bo
 * @Author J.W
 * @Date 2018/12/27 18:35
 **/
@Data
public class MemberBookCollectionBo {

    private String title;
    private String chapterTitle;
    private Long bookId;
    private Long bookCatalogId;

}
