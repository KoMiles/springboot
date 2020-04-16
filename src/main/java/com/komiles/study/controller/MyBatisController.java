package com.komiles.study.controller;

import com.komiles.study.domain.Student;
import com.komiles.study.service.impl.StudentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myBatis")
@Slf4j
public class MyBatisController {

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/test")
    public void test(@RequestParam("id") Integer id) {
        Student result = studentService.getStudentById(id);
        log.info("【查询数据】Student:{}", result);
    }
}
