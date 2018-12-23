package com.book.core.business.authority.service;

import com.book.core.constant.ErrorCode;
import com.framework.common.spring.pojo.dto.ResultDto;
import com.framework.common.tool.CryptTools;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.book.core.business.authority.constant.AuthorityConstant.TOKEN_SPLIT;
import static com.book.core.business.authority.constant.AuthorityConstant.TOKEN_SPLIT_SIZE;

/**
 * @Description: 鉴权客户端服务类
 * @Author: J.W
 * @Date: 9:39 PM 2018/12/23
 */
@Slf4j
@Service
public class AuthorityClientService {


    /**
     * @Description 解析Basic
     * @Author J.W
     * @Date 2018/12/23 9:43 PM
     * @Param [basic]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<java.lang.String[]>
     **/
    private ResultDto<String[]> decodeBasic(String basic) {
        String basicDecode;
        // base64解码
        try {
            basicDecode = CryptTools.base64Decode(basic);
        } catch (Exception e) {
            log.error("解析Basic失败, basic={}", basic, e);
            return ResultDto.build(ErrorCode.ERROR_DECODE);
        }
        // 根据分隔符拆解
        String[] clientSplit = basicDecode.split(TOKEN_SPLIT);
        if (clientSplit.length != TOKEN_SPLIT_SIZE) {
            log.error("解析Basic失败, 非法的Basic格式, basic={}", basic);
            return ResultDto.build(ErrorCode.ERROR_ACCESS_PRINCIPAL_CHECK);
        }
        ResultDto<String[]> resultDto = ResultDto.build();
        return resultDto.setResult(clientSplit);
    }


}
