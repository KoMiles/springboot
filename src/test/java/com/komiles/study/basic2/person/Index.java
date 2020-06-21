package com.komiles.study.basic2.person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author komiles@163.com
 * @date 2020-06-21 18:44
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Index {

    @Test
    public void test(){
        PersonAbstract personAbstract = new American();
        personAbstract.say();

        PersonAbstract personAbstract1 = new Chinese();
        personAbstract1.say();
    }
}
