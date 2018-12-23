package com.book.api.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Description: 鉴权组件（Spring Security）
 * @Author: J.W
 * @Date: 下午8:26 2018/1/6
 */
@Slf4j
@Component
public class ApiSecurityAuthComponent {


//    @Value("${token.secret}")
//    private String tokenSecret;
//    @Value("${token.expiration}")
//    private int tokenExpiration;
//
//    @Autowired
//    private AuthTokenService authTokenService;
//    @Autowired
//    private AuthClientService authClientService;
//    @Autowired
//    private AccountUserService accountUserService;
//
//    /**
//     * 会员登录获取token
//     *
//     * @param loginDto input dto
//     * @return
//     */
//    public ResultDo login(ApiLoginDto loginDto) {
//        String clientName = loginDto.getClientName();
//        String clientSecret = loginDto.getClientSecret();
//        String loginName = loginDto.getLoginName();
//        String password = loginDto.getPassword();
//        String ip = loginDto.getIp();
//        log.info("会员登录开始...loginName={}, clientName={}, ip={}", loginName, clientName, ip);
//        if (StringTools.isBlank(clientName) || StringTools.isBlank(clientSecret)) {
//            log.error("登录获取token失败，入参缺失！");
//            return ResultDo.build(ApiMessageCode.ERROR_SYSTEM_PARAM_FORMAT);
//        }
//        // 校验手机号
//        if (StringTools.isBlank(loginName) || !RegexTools.checkMobileFormat(loginName)) {
//            return ResultDo.build(ApiMessageCode.ERROR_ACCOUNT_MOBILE_FORMAT);
//        }
//        // 校验密码
//        if (StringTools.isBlank(password) || !RegexTools.checkPassword(password)) {
//            return ResultDo.build(ApiMessageCode.ERROR_ACCOUNT_PASSWORD_FORMAT);
//        }
//        // 校验client
//        ResultDo<AuthClientPo> checkClient = authClientService.checkPrincipal(clientName, clientSecret);
//        if (checkClient.isError()) {
//            return checkClient;
//        }
//        AuthClientPo clientPo = checkClient.getResult();
//        // 校验账户
//        Long mobile = Long.valueOf(loginName);
//        ResultDo<AccountUserPo> checkAccount = this.checkMember(mobile, password);
//        if (checkAccount.isError()) {
//            return checkAccount;
//        }
//        // 生成token
//        AccountUserPo userPo = checkAccount.getResult();
//        ResultDo<ApiLoginOutDto> resultDo = ResultDo.build();
//        try {
//            String accessToken = authTokenService.createToken(loginName,
//                    clientPo.getId(),
//                    // 登录角色根据账户角色转换
//                    AuthTokenLoginRole.valueOf(userPo.getType().getLiteral()),
//                    ip,
//                    tokenExpiration,
//                    tokenSecret);
//            ApiLoginOutDto loginOutDtoDto = new ApiLoginOutDto(accessToken, userPo.getType());
//            return resultDo.setResult(loginOutDtoDto);
//        } catch (GeneralSecurityException e) {
//            return resultDo.setError(ApiMessageCode.ERROR_ENCODE);
//        }
//    }
//
//    /**
//     * 获取权限编码
//     *
//     * @param loginName 用户名
//     * @return
//     */
//    public Collection<GrantedAuthority> getPermissionByLoginName(String loginName) {
//        Collection<GrantedAuthority> authorities = Lists.newArrayList();
//        List<String> permissions = accountUserService.getPermissionByLoginName(loginName);
//        if (CollectionsTools.isNotEmpty(permissions)) {
//            permissions.forEach(item -> authorities.add(new SimpleGrantedAuthority(item)));
//        }
//        return authorities;
//    }
//

//
//    /**
//     * 根据token加载用户信息
//     *
//     * @param tokenPo token
//     */
//    public ResultDo loadCurrentAccountUserInfo(AuthTokenPo tokenPo) {
//        Optional<AccountUserPo> existUser = accountUserService.getByMobile(Long.valueOf(tokenPo.getLoginName()));
//        if (!existUser.isPresent()) {
//            return ResultDo.build(ApiMessageCode.ERROR_ACCOUNT_USER_NOT_EXISTS);
//        }
//        AccountUserPo userPo = existUser.get();
//        userPo.setPassword(null);
//        userPo.setSalt(null);
//        if (AccountUserStatus.cancel.equals(userPo.getStatus())) {
//            log.error("当前用户已注销, userName={}", tokenPo.getLoginName());
//            return ResultDo.build(ApiMessageCode.ERROR_ACCOUNT_USER_IS_CANCEL);
//        } else if (AccountUserStatus.freeze.equals(userPo.getStatus())) {
//            log.error("当前用户已冻结, userName={}", tokenPo.getLoginName());
//            return ResultDo.build(ApiMessageCode.ERROR_ACCOUNT_USER_IS_FREEZE);
//        }
//        WebTools.getCurrentRequest().setAttribute(ApiConstant.CURENT_ACCOUNT_USER, userPo);
//        return ResultDo.build();
//    }
//
//    /**
//     * 校验登录主体的身份
//     *
//     * @param mobile   手机号
//     * @param password 密码
//     * @throws AuthenticationException
//     */
//    private ResultDo<AccountUserPo> checkMember(Long mobile, String password) throws AuthenticationException {
//        Optional<AccountUserPo> existAccountUser = accountUserService.getByMobile(mobile);
//        if (!existAccountUser.isPresent()) {
//            log.error("该手机号帐号不存在，mobile={}", mobile);
//            return ResultDo.build(ApiMessageCode.ERROR_ACCOUNT_USER_NOT_EXISTS);
//        }
//        AccountUserPo accountUserPo = existAccountUser.get();
//        if (AccountUserStatus.cancel.equals(accountUserPo.getStatus())) {
//            log.error("该帐号当前已被注销, mobile={}", mobile);
//            return ResultDo.build(ApiMessageCode.ERROR_ACCOUNT_USER_IS_CANCEL);
//        } else if (AccountUserStatus.freeze.equals(accountUserPo.getStatus())) {
//            log.error("该帐号当前限制登录, mobile={}", mobile);
//            return ResultDo.build(ApiMessageCode.ERROR_ACCOUNT_USER_IS_FREEZE);
//        }
//        String memberPwdEncode;
//        try {
//            memberPwdEncode = CryptTools.aesEncrypt(password, accountUserPo.getSalt());
//        } catch (GeneralSecurityException e) {
//            log.error("会员密码加密失败，salt:{}", accountUserPo.getSalt());
//            return ResultDo.build(ApiMessageCode.ERROR_ENCODE);
//        }
//        if (!memberPwdEncode.equals(accountUserPo.getPassword())) {
//            return ResultDo.build(ApiMessageCode.ERROR_ACCOUNT_PASSWORD_NOT_MATCH);
//        }
//        ResultDo<AccountUserPo> resultDo = ResultDo.build();
//        return resultDo.setResult(accountUserPo);
//    }

}
