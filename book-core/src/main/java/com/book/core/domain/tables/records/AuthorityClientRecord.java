/*
 * This file is generated by jOOQ.
*/
package com.book.core.domain.tables.records;


import com.book.core.domain.enums.AuthorityClientLoginSource;
import com.book.core.domain.tables.AuthorityClient;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 鉴权客户端表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AuthorityClientRecord extends UpdatableRecordImpl<AuthorityClientRecord> implements Record15<Long, String, String, String, String, Integer, Integer, String, Boolean, AuthorityClientLoginSource, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = 1117287999;

    /**
     * Create a detached AuthorityClientRecord
     */
    public AuthorityClientRecord() {
        super(AuthorityClient.AUTHORITY_CLIENT);
    }

    /**
     * Create a detached, initialised AuthorityClientRecord
     */
    public AuthorityClientRecord(Long id, String name, String secret, String salt, String role, Integer accessTokenValidity, Integer refreshTokenValidity, String description, Boolean archived, AuthorityClientLoginSource loginSource, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(AuthorityClient.AUTHORITY_CLIENT);

        set(0, id);
        set(1, name);
        set(2, secret);
        set(3, salt);
        set(4, role);
        set(5, accessTokenValidity);
        set(6, refreshTokenValidity);
        set(7, description);
        set(8, archived);
        set(9, loginSource);
        set(10, createAt);
        set(11, updateAt);
        set(12, remark);
        set(13, delFlag);
        set(14, version);
    }

    /**
     * Getter for <code>book.authority_client.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>book.authority_client.id</code>. 主键
     */
    public AuthorityClientRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>book.authority_client.name</code>. 客户端名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>book.authority_client.name</code>. 客户端名称
     */
    public AuthorityClientRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>book.authority_client.secret</code>. 客户端秘钥
     */
    public String getSecret() {
        return (String) get(2);
    }

    /**
     * Setter for <code>book.authority_client.secret</code>. 客户端秘钥
     */
    public AuthorityClientRecord setSecret(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>book.authority_client.salt</code>. 盐
     */
    public String getSalt() {
        return (String) get(3);
    }

    /**
     * Setter for <code>book.authority_client.salt</code>. 盐
     */
    public AuthorityClientRecord setSalt(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>book.authority_client.role</code>. 角色
     */
    public String getRole() {
        return (String) get(4);
    }

    /**
     * Setter for <code>book.authority_client.role</code>. 角色
     */
    public AuthorityClientRecord setRole(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>book.authority_client.access_token_validity</code>.
     */
    public Integer getAccessTokenValidity() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>book.authority_client.access_token_validity</code>.
     */
    public AuthorityClientRecord setAccessTokenValidity(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>book.authority_client.refresh_token_validity</code>.
     */
    public Integer getRefreshTokenValidity() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>book.authority_client.refresh_token_validity</code>.
     */
    public AuthorityClientRecord setRefreshTokenValidity(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>book.authority_client.description</code>.
     */
    public String getDescription() {
        return (String) get(7);
    }

    /**
     * Setter for <code>book.authority_client.description</code>.
     */
    public AuthorityClientRecord setDescription(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>book.authority_client.archived</code>. 是否激活
     */
    public Boolean getArchived() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>book.authority_client.archived</code>. 是否激活
     */
    public AuthorityClientRecord setArchived(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>book.authority_client.login_source</code>. 登录来源：微信小程序；后台管理；h5；苹果；安卓；web；其他；
     */
    public AuthorityClientLoginSource getLoginSource() {
        return (AuthorityClientLoginSource) get(9);
    }

    /**
     * Setter for <code>book.authority_client.login_source</code>. 登录来源：微信小程序；后台管理；h5；苹果；安卓；web；其他；
     */
    public AuthorityClientRecord setLoginSource(AuthorityClientLoginSource value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>book.authority_client.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>book.authority_client.create_at</code>. 创建时间
     */
    public AuthorityClientRecord setCreateAt(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>book.authority_client.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>book.authority_client.update_at</code>. 更新时间
     */
    public AuthorityClientRecord setUpdateAt(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>book.authority_client.remark</code>. 备注信息
     */
    public String getRemark() {
        return (String) get(12);
    }

    /**
     * Setter for <code>book.authority_client.remark</code>. 备注信息
     */
    public AuthorityClientRecord setRemark(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>book.authority_client.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>book.authority_client.del_flag</code>. 删除标记
     */
    public AuthorityClientRecord setDelFlag(Boolean value) {
        set(13, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>book.authority_client.version</code>.
     */
    public Long getVersion() {
        return (Long) get(14);
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>book.authority_client.version</code>.
     */
    public AuthorityClientRecord setVersion(Long value) {
        set(14, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, String, String, String, String, Integer, Integer, String, Boolean, AuthorityClientLoginSource, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, String, String, String, String, Integer, Integer, String, Boolean, AuthorityClientLoginSource, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return AuthorityClient.AUTHORITY_CLIENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AuthorityClient.AUTHORITY_CLIENT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AuthorityClient.AUTHORITY_CLIENT.SECRET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return AuthorityClient.AUTHORITY_CLIENT.SALT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return AuthorityClient.AUTHORITY_CLIENT.ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return AuthorityClient.AUTHORITY_CLIENT.ACCESS_TOKEN_VALIDITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return AuthorityClient.AUTHORITY_CLIENT.REFRESH_TOKEN_VALIDITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return AuthorityClient.AUTHORITY_CLIENT.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return AuthorityClient.AUTHORITY_CLIENT.ARCHIVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<AuthorityClientLoginSource> field10() {
        return AuthorityClient.AUTHORITY_CLIENT.LOGIN_SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return AuthorityClient.AUTHORITY_CLIENT.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return AuthorityClient.AUTHORITY_CLIENT.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return AuthorityClient.AUTHORITY_CLIENT.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return AuthorityClient.AUTHORITY_CLIENT.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field15() {
        return AuthorityClient.AUTHORITY_CLIENT.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSecret();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getAccessTokenValidity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getRefreshTokenValidity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getArchived();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityClientLoginSource component10() {
        return getLoginSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component14() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component15() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSecret();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getAccessTokenValidity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getRefreshTokenValidity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getArchived();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityClientLoginSource value10() {
        return getLoginSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value15() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityClientRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityClientRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityClientRecord value3(String value) {
        setSecret(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityClientRecord value4(String value) {
        setSalt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityClientRecord value5(String value) {
        setRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityClientRecord value6(Integer value) {
        setAccessTokenValidity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityClientRecord value7(Integer value) {
        setRefreshTokenValidity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityClientRecord value8(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityClientRecord value9(Boolean value) {
        setArchived(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityClientRecord value10(AuthorityClientLoginSource value) {
        setLoginSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityClientRecord value11(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityClientRecord value12(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityClientRecord value13(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityClientRecord value14(Boolean value) {
        setDelFlag(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityClientRecord value15(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityClientRecord values(Long value1, String value2, String value3, String value4, String value5, Integer value6, Integer value7, String value8, Boolean value9, AuthorityClientLoginSource value10, Timestamp value11, Timestamp value12, String value13, Boolean value14, Long value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }
}