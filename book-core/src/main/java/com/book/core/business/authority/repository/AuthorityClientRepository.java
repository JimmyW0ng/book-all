package com.book.core.business.authority.repository;

import com.book.core.business.authority.pojo.po.AuthorityClientPo;
import com.book.core.domain.tables.records.AuthorityClientRecord;
import com.framework.spring.boot.jooq.repository.AbstractCRUDRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.book.core.domain.Tables.AUTHORITY_CLIENT;

/**
 * 鉴权客户端仓库
 */
@Repository
public class AuthorityClientRepository extends AbstractCRUDRepository<AuthorityClientRecord, Long, AuthorityClientPo> {

    @Autowired
    public AuthorityClientRepository(DSLContext dslContext) {
        super(dslContext, AUTHORITY_CLIENT, AUTHORITY_CLIENT.ID, AuthorityClientPo.class);
    }

    /**
     * @Description 根据客户端名称查询
     * @Author J.W
     * @Date 2018/12/24 9:53
     * @Param [name]
     * @Return java.util.Optional<com.book.core.business.authority.pojo.po.AuthorityClientPo>
     **/
    public Optional<AuthorityClientPo> existByName(String name) {
        return dslContext.selectFrom(AUTHORITY_CLIENT)
                .where(AUTHORITY_CLIENT.NAME.eq(name))
                .and(AUTHORITY_CLIENT.ARCHIVED.eq(true))
                .and(AUTHORITY_CLIENT.DEL_FLAG.eq(false))
                .fetchOptionalInto(AuthorityClientPo.class);
    }

    /**
     * @Description 根据主键查询
     * @Author J.W
     * @Date 2018/12/24 15:56
     * @Param [id]
     * @Return java.util.Optional<com.book.core.business.authority.pojo.po.AuthorityClientPo>
     **/
    public Optional<AuthorityClientPo> existById(Long id) {
        return dslContext.selectFrom(AUTHORITY_CLIENT)
                .where(AUTHORITY_CLIENT.ID.eq(id))
                .and(AUTHORITY_CLIENT.DEL_FLAG.eq(false))
                .fetchOptionalInto(AuthorityClientPo.class);
    }

}
