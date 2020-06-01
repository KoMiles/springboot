package com.komiles.study.pattern.abstractFactory;

/**
 * 在工厂方法的基础上增加了产品族的概念
 * @author komiles@163.com
 * @date 2020-05-25 14:36
 */
public interface AbstractFactory {
    public Image getImage();
    public Video getVideo();
}
