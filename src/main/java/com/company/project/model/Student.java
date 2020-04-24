package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 全名
     */
    private String name;

    /**
     * 学号
     */
    private String number;

    /**
     * 入学年份，年级
     */
    private Integer grade;

    @Column(name = "class_name")
    private String className;

    /**
     * 所属班级标识
     */
    @Column(name = "class_number")
    private String classNumber;

    /**
     * 联系方式，电话
     */
    private String phone;

    /**
     * 用户邮箱
     */
    private String email;

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
     * 获取全名
     *
     * @return name - 全名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置全名
     *
     * @param name 全名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取学号
     *
     * @return number - 学号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置学号
     *
     * @param number 学号
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取入学年份，年级
     *
     * @return grade - 入学年份，年级
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * 设置入学年份，年级
     *
     * @param grade 入学年份，年级
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * @return class_name
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * 获取所属班级标识
     *
     * @return class_number - 所属班级标识
     */
    public String getClassNumber() {
        return classNumber;
    }

    /**
     * 设置所属班级标识
     *
     * @param classNumber 所属班级标识
     */
    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    /**
     * 获取联系方式，电话
     *
     * @return phone - 联系方式，电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系方式，电话
     *
     * @param phone 联系方式，电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
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