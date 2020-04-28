package com.komiles.study.mapper;

import com.komiles.study.domain.UserInfo;
import com.komiles.study.entity.param.UserInfoParam;
import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    List<UserInfo> selectAll();

    int updateByPrimaryKey(UserInfo record);

    List<UserInfo> selectAllBySearch(UserInfoParam userInfoParam);
}