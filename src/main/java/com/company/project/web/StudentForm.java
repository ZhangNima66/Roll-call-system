package com.company.project.web;

import com.company.project.core.mybatis.Pageable;

/**
 * @author ZhangNima
 */
public class StudentForm {

    static class Query extends Pageable {
        private String classNumber;

        public String getClassNumber() {
            return classNumber;
        }

        public void setClassNumber(String classNumber) {
            this.classNumber = classNumber;
        }
    }

}
