package com.komiles.study.service;

import com.komiles.study.entity.dto.UserDto;
import com.komiles.study.entity.param.UserParam;

public interface UserService {
    UserDto findInfoById(Integer id);

    UserDto insertUser(UserParam userParam);

    UserDto updateUser(UserParam userParam);

    Boolean deleteUser(Integer id);
}
