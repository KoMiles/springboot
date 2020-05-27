package com.komiles.study.pattern.observer;

/**
 * @author komiles@163.com
 * @date 2020-05-26 13:55
 */
public class TwoObserver extends Observer {

    @Override
    public void update(String msg) {
        System.out.println(TwoObserver.class.getName()+":"+msg);
    }
}
