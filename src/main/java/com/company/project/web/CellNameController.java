package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.dao.StudentMapper;
import com.company.project.model.Student;
import com.company.project.utils.RedisUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * @author ZhangNima
 */
@RestController
@RequestMapping("cell")
public class CellNameController {

    @Resource
    private RedisUtil redisUtil;

    @Autowired
    private StudentMapper studentMapper;

    @PostMapping("/start")
    public Result start(String classNumber) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("1","1");
        boolean hmset = redisUtil.hmset(classNumber, map);
        return ResultGenerator.genSuccessResult(hmset);
    }

    @GetMapping("/login")
    public Result login(HttpServletRequest request, String name, String number) {

        Student student = new Student();
        student.setName(name);
        student.setNumber(number);
        student = studentMapper.selectOne(student);

        if (!redisUtil.hasKey(student.getClassNumber())) {
            return ResultGenerator.genFailResult("课程还没开始！");
        }
        ;

        String login = (String) redisUtil.hget(student.getClassNumber(), number);
        if (StringUtils.isNotEmpty(login)) {
            return ResultGenerator.genFailResult("该用户已经登录！");
        }

        redisUtil.hset(student.getClassNumber(), number, name);

        //获取IP地址
        //String ipAddress = IpUtil.getIpAddr(request);

        return ResultGenerator.genSuccessResult("登录成功！");
    }


}
