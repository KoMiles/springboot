package com.komiles.study.service;

import com.komiles.study.entity.dto.UserInfoDTO;
import java.util.List;

/**
 * @author komiles@163.com
 * @date 2020-04-03 18:31
 */
public interface UserInfoService {
    UserInfoDTO getOne(Long id);

    UserInfoDTO insertOne(UserInfoDTO userInfoDTO);

    List<UserInfoDTO> getList();

    Boolean delete(Long id);

    UserInfoDTO updateOne(UserInfoDTO userInfoDTO);


    List<UserInfoDTO> getListByPage(Integer pageNum, Integer pageSize);

}
