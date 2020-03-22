package com.komiles.study.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import com.komiles.study.domain.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author komiles@163.com
 * @date 2020-03-22 12:07
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class UserInfoServiceImplTest {

    @Autowired
    private UserInfoServiceImpl userInfoService;
    @Test
    void getOne() {
        Long id  = 2L;
        UserInfo userInfoResult = userInfoService.getOne(id);
        log.info("用户名:{},年龄:{}", userInfoResult.getName(), userInfoResult.getAge());
        Assert.assertNotNull(userInfoResult);
    }
}