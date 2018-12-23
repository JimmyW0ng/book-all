package com.book.api.business.authority.facade;

import com.book.api.config.SecurityConfig;
import com.book.core.constant.ErrorCode;
import com.framework.common.spring.pojo.dto.ResultDto;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description: 鉴权装饰器
 * @Author: J.W
 * @Date: 8:59 PM 2018/12/23
 */
@Slf4j
@Component
public class AuthorityFacade {

    /**
     * @Description 解析token
     * @Author J.W
     * @Date 2018/12/23 9:03 PM
     * @Param [token]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<java.util.List<java.lang.String>>
     **/
    public ResultDto<List<String>> getTokenInfo(String token) {
        if (token.startsWith(SecurityConfig.TOKEN_BASIC_PREFIX)) {
            // 默认基础令牌

            // 返回默认基础权限
            ResultDto<List<String>> resultDto = ResultDto.build();
            List<String> authorities = Lists.newArrayList(SecurityConfig.BASE_BASIC_AUTHORITY);
            return resultDto.setResult(authorities);
        } else if (token.startsWith(SecurityConfig.TOKEN_BEARER_PREFIX)) {
            // 默认登录令牌

            // 返回默认登录权限
            ResultDto<List<String>> resultDto = ResultDto.build();
            List<String> authorities = Lists.newArrayList(SecurityConfig.BASE_BEARER_AUTHORITY);
            return resultDto.setResult(authorities);
        } else {
            log.error("解析token失败, 非法的令牌格式, token={}", token);
            return ResultDto.build(ErrorCode.ERROR_ACCESS_PRINCIPAL_CHECK);
        }
    }

}
