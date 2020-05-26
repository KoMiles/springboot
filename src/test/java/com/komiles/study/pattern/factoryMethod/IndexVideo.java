package com.komiles.study.pattern.factoryMethod;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 工厂方法有4个对象：
 * 抽象工厂类（Factory）：提供抽象方法供具体工厂实现
 * 具体工厂类（ConcreteFactory）：提供具体的工厂
 * 抽象产品类（Product）：提供抽象方法供具体产品类实现
 * 具体产品类（ConcreteProduct）：提供具体的产品
 * @author komiles@163.com
 * @date 2020-05-24 23:44
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class IndexVideo {

    @Test
    public void testJava()
    {
        JavaVideoFactory javaVideoFactory = new JavaVideoFactory();
        javaVideoFactory.getVideo().product();
    }

    @Test
    public void testPython()
    {
        PythonVideoFactory pythonVideoFactory = new PythonVideoFactory();
        pythonVideoFactory.getVideo().product();
    }

    @Test
    public void testPHP()
    {
        PHPVideoFactory phpVideoFactory = new PHPVideoFactory();
        phpVideoFactory.getVideo().product();
    }
}
