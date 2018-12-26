package com.book.core.business.authority.repository;

import com.book.core.business.authority.pojo.po.AuthorityTokenPo;
import com.book.core.domain.enums.AuthorityTokenTarget;
import com.book.core.domain.tables.records.AuthorityTokenRecord;
import com.framework.common.tool.DateTools;
import com.framework.spring.boot.jooq.repository.AbstractCRUDRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.book.core.domain.Tables.AUTHORITY_TOKEN;

/**
 * 鉴权登陆仓库
 */
@Repository
public class AuthorityTokenRepository extends AbstractCRUDRepository<AuthorityTokenRecord, Long, AuthorityTokenPo> {

    @Autowired
    public AuthorityTokenRepository(DSLContext dslContext) {
        super(dslContext, AUTHORITY_TOKEN, AUTHORITY_TOKEN.ID, AuthorityTokenPo.class);
    }

    /**
     * @Description 生成新的token以后删除老的token
     * @Author J.W
     * @Date 2018/12/24 16:03
     * @Param [targetId, target, newTokenId]
     * @Return int
     **/
    public int delAfterNewToken(Long targetId, AuthorityTokenTarget target, Long newTokenId) {
        return dslContext.update(AUTHORITY_TOKEN)
                .set(AUTHORITY_TOKEN.DEL_FLAG, true)
                .where(AUTHORITY_TOKEN.TARGET_ID.eq(targetId))
                .and(AUTHORITY_TOKEN.TARGET.eq(target))
                .and(AUTHORITY_TOKEN.ID.notEqual(newTokenId))
                .and(AUTHORITY_TOKEN.DEL_FLAG.eq(false))
                .execute();
    }

    /**
     * @Description 根据code查询
     * @Author J.W
     * @Date 2018/12/25 11:13
     * @Param [code]
     * @Return java.util.Optional<com.book.core.business.authority.pojo.po.AuthorityTokenPo>
     **/
    public Optional<AuthorityTokenPo> existByCode(String code) {
        return dslContext.selectFrom(AUTHORITY_TOKEN)
                .where(AUTHORITY_TOKEN.CODE.eq(code))
                .and(AUTHORITY_TOKEN.EXPIRE_TIME.greaterThan(DateTools.getCurrentDateTime()))
                .and(AUTHORITY_TOKEN.DEL_FLAG.eq(false))
                .fetchOptionalInto(AuthorityTokenPo.class);
    }

}
