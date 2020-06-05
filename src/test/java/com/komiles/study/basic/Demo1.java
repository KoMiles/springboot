package com.komiles.study.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author komiles@163.com
 * @date 2020-06-05 15:33
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Demo1 {

    @Test
    public void index(){
        int num = 97;
        double a = num;
        System.out.println("int type :"+num);
        System.out.println("double type :"+a);
    }

    @Test
    public void index1(){
        double avg1 = 85.2;
        int rise = 5;
        double result = avg1+rise;
        System.out.println("考试平均分："+avg1);
        System.out.println("调整后的平均分："+result);
    }
}
