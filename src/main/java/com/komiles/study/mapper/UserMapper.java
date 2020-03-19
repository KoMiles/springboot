package com.komiles.study.mapper;

import com.komiles.study.domain.User;
import com.komiles.study.entity.param.UserParam;

public interface UserMapper {
    User findOne(Integer id);

    Integer insert(UserParam userParam);

    void update(UserParam userParam);

    Integer delete(UserParam userParam);
}
