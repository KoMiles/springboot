package com.komiles.study.controller;

import com.komiles.study.domain.Student;
import com.komiles.study.domain.User;
import com.komiles.study.entity.dto.UserDto;
import com.komiles.study.entity.param.UserParam;
import com.komiles.study.service.impl.StudentServiceImpl;
import com.komiles.study.service.impl.UserServiceImpl;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myBatis")
@Slf4j
public class MyBatisController {

    @Autowired
    private StudentServiceImpl studentService;

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/test")
    public void test(@RequestParam("id") Integer id) {
        Student result = studentService.getStudentById(id);
        log.info("【查询数据】Student:{}", result);
    }

    @GetMapping("/user/get")
    public UserDto userInfo(@RequestParam("user_id") Integer id)
    {
        UserDto resultUser = userService.findInfoById(id);
        return resultUser;
    }

    @PostMapping("/user/insert")
    public UserDto userInsert(@Valid UserParam userParam , BindingResult bindingResult)
    {
        if(bindingResult.hasErrors()) {
            log.info("字段：{},错误提示为:{}", bindingResult.getObjectName(), bindingResult.getFieldError().getDefaultMessage());
        }
        return userService.insertUser(userParam);
    }

    @PostMapping("/user/update")
    public UserDto userUpdate(UserParam userParam)
    {
        return userService.updateUser(userParam);
    }

    @PostMapping("/user/delete")
    public Boolean userDelete(@RequestParam("user_id") Integer userId)
    {
        return userService.deleteUser(userId);
    }

}
