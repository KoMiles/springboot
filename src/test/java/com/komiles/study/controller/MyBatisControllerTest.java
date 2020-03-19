package com.komiles.study.controller;

import static org.junit.jupiter.api.Assertions.*;

import com.komiles.study.entity.dto.UserDto;
import com.komiles.study.entity.param.UserParam;
import com.komiles.study.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class MyBatisControllerTest {

    @Autowired
    private UserService userService;

    @Test
    void userInfo() {
        UserDto userDto = userService.findInfoById(2);
        log.info("用户信息：{}", userDto);
        Assert.assertNotNull(userDto);
    }

    @Test
    void userInsert() {
        UserParam userParam = new UserParam();
        userParam.setUsername("孔明a");
        userParam.setPassword("kongming123");
        UserDto resultDto = userService.insertUser(userParam);
        Assert.assertNotNull(resultDto);
    }

    @Test
    void userUpdate() {
        UserParam userParam = new UserParam();
        userParam.setId(2);
        userParam.setUsername("李四update1");
        userParam.setPassword("hhhh");
        UserDto resultDto = userService.updateUser(userParam);
        log.info("用户信息：{}", resultDto);
        Assert.assertNotNull(resultDto);
    }

    @Test
    void userDelete() {
        Boolean result = userService.deleteUser(6);
        log.info("删除结果：{}", result);
        Assert.assertTrue(result);
    }
}