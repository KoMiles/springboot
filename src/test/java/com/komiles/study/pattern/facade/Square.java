package com.komiles.study.pattern.facade;

/**
 * @author komiles@163.com
 * @date 2020-05-25 18:07
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("画了一个正方形");
    }
}
