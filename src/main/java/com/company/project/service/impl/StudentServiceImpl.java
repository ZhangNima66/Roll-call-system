package com.company.project.service.impl;

import com.company.project.dao.StudentMapper;
import com.company.project.model.Student;
import com.company.project.service.StudentService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Ma XueZhi on 2020/04/12.
 */
@Service
@Transactional
public class StudentServiceImpl extends AbstractService<Student> implements StudentService {
    @Resource
    private StudentMapper tStudentMapper;

}
