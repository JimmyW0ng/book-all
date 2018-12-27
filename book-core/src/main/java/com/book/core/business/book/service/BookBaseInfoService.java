package com.book.core.business.book.service;

import com.book.core.business.book.pojo.po.BookBaseInfoPo;
import com.book.core.business.book.repository.BookBaseInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Description 书籍基础信息服务类
 * @Author J.W
 * @Date 2018/12/27 10:55
 **/
@Service
public class BookBaseInfoService {

    @Autowired
    private BookBaseInfoRepository bookBaseInfoRepository;

    /**
     * @Description 根据id查询
     * @Author J.W
     * @Date 2018/12/27 10:59
     * @Param [id]
     * @Return java.util.Optional<com.book.core.business.book.pojo.po.BookBaseInfoPo>
     **/
    public Optional<BookBaseInfoPo> existById(Long id) {
        return bookBaseInfoRepository.existById(id);
    }

}
