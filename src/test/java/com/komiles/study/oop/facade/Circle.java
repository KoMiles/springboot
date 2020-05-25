package com.komiles.study.oop.facade;

/**
 * @author komiles@163.com
 * @date 2020-05-25 18:08
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("画了一个圆形");
    }
}
