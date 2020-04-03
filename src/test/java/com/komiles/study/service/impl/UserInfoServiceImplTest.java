package com.komiles.study.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import com.komiles.study.domain.UserInfo;
import com.komiles.study.entity.dto.UserInfoDTO;
import com.komiles.study.service.UserInfoService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author komiles@163.com
 * @date 2020-03-22 12:07
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class UserInfoServiceImplTest {

    @Autowired
    private UserInfoService userInfoService;
    @Test
    void getOne() {
        Long id  = 2L;
        UserInfoDTO userInfoResult = userInfoService.getOne(id);

        log.info("用户名:{},年龄:{}", userInfoResult.getName(), userInfoResult.getAge());
        Assert.assertNotNull(userInfoResult);
    }

    @Test
    void insertOne() {
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setName("kongming");
        userInfoDTO.setAge(22);
        UserInfoDTO userInfoResult = userInfoService.insertOne(userInfoDTO);
        log.info("用户名:{},年龄:{}", userInfoResult.getName(), userInfoResult.getAge());
        Assert.assertNotNull(userInfoResult);
    }

    @Test
    void getList() {
        List<UserInfoDTO> userInfoDTOList = userInfoService.getList();
        Assert.assertNotEquals(0,userInfoDTOList.size());
    }

    @Test
    void updateOne() {
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setId(2L);
        userInfoDTO.setName("张三1");
        userInfoDTO.setAge(18);
        UserInfoDTO userInfoResult = userInfoService.updateOne(userInfoDTO);
        log.info("用户名:{},年龄:{}", userInfoResult.getName(), userInfoResult.getAge());
        Assert.assertNotNull(userInfoResult);

    }

    @Test
    @Transactional
    @Rollback
    void delete() {
        boolean deleteFlag = userInfoService.delete(2L);
        Assert.assertTrue(deleteFlag);
    }
}