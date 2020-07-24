package com.komiles.study.controller;

import com.komiles.study.domain.TestConfig;
import com.komiles.study.test.InnerClass.Hello;
import com.komiles.study.test.InnerClass.Hello.Inner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringJoiner;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
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

    @GetMapping("/string2")
    public String string2(){
        // 判断邮箱格式是否正确：合法的邮箱名中至少要包含"@", 并且"@"是在"."之前
         /*
        参考步骤：
        1、获取文件名中"@"符号的位置
        2、获取邮箱中"."号的位置
        3、判断必须包含"@"符号，且"@"必须在"."之前
        */
        // 获取邮箱中"@"符号的位置
        // 邮箱
        String email = "laurenyang@imooc.com";
        int index2 = email.indexOf("@");

        // 获取邮箱中"."号的位置
        int index3 = email.indexOf('.');

        // 判断必须包含"@"符号，且"@"必须在"."之前
        if (index2 != -1 && index3 > index2) {
            System.out.println("邮箱格式正确");
        } else {
            System.out.println("邮箱格式无效");
        }
        return "123";
    }


    public void string3(){
        // 定义一个字符串
        String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";

        // 出现次数
        int num = 0;

        // 循环遍历每个字符，判断是否是字符 a ，如果是，累加次数
        for (  int i=0;i<s.length();i++ )
        {
            // 获取每个字符，判断是否是字符a
            if (    s.charAt(i) == 'a'             ) {
                // 累加统计次数
                num++;
            }
        }
        System.out.println("字符a出现的次数：" + num);
    }

    public void string4(){
        // 创建一个空的StringBuilder对象
        StringBuilder str = new StringBuilder();

        // 追加字符串
        str.append("jaewkjldfxmopzdm");

        int length = str.length();
        // 从后往前每隔三位插入逗号
        for(int i=length-3;i>0;i=i-3){
            str.insert(i,',');
        }



        // 将StringBuilder对象转换为String对象并输出
        System.out.print(str.toString());
    }

    @GetMapping("/array")
    public String arrayList(){

        ArrayList<String> idList = new ArrayList<String>();
        idList.add("2002");
        idList.add("2003");


//        ArrayList<Integer> idList = new ArrayList<Integer>();
//        idList.add(2003);
//        idList.add(2003);


//        StringJoiner joiner = new StringJoiner(",");
//        for (Integer cs: idList) {
//            joiner.add(cs.toString());
//        }

//        List<Integer> resList = Arrays.asList(idList);

//        List<String> idList = Arrays.asList("1","2","3","4","5");
//        List<Integer> resList = Arrays.asList(idList);
//        String res = String.join(",",idList);
//        String res =    idList.stream().collect(Collectors.joining(","));
//        String res = String.join(",",idList);
        String res = StringUtils.join(idList,",");
        log.info("idList is {}",res);

        return "123";


    }
}
