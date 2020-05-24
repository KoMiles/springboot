package com.komiles.study.oop.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author komiles@163.com
 * @date 2020-05-24 23:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SingletonLazy {

    @Test
    public void test()
    {
        President zt1 = President.getInstance();
        zt1.getName();

        President zt2 = President.getInstance();
        zt2.getName();
        if (zt1 == zt2) {
            System.out.println("他们是一个人！");
        } else{
            System.out.println("他们不是同一个人！");
        }
    }
}


class President{
    private static volatile President instance = null;

    private President(){
        System.out.println("产生一个总统！");
    }

    public static synchronized President getInstance(){
        if(instance==null){
            instance = new President();
        }else{
            System.out.println("已经产生过一个总统了，不能再产生新的总统！");
        }
        return instance;
    }

    public void getName(){
        System.out.println("我是美国总统：特朗普。");
    }
}