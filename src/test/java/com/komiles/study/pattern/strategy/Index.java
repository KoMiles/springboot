package com.komiles.study.pattern.strategy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 策略模式：定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
 * 关键代码：实现同一个接口。
 * 优点：
 * 1、算法可以自由切换。
 * 2、避免使用多重条件判断。 3、扩展性良好。
 *
 * 缺点：
 * 1、策略类会增多。
 * 2、所有策略类都需要对外暴露。
 * @author komiles@163.com
 * @date 2020-05-30 23:06
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Index {

    @Test
    public void test(){
        Context context = new Context();
        // 相加
        context.setStrategy(new AddStrategy());
        System.out.println("相加+的结果为："+context.executeStrategy(2,3));

        // 相乘
        context.setStrategy(new MultiplyStrategy());
        System.out.println("相乘X的结果为："+context.executeStrategy(2,3));

        // 相减
        context.setStrategy(new SubStrategy());
        System.out.println("相减-的结果为："+context.executeStrategy(2,3));

    }
}
