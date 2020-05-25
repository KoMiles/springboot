package com.komiles.study.oop.abstractFactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author komiles@163.com
 * @date 2020-05-25 14:44
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Index {

    @Test
    public void javaTest(){
        JavaFactory javaFactory = new JavaFactory();
        javaFactory.getImage().showImage();
        javaFactory.getVideo().showVideo();
    }


}
