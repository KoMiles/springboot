package com.komiles.study.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.komiles.study.entity.dto.UserInfoDTO;
import com.komiles.study.entity.param.UserInfoParam;
import com.komiles.study.service.UserInfoService;
import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author komiles@163.com
 * @date 2020-03-22 12:04
 */
@RestController
@RequestMapping("/userInfo")
@Slf4j
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/get")
    public UserInfoDTO getUser(@RequestParam("user_id") Long id) {

        return userInfoService.getOne(id);
    }

    @GetMapping("/getList")
    public List<UserInfoDTO> getList()
    {
        return userInfoService.getList();
    }

    @GetMapping("getListByPage")
    public List<UserInfoDTO> getListByPage(@RequestParam(value = "pageSize") int pageSize,
            @RequestParam(value = "pageNum") int pageNum)
    {
        PageHelper.startPage(pageNum, pageSize);
        List<UserInfoDTO> userInfoDTOList = userInfoService.getList();
        PageInfo pageInfo = new PageInfo(userInfoDTOList,5);
        return pageInfo.getList();
    }


    @PostMapping("/post")
    public UserInfoDTO postUser(@Valid UserInfoParam userInfo, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors()) {
            log.info("参数:{}错误，原因:{}", bindingResult.getFieldError().getField(),bindingResult.getFieldError().getDefaultMessage());
        }
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setAge(userInfo.getAge());
        userInfoDTO.setName(userInfo.getName());
        log.info("userDTO:{}",userInfoDTO);
        return userInfoService.insertOne(userInfoDTO);
    }

    @PostMapping("/update")
    public UserInfoDTO updateUser(UserInfoParam userInfoParam)
    {
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setAge(userInfoParam.getAge());
        userInfoDTO.setId(userInfoParam.getId());
        userInfoDTO.setName(userInfoParam.getName());
        return userInfoService.updateOne(userInfoDTO);
    }

    @PostMapping("/delete")
    public boolean deleteUser(@RequestParam("id")  Long id){
        return userInfoService.delete(id);
    }
}
