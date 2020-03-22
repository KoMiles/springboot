package com.komiles.study.controller;

import com.komiles.study.domain.UserInfo;
import com.komiles.study.service.impl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author komiles@163.com
 * @date 2020-03-22 12:04
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoServiceImpl userInfoService;

    @GetMapping("/get")
    public UserInfo getUser(@RequestParam("user_id") Long id)
    {
        return userInfoService.getOne(id);
    }
}
