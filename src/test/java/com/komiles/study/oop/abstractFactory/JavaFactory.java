package com.komiles.study.oop.abstractFactory;

/**
 * @author komiles@163.com
 * @date 2020-05-25 14:42
 */
public class JavaFactory implements AbstractFactory {

    @Override
    public Image getImage() {
        return new JavaImage();
    }

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
