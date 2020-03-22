package com.komiles.study.service;

import com.komiles.study.domain.UserInfo;

/**
 * @author komiles@163.com
 * @date 2020-03-22 11:53
 */
public interface UserInfoService {
    UserInfo getOne(Long id);
}
