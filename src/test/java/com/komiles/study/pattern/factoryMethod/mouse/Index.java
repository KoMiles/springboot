package com.komiles.study.pattern.factoryMethod.mouse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author komiles@163.com
 * @date 2020-06-01 10:20
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Index {

    @Test
    public void test(){
        // hp mouse
        MouseFactory mouseFactory = new HpMouseFactory();
        mouseFactory.mouseCreate().sayHi();

        MouseFactory deilFactory = new DeilMouseFactory();
        deilFactory.mouseCreate().sayHi();
    }
}
