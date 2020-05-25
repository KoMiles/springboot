package com.komiles.study.oop.facade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 使用该外观类画出各种类型的形状
 * 外观模式：
 优点： 1、减少系统相互依赖。 2、提高灵活性。 3、提高了安全性。

 缺点：不符合开闭原则，如果要改东西很麻烦，继承重写都不合适。
 * @author komiles@163.com
 * @date 2020-05-25 18:12
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Index {

    @Test
    public void test(){
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
