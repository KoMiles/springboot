package com.komiles.study.controller;

import com.komiles.study.domain.TestConfig;
import com.komiles.study.test.Hello;
import com.komiles.study.test.Hello.Inner;
import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

    @Value("${weixin.appId}")
    private String appId;

    @Value("${weixin.appSecret}")
    private String appSecret;

    @Autowired
    private TestConfig testConfig;


    @GetMapping("/test")
    public String test()
    {
        return "appId:"+testConfig.getAppId()+",appSecret:" + testConfig.getAppSecret();
    }
    @GetMapping("/config")
    public void config()
    {
        log.info("【配置中心】- 测试");
    }

    @GetMapping("/time")
    public void time()
    {
        Date date = new Date();
        Long res = System.currentTimeMillis()/1000;
        log.info("时间为：{}", res);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        log.info("date:{}",simpleDateFormat.format(date));
    }


    @GetMapping("/inner")
    public void inner(){
        Hello hello = new Hello();
        Inner inner = hello.new Inner();
        inner.show();
    }



}
