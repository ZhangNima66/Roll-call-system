package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 教师名称
     */
    private String name;

    /**
     * 专业标识
     */
    @Column(name = "department_id")
    private Integer departmentId;

    /**
     * 教师编号
     */
    private Integer number;

    /**
     * 教师职称
     */
    private String title;

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
     * 获取教师名称
     *
     * @return name - 教师名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置教师名称
     *
     * @param name 教师名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取专业标识
     *
     * @return department_id - 专业标识
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置专业标识
     *
     * @param departmentId 专业标识
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取教师编号
     *
     * @return number - 教师编号
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置教师编号
     *
     * @param number 教师编号
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取教师职称
     *
     * @return title - 教师职称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置教师职称
     *
     * @param title 教师职称
     */
    public void setTitle(String title) {
        this.title = title;
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