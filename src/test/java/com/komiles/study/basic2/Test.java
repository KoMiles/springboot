package com.komiles.study.basic2;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author komiles@163.com
 * @date 2020-06-14 17:50
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Test {

    @org.junit.Test
    public void index(){
        Person2 person2 = new Person2();
        person2.show();

        Person2 person3 = new Person2();

    }

}


class Person2{
    String name;
    String sex;
    static int age;

    public Person2(){
        System.out.println("构造方法初始化name");
        name = "张三";
    }

    {
        System.out.println("初始化模块");
        sex = "男";
    }

    static {
        System.out.println("静态初始化模块");
        age = 20;
    }

    public void show(){
        System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age);
    }
}