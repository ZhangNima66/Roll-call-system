package com.company.project.service.impl;

import com.company.project.dao.CourseMapper;
import com.company.project.model.Course;
import com.company.project.service.CourseService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Ma XueZhi on 2020/04/13.
 */
@Service
@Transactional
public class CourseServiceImpl extends AbstractService<Course> implements CourseService {
    @Resource
    private CourseMapper tCourseMapper;

}
