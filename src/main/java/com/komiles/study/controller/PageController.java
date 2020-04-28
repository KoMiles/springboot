package com.komiles.study.controller;

import com.fasterxml.jackson.databind.util.ObjectBuffer;
import com.komiles.study.entity.common.PageDTO;
import com.komiles.study.entity.dto.StudentTestDTO;
import com.komiles.study.entity.dto.TestDTO;
import com.komiles.study.entity.dto.UserDto;
import com.komiles.study.entity.dto.UserInfoDTO;
import com.komiles.study.service.UserInfoService;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author komiles@163.com
 * @date 2020-04-28 14:56
 */
@RequestMapping("/page")
@RestController
public class PageController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/list")
    public PageDTO<UserInfoDTO> getList(
            @RequestParam(value = "page",defaultValue = "1") Integer page,
            @RequestParam(value = "limit",defaultValue = "10") Integer limit)
    {
        return userInfoService.getListByPage(page,limit);
    }

    @GetMapping("/search")
    public PageDTO<UserInfoDTO> searchList(
            @RequestParam(value = "page",defaultValue = "1") Integer page,
            @RequestParam(value = "limit",defaultValue = "10") Integer limit,
            @RequestParam(value = "f",defaultValue = "id") String orderField,
            @RequestParam(value = "o",defaultValue = "DESC") String orderBy,
            @RequestParam(value = "name",defaultValue = "") String name)
    {
        return userInfoService.getListBySearch(page,limit, orderField,orderBy, name);
    }


    @GetMapping("/test")
    public Object test()
    {
        StringBuffer buffer = new StringBuffer();
//        TestDTO testDTO = new TestDTO();
//        testDTO.setAge(12).setUserId(11).setUsername("zhangsan");
//        TestDTO testDTO = TestDTO.of("zhangsan").setAge(22).setUserId(121);
        StudentTestDTO testDTO = StudentTestDTO.builder().age(1).name("lisi").id(123).build();

        buffer.append("aaa").append("bbbb").append(111).append(new BigDecimal("0.22")).append(testDTO);
        String result = buffer.toString();
        return result;

//        ObjectBuffer objectBuffer = new ObjectBuffer();
//        objectBuffer.app
    }
}
