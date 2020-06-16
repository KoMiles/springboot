package com.komiles.study.controller;

import com.komiles.study.domain.MafengwoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author komiles@163.com
 * @date 2020-06-16 11:53
 */
@RestController
@RequestMapping("/mafengwo")
public class MafengwoController {

    @Autowired
    MafengwoConfig mafengwoConfig;

    @Value("${mafengwo.appId}")
    private String appId;

    @GetMapping("/appId")
    public String getAppId(){
        return appId;
    }

    @GetMapping("/appSecret")
    public String getAppSecret(){
        return mafengwoConfig.getAppSecret();
    }
}
