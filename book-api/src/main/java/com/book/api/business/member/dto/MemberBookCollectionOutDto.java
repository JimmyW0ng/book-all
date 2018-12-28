package com.book.api.business.member.dto;

import com.book.core.business.member.pojo.bo.MemberBookCollectionBo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Description 会员书籍收藏outDto
 * @Author J.W
 * @Date 2018/12/28 16:52
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MemberBookCollectionOutDto implements Serializable {

    private List<MemberBookCollectionBo> memberBookCollection;

}
