package com.komiles.study.oop.abstractFactory;

/**
 * @author komiles@163.com
 * @date 2020-05-25 14:43
 */
public class PythonFactory implements AbstractFactory {

    @Override
    public Image getImage() {
        return new PythonImage();
    }

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
