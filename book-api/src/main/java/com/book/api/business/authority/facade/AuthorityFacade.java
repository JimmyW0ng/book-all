package com.book.api.business.authority.facade;

import com.book.core.business.authority.service.AuthorityClientService;
import com.framework.common.spring.pojo.dto.ResultDto;
import com.framework.common.tool.WebTools;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.book.api.config.SecurityConfig.*;
import static com.book.api.constant.ApiConstant.REQUEST_CURRENT_CLIENT;
import static com.book.core.constant.ErrorCode.ERROR_ACCESS_PRINCIPAL_CHECK;

/**
 * @Description: 鉴权装饰器
 * @Author: J.W
 * @Date: 8:59 PM 2018/12/23
 */
@Slf4j
@Component
public class AuthorityFacade {

    @Autowired
    private AuthorityClientService authorityClientService;

    /**
     * @Description 解析token
     * @Author J.W
     * @Date 2018/12/23 9:03 PM
     * @Param [token]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<java.util.List<java.lang.String>>
     **/
    public ResultDto<List<String>> getTokenInfo(String token) {
        if (token.startsWith(TOKEN_BASIC_PREFIX)) {
            // 默认基础令牌
            token = token.substring(TOKEN_BASIC_PREFIX.length());
            ResultDto<Long> checkBasic = authorityClientService.authBasicForApi(token);
            if (checkBasic.isError()) {
                return ResultDto.build(checkBasic.getError());
            }
            // 将客户端id载入本次请求中
            WebTools.getCurrentRequest().setAttribute(REQUEST_CURRENT_CLIENT, checkBasic.getResult());
            // 返回默认基础权限
            ResultDto<List<String>> result = ResultDto.build();
            List<String> authorities = Lists.newArrayList(BASE_BASIC_AUTHORITY);
            return result.setResult(authorities);
        } else if (token.startsWith(TOKEN_BEARER_PREFIX)) {
            // 默认登录令牌

            // 返回默认登录权限
            ResultDto<List<String>> result = ResultDto.build();
            List<String> authorities = Lists.newArrayList(BASE_BEARER_AUTHORITY);
            return result.setResult(authorities);
        } else {
            log.error("解析token失败, 非法的令牌格式, token={}", token);
            return ResultDto.build(ERROR_ACCESS_PRINCIPAL_CHECK);
        }
    }

}
