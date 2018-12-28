package com.book.core.business.book.service;

import com.book.core.business.book.pojo.po.BookBaseClassificationPo;
import com.book.core.business.book.repository.BookBaseClassificationRepository;
import com.framework.common.spring.pojo.dto.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.book.core.constant.ErrorCode.ERROR_BOOK_CLASSIFY_IS_NOT_EXIST;

/**
 * @Description 书籍分类服务类
 * @Author J.W
 * @Date 2018/12/27 11:36
 **/
@Slf4j
@Service
public class BookBaseClassificationService {

    @Autowired
    private BookBaseClassificationRepository bookBaseClassificationRepository;

    /**
     * @Description 根据id查询和校验
     * @Author J.W
     * @Date 2018/12/28 17:45
     * @Param [id]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<com.book.core.business.book.pojo.po.BookBaseClassificationPo>
     **/
    public ResultDto<BookBaseClassificationPo> checkById(Long id) {
        Optional<BookBaseClassificationPo> existClassify = bookBaseClassificationRepository.existById(id);
        if (!existClassify.isPresent()) {
            log.error("根据id查询和校验书籍分类, 数据不存在, id={}", id);
            return ResultDto.build(ERROR_BOOK_CLASSIFY_IS_NOT_EXIST);
        }
        ResultDto<BookBaseClassificationPo> resultDto = ResultDto.build();
        return resultDto.setResult(existClassify.get());
    }

}
