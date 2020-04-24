package com.company.project.model;

import com.company.project.core.mybatis.type.StringListTypeHandler;
import tk.mybatis.mapper.annotation.ColumnType;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "s_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 登录名
     */
    private String login;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 全名
     */
    @Column(name = "full_name")
    private String fullName;

    /**
     * 用户角色
     */
    @ColumnType(typeHandler = StringListTypeHandler.class)
    private List<String> authorities;

    /**
     * 用户角色实体
     */
    @Transient
    private Object role;

    /**
     * 状态
     */
    private Boolean activated;

    /**
     * 创建人
     */
    @Column(name = "created_by")
    private String createdBy;

    /**
     * 更新人
     */
    @Column(name = "updated_by")
    private String updatedBy;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    public Object getRole() {
        return role;
    }

    public void setRole(Object role) {
        this.role = role;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取登录名
     *
     * @return login - 登录名
     */
    public String getLogin() {
        return login;
    }

    /**
     * 设置登录名
     *
     * @param login 登录名
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户邮箱
     *
     * @return email - 用户邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置用户邮箱
     *
     * @param email 用户邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取全名
     *
     * @return full_name - 全名
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 设置全名
     *
     * @param fullName 全名
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * 获取用户角色
     *
     * @return authorities - 用户角色
     */
    public List<String> getAuthorities() {
        return authorities;
    }

    /**
     * 设置用户角色
     *
     * @param authorities 用户角色
     */
    public void setAuthorities(List<String> authorities) {
        this.authorities = authorities;
    }

    /**
     * 获取状态
     *
     * @return activated - 状态
     */
    public Boolean getActivated() {
        return activated;
    }

    /**
     * 设置状态
     *
     * @param activated 状态
     */
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    /**
     * 获取创建人
     *
     * @return created_by - 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取更新人
     *
     * @return updated_by - 更新人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置更新人
     *
     * @param updatedBy 更新人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}