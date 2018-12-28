package com.book.api.business.member.contoller;

import com.book.api.business.BaseController;
import com.book.api.business.member.facade.MemberBookFacade;
import com.framework.common.spring.pojo.dto.ResultDto;
import com.framework.common.tool.CollectionsTools;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.framework.common.constant.CommonMessage.ERROR_SYSTEM_PARAM_FORMAT;

/**
 * @Description 会员书籍路由
 * @Author J.W
 * @Date 2018/12/20 15:15
 **/
@Slf4j
@RestController
@RequestMapping("a/mbr/bk")
@Api(value = "auth-member-book", description = "会员书籍路由")
public class MemberBookController extends BaseController {

    @Autowired
    private MemberBookFacade memberBookFacade;

    @ApiOperation("会员收藏书籍")
    @PostMapping(value = "/collect", headers = "Accept-Version=1.0")
    public ResultDto collect(HttpServletRequest request,
                             @ApiParam(name = "bookId", value = "书籍id", required = true)
                             @RequestParam(name = "bookId") Long bookId) {
        Long memberId = super.getCurrentMemberId(request);
        return memberBookFacade.collect(memberId, bookId);
    }

    @ApiOperation("会员删除收藏的书籍")
    @PostMapping(value = "/collection/del", headers = "Accept-Version=1.0")
    public ResultDto delCollection(HttpServletRequest request,
                                   @ApiParam(name = "bookIds", value = "书籍id", required = true)
                                   @RequestParam(name = "bookIds") List<Long> bookIds) {
        if (CollectionsTools.isEmpty(bookIds)) {
            log.error("会员删除收藏的书籍失败, 待删除书籍id数组不能为空, bookIds={}", bookIds);
            return ResultDto.build(ERROR_SYSTEM_PARAM_FORMAT);
        }
        Long memberId = super.getCurrentMemberId(request);
        return memberBookFacade.delCollection(memberId, bookIds);
    }

}
