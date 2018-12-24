package com.book.core.business.authority.service;

import com.book.core.business.authority.constant.AuthorityConstant;
import com.book.core.business.authority.pojo.po.AuthorityClientPo;
import com.book.core.business.authority.repository.AuthorityClientRepository;
import com.book.core.constant.ErrorCode;
import com.framework.common.spring.pojo.dto.ResultDto;
import com.framework.common.tool.CryptTools;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.GeneralSecurityException;
import java.util.Optional;

import static com.book.core.business.authority.constant.AuthorityConstant.TOKEN_SPLIT;
import static com.book.core.business.authority.constant.AuthorityConstant.TOKEN_SPLIT_SIZE;
import static com.book.core.constant.ErrorCode.ERROR_ACCESS_PRINCIPAL_CHECK;

/**
 * @Description: 鉴权客户端服务类
 * @Author: J.W
 * @Date: 9:39 PM 2018/12/23
 */
@Slf4j
@Service
public class AuthorityClientService {

    @Autowired
    private AuthorityClientRepository authorityClientRepository;

    /**
     * @Description api基础鉴权
     * @Author J.W
     * @Date 2018/12/24 9:39
     * @Param [inDto]
     * @Return com.framework.common.spring.pojo.dto.ResultDto
     **/
    public ResultDto<Long> authBasicForApi(String basic) {
        // 解析Basic
        ResultDto<String[]> decodeBasic = this.decodeBasic(basic);
        if (decodeBasic.isError()) {
            return ResultDto.build(decodeBasic.getError());
        }
        // 校验客户端
        String[] clientSplit = decodeBasic.getResult();
        // api客户端是否符合前缀规则
        String clientName = clientSplit[0];
        String clientSecret = clientSplit[1];
        if (!clientName.startsWith(AuthorityConstant.TOKEN_API_CLIENT_PREFIX)) {
            return ResultDto.build(ERROR_ACCESS_PRINCIPAL_CHECK);
        }
        ResultDto<AuthorityClientPo> checkClient = this.authBasic(clientName, clientSecret);
        if (checkClient.isError()) {
            return ResultDto.build(checkClient.getError());
        }
        ResultDto<Long> resultDto = ResultDto.build();
        return resultDto.setResult(checkClient.getResult().getId());
    }


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
            return ResultDto.build(ERROR_ACCESS_PRINCIPAL_CHECK);
        }
        ResultDto<String[]> resultDto = ResultDto.build();
        return resultDto.setResult(clientSplit);
    }

    /**
     * @Description 校验客户端
     * @Author J.W
     * @Date 2018/12/24 9:47
     * @Param [clientName, clientSecret]
     * @Return com.framework.common.spring.pojo.dto.ResultDto
     **/
    private ResultDto<AuthorityClientPo> authBasic(String clientName, String clientSecret) {
        // 获取客户端
        Optional<AuthorityClientPo> existClient = authorityClientRepository.existByName(clientName);
        if (!existClient.isPresent()) {
            log.error("解析Basic失败, 不存在的客户端, clientName:{}", clientName);
            return ResultDto.build(ERROR_ACCESS_PRINCIPAL_CHECK);
        }
        // 校验客户端密钥
        AuthorityClientPo clientPo = existClient.get();
        try {
            String secretEncode = CryptTools.aesEncrypt(clientSecret, clientPo.getSalt());
            if (!secretEncode.equals(clientPo.getSecret())) {
                log.error("解析Basic失败, 客户端client鉴权异常, clientSecret={} 密码不匹配", clientSecret);
                return ResultDto.build(ERROR_ACCESS_PRINCIPAL_CHECK);
            }
        } catch (GeneralSecurityException e) {
            log.error("解析Basic失败, 客户端client鉴权异常, clientSecret={} 加密失败", clientSecret);
            return ResultDto.build(ERROR_ACCESS_PRINCIPAL_CHECK);
        }
        // 鉴权成功
        ResultDto<AuthorityClientPo> resultDto = ResultDto.build();
        return resultDto.setResult(clientPo);
    }

}
