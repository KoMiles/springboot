package com.komiles.study.pattern.facade;

/**
 * 矩形
 * @author komiles@163.com
 * @date 2020-05-25 18:06
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("画了一个矩形");
    }
}
