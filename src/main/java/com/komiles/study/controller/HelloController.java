package com.komiles.study.controller;

import com.komiles.study.domain.TestConfig;
import com.komiles.study.test.InnerClass.Hello;
import com.komiles.study.test.InnerClass.Hello.Inner;
import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @GetMapping("/string")
    public String string(){
        // Java文件名
        String fileName = "HelloWorld.java";
        // 邮箱
        String email = "laurenyang@imooc.com";

        // 判断.java文件名是否正确：合法的文件名应该以.java结尾
        /*
        参考步骤：
        1、获取文件名中最后一次出现"."号的位置
        2、根据"."号的位置，获取文件的后缀
        3、判断"."号位置及文件后缀名
        */
        //获取文件名中最后一次出现"."号的位置
        int index = fileName.lastIndexOf(".");

        // 获取文件的后缀
        String prefix = fileName.substring(index);

        // 判断必须包含"."号，且不能出现在首位，同时后缀名为"java"
        if ( index!=-1 && index!=0 &&  prefix.equals("java") ) {
            System.out.println("Java文件名正确");
        } else {
            System.out.println("Java文件名无效");
        }
        return "123";
    }
}
