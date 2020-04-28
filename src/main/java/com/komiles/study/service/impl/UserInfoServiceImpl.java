package com.komiles.study.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.komiles.study.domain.UserInfo;
import com.komiles.study.entity.common.PageDTO;
import com.komiles.study.entity.dto.UserInfoDTO;
import com.komiles.study.mapper.UserInfoMapper;
import com.komiles.study.service.UserInfoService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.BeanUtils;
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
    public UserInfoDTO getOne(Long id) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        BeanUtils.copyProperties(userInfo,userInfoDTO);
        return userInfoDTO;
    }

    @Override
    public UserInfoDTO insertOne(UserInfoDTO userInfoDTO) {
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(userInfoDTO.getAge());
        userInfo.setName(userInfoDTO.getName());
        userInfoMapper.insert(userInfo);
        return getOne(userInfo.getId());
    }

    @Override
    public List<UserInfoDTO> getList() {
        List<UserInfo> userInfoList = userInfoMapper.selectAll();

        List<UserInfoDTO> userInfoDTOList = userInfoList.stream()
                .map(e-> new UserInfoDTO(e.getId(),e.getName(),e.getAge()))
                .collect(Collectors.toList());
        return userInfoDTOList;
    }


    @Override
    public PageDTO<UserInfoDTO> getListByPage(Integer pageNum, Integer pageSize) {


        // 分页
        PageHelper.startPage(pageNum, pageSize);
        List<UserInfo> userInfoList = userInfoMapper.selectAll();

        List<UserInfoDTO> userInfoDTOList = userInfoList.stream()
                .map(e-> new UserInfoDTO(e.getId(),e.getName(),e.getAge()))
                .collect(Collectors.toList());
        PageInfo pageInfo = new PageInfo(userInfoDTOList,5);

        PageDTO<UserInfoDTO> userInfoDTOPageDTO = new PageDTO<>();

        userInfoDTOPageDTO.setPageNum(pageInfo.getPageNum());
        userInfoDTOPageDTO.setPageSize(pageInfo.getPageSize());
        userInfoDTOPageDTO.setTotal(pageInfo.getTotal());
        userInfoDTOPageDTO.setList(pageInfo.getList());
        return userInfoDTOPageDTO;
    }

    @Override
    public UserInfoDTO updateOne(UserInfoDTO userInfoDTO) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(userInfoDTO.getId());
        userInfo.setAge(userInfoDTO.getAge());
        userInfo.setName(userInfoDTO.getName());
        userInfoMapper.updateByPrimaryKey(userInfo);
        return getOne(userInfo.getId());
    }

    @Override
    public Boolean delete(Long id) {
        int deleteId = userInfoMapper.deleteByPrimaryKey(id);
        return deleteId > 0 ? true : false;
    }
}
