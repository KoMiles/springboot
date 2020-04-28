package com.komiles.study.controller;

import com.komiles.study.entity.common.PageDTO;
import com.komiles.study.entity.dto.UserInfoDTO;
import com.komiles.study.service.UserInfoService;
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
}
