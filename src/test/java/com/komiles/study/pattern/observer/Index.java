package com.komiles.study.pattern.observer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author komiles@163.com
 * @date 2020-05-26 14:01
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Index {

    @Test
    public void test(){
        Observer observer1 = new OneObserver();
        Observer observer2 = new TwoObserver();
        Observer observer3 = new ThreeObserver();

        Subject subject = new Subject();
        subject.addAttach(observer1);
        subject.addAttach(observer2);
        subject.addAttach(observer3);

        subject.setMsg("msg change");
    }
}
