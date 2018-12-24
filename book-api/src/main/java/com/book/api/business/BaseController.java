package com.book.api.business;

import javax.servlet.http.HttpServletRequest;

import static com.book.api.constant.ApiConstant.REQUEST_CURRENT_CLIENT;

/**
 * @Description 控制器基类
 * @Author J.W
 * @Date 2018/12/21 14:54
 **/
public abstract class BaseController {

    /**
     * @return java.lang.Long
     * @Description 获取当前请求的客户端标识
     * @Author J.W
     * @Date 2018/12/21 15:02
     * @Param [req]
     **/
    protected Long getCurrentClientId(HttpServletRequest req) {
        return (Long) req.getAttribute(REQUEST_CURRENT_CLIENT);
    }

}
