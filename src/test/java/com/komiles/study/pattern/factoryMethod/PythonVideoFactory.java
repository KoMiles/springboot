package com.komiles.study.pattern.factoryMethod;

/**
 * @author komiles@163.com
 * @date 2020-05-24 23:43
 */
public class PythonVideoFactory implements VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
