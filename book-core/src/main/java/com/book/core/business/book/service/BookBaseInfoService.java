package com.book.core.business.book.service;

import com.book.core.business.book.pojo.po.BookBaseInfoPo;
import com.book.core.business.book.repository.BookBaseInfoRepository;
import com.framework.common.spring.pojo.dto.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.book.core.constant.ErrorCode.ERROR_BOOK_IS_NOT_EXIST;

/**
 * @Description 书籍基础信息服务类
 * @Author J.W
 * @Date 2018/12/27 10:55
 **/
@Slf4j
@Service
public class BookBaseInfoService {

    @Autowired
    private BookBaseInfoRepository bookBaseInfoRepository;

    /**
     * @Description 根据id查询和校验
     * @Author J.W
     * @Date 2018/12/28 17:38
     * @Param [id]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<com.book.core.business.book.pojo.po.BookBaseInfoPo>
     **/
    public ResultDto<BookBaseInfoPo> checkById(Long id) {
        Optional<BookBaseInfoPo> existBook = bookBaseInfoRepository.existById(id);
        if (!existBook.isPresent()) {
            log.error("根据id查询和校验书籍, 数据不存在, id={}", id);
            return ResultDto.build(ERROR_BOOK_IS_NOT_EXIST);
        }
        ResultDto<BookBaseInfoPo> resultDto = ResultDto.build();
        return resultDto.setResult(existBook.get());
    }

}
