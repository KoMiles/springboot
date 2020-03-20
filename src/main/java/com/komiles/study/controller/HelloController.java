package com.komiles.study.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

    @GetMapping("/test")
    public String test(@RequestParam(value = "name", defaultValue = "1234")  String name)
    {
        return name+"nihao_hhh_kongming_000";
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

}
