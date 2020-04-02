package com.komiles.study.service.impl;

import com.komiles.study.domain.User;
import com.komiles.study.entity.dto.UserDto;
import com.komiles.study.entity.param.UserParam;
import com.komiles.study.mapper.UserMapper;
import com.komiles.study.service.UserService;
import java.io.Serializable;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.invoke.empty.Empty;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto findInfoById(Integer id) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userMapper.findOne(id),userDto);
        return userDto;
    }

    @Override
    public UserDto insertUser(UserParam userParam) {
        UserParam insertData = new UserParam();
        insertData.setPassword(userParam.getPassword());
        insertData.setUsername(userParam.getUsername());
        userMapper.insert(insertData);
        return findInfoById(insertData.getId());
    }

    @Override
    public UserDto updateUser(UserParam userParam) {
        UserParam updateData = new UserParam();
        updateData.setId(userParam.getId());
        updateData.setUsername(userParam.getUsername());
        updateData.setPassword(userParam.getPassword());
        userMapper.update(updateData);
        return findInfoById(userParam.getId());
    }

    @Override
    public Boolean deleteUser(Integer id) {
        UserParam userParam = new UserParam();
        userParam.setId(id);
        Integer deleteRes = userMapper.delete(userParam);
        Boolean result = deleteRes > 0 ? true : false;
        return result;
    }
}
