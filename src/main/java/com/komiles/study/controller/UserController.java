package com.komiles.study.controller;

import com.komiles.study.domain.Student;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/get")
    public UserDto userInfo(@RequestParam("user_id") Integer id)
    {
        UserDto resultUser = userService.findInfoById(id);
        return resultUser;
    }

    @PostMapping("/insert")
    public UserDto userInsert(@Valid UserParam userParam , BindingResult bindingResult)
    {
        if(bindingResult.hasErrors()) {
            log.info("字段：{},错误提示为:{}", bindingResult.getFieldError().getField(), bindingResult.getFieldError().getDefaultMessage());
        }
        return userService.insertUser(userParam);
    }

    @PostMapping("/update")
    public UserDto userUpdate(UserParam userParam)
    {
        return userService.updateUser(userParam);
    }

    @PostMapping("/delete")
    public Boolean userDelete(@RequestParam("user_id") Integer userId)
    {
        return userService.deleteUser(userId);
    }

}
