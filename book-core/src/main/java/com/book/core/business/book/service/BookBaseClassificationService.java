package com.book.core.business.book.service;

import com.book.core.business.book.pojo.po.BookBaseClassificationPo;
import com.book.core.business.book.repository.BookBaseClassificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Description 书籍分类服务类
 * @Author J.W
 * @Date 2018/12/27 11:36
 **/
@Service
public class BookBaseClassificationService {

    @Autowired
    private BookBaseClassificationRepository bookBaseClassificationRepository;

    /**
     * @Description 根据id查询
     * @Author J.W
     * @Date 2018/12/27 10:59
     * @Param [id]
     * @Return java.util.Optional<com.book.core.business.book.pojo.po.BookBaseClassificationPo>
     **/
    public Optional<BookBaseClassificationPo> existById(Long id) {
        return bookBaseClassificationRepository.existById(id);
    }

}
