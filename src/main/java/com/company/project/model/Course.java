package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 课程名称
     */
    private String name;

    /**
     * 课程所属班级编号
     */
    @Column(name = "class_name")
    private String className;

    /**
     * 课程所属班级编号
     */
    @Column(name = "class_number")
    private String classNumber;

    /**
     * 专业标识
     */
    @Column(name = "department_id")
    private Integer departmentId;

    /**
     * 科任老师
     */
    private String teacher;

    /**
     * 科任老师标识
     */
    @Column(name = "teacher_id")
    private Integer teacherId;

    /**
     * 课程周次
     */
    private String duration;

    /**
     * 上课时间
     */
    private Integer week;

    /**
     * 节次
     */
    private String period;

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
     * 获取课程名称
     *
     * @return name - 课程名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置课程名称
     *
     * @param name 课程名称
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * 获取课程所属班级编号
     *
     * @return class_number - 课程所属班级编号
     */
    public String getClassNumber() {
        return classNumber;
    }

    /**
     * 设置课程所属班级编号
     *
     * @param classNumber 课程所属班级编号
     */
    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
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
     * 获取科任老师
     *
     * @return teacher - 科任老师
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * 设置科任老师
     *
     * @param teacher 科任老师
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    /**
     * 获取科任老师标识
     *
     * @return teacher_id - 科任老师标识
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * 设置科任老师标识
     *
     * @param teacherId 科任老师标识
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * 获取课程周次
     *
     * @return duration - 课程周次
     */
    public String getDuration() {
        return duration;
    }

    /**
     * 设置课程周次
     *
     * @param duration 课程周次
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * 获取上课时间
     *
     * @return week - 上课时间
     */
    public Integer getWeek() {
        return week;
    }

    /**
     * 设置上课时间
     *
     * @param week 上课时间
     */
    public void setWeek(Integer week) {
        this.week = week;
    }

    /**
     * 获取节次
     *
     * @return period - 节次
     */
    public String getPeriod() {
        return period;
    }

    /**
     * 设置节次
     *
     * @param period 节次
     */
    public void setPeriod(String period) {
        this.period = period;
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
