package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Course;
import com.company.project.model.Student;
import com.company.project.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Ma XueZhi
 * @date 2020/04/11
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @PostMapping
    public Result add(Student student) {
        studentService.save(student);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id) {
        studentService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("{id}")
    public Result update(@PathVariable Integer id, Student student) {
        studentService.update(student);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("{id}")
    public Result detail(@PathVariable Integer id) {
        Student student = studentService.findById(id);
        return ResultGenerator.genSuccessResult(student);
    }

    @GetMapping
    public Result list(StudentForm.Query query) {
        PageHelper.startPage(query.getPage(), query.getSize());

        Condition condition = new Condition(Student.class);
        Example.Criteria criteria = condition.createCriteria();
        if (StringUtils.isNotEmpty(query.getClassNumber())) {
            criteria.andEqualTo("classNumber", query.getClassNumber());
        }
        List<Student> list = studentService.findByCondition(condition);

        PageInfo<Student> pageInfo = new PageInfo<>(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
