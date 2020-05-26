package com.komiles.study.pattern.factoryMethod;

/**
 * @author komiles@163.com
 * @date 2020-05-24 23:41
 */
public class JavaVideo implements Video {

    @Override
    public void product() {
        hello();
        System.out.println("Java视频教程");
    }


    private void hello(){
        System.out.println("this is java hello method");
    }
}
