package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_class")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 班级全称
     */
    private String name;

    /**
     * 班级号
     */
    private String number;

    /**
     * 专业名名称（系别）
     */
    private String department;

    /**
     * 专业标识
     */
    @Column(name = "department_id")
    private Integer departmentId;

    /**
     * 辅导员标识
     */
    @Column(name = "instructor_id")
    private Integer instructorId;

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
     * 获取班级全称
     *
     * @return name - 班级全称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置班级全称
     *
     * @param name 班级全称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取班级号
     *
     * @return number - 班级号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置班级号
     *
     * @param number 班级号
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取专业名名称（系别）
     *
     * @return department - 专业名名称（系别）
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置专业名名称（系别）
     *
     * @param department 专业名名称（系别）
     */
    public void setDepartment(String department) {
        this.department = department;
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
     * 获取辅导员标识
     *
     * @return instructor_id - 辅导员标识
     */
    public Integer getInstructorId() {
        return instructorId;
    }

    /**
     * 设置辅导员标识
     *
     * @param instructorId 辅导员标识
     */
    public void setInstructorId(Integer instructorId) {
        this.instructorId = instructorId;
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