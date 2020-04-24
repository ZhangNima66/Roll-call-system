package com.company.project.service.impl;

import com.company.project.dao.ClassMapper;
import com.company.project.model.Class;
import com.company.project.service.ClassService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Ma XueZhi on 2020/04/12.
 */
@Service
@Transactional
public class ClassServiceImpl extends AbstractService<Class> implements ClassService {
    @Resource
    private ClassMapper tClassMapper;

}
