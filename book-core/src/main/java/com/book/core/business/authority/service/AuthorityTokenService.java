package com.book.core.business.authority.service;

import com.book.core.business.authority.pojo.po.AuthorityClientPo;
import com.book.core.business.authority.pojo.po.AuthorityTokenPo;
import com.book.core.business.authority.repository.AuthorityClientRepository;
import com.book.core.business.authority.repository.AuthorityTokenRepository;
import com.book.core.domain.enums.AuthorityTokenTarget;
import com.framework.common.spring.pojo.dto.ResultDto;
import com.framework.common.tool.DateTools;
import com.framework.common.tool.StringTools;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Optional;

import static com.book.core.constant.ErrorCode.ERROR_ACCESS_PRINCIPAL_CHECK;

/**
 * @Description: 鉴权登录服务类
 * @Author: J.W
 * @Date: 9:39 PM 2018/12/23
 */
@Slf4j
@Service
public class AuthorityTokenService {

    @Autowired
    private AuthorityClientRepository authorityClientRepository;
    @Autowired
    private AuthorityTokenRepository authorityTokenRepository;

    /**
     * @Description api登录
     * @Author J.W
     * @Date 2018/12/24 15:53
     * @Param [clientId, memberId, ip]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<java.lang.String>
     **/
    public ResultDto<String> loginForApi(Long clientId, Long memberId, String ip) {
        log.info("api登录开始...clientId={}, memberId={}, ip={}", clientId, memberId, ip);
        // 获取客户端信息
        Optional<AuthorityClientPo> existClient = authorityClientRepository.existById(clientId);
        if (!existClient.isPresent()) {
            log.error("api登录失败, 客户端不存在, clientId={}", clientId);
            return ResultDto.build(ERROR_ACCESS_PRINCIPAL_CHECK);
        }
        // 通过校验
        AuthorityClientPo client = existClient.get();
        // 生成token
        String token = StringTools.getUUID();
        // 过期时间
        Timestamp expire = DateTools.addSecond(DateTools.getCurrentDateTime(), client.getAccessTokenValidity().intValue());
        // 保存Token信息
        AuthorityTokenPo insertPo = new AuthorityTokenPo();
        insertPo.setTargetId(memberId);
        insertPo.setTarget(AuthorityTokenTarget.member);
        insertPo.setClientId(client.getId());
        insertPo.setAccessIp(ip);
        insertPo.setExpireTime(expire);
        insertPo.setCode(token);
        authorityTokenRepository.insert(insertPo);
        // 删除其他token
        authorityTokenRepository.delAfterNewToken(insertPo.getTargetId(), insertPo.getTarget(), insertPo.getId());
        ResultDto<String> resultDto = ResultDto.build();
        return resultDto.setResult(token);
    }

}
