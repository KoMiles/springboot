package com.komiles.study.service.impl;

import com.komiles.study.domain.UserInfo;
import com.komiles.study.mapper.UserInfoMapper;
import com.komiles.study.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author komiles@163.com
 * @date 2020-03-22 11:54
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getOne(Long id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }
}
