package com.company.project.web;

import com.company.project.core.mybatis.Pageable;

/**
 * @author ZhangNima
 */
public class CourseForm {
    static class Query extends Pageable {
        private String name;
        private String classNumber;
        private Integer teacherId;
        private Integer week;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getClassNumber() {
            return classNumber;
        }

        public void setClassNumber(String classNumber) {
            this.classNumber = classNumber;
        }

        public Integer getTeacherId() {
            return teacherId;
        }

        public void setTeacherId(Integer teacherId) {
            this.teacherId = teacherId;
        }

        public Integer getWeek() {
            return week;
        }

        public void setWeek(Integer week) {
            this.week = week;
        }
    }
}
