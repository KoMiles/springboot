package com.komiles.study.pattern.factoryMethod;

/**
 * @author komiles@163.com
 * @date 2020-05-24 23:23
 */
public class CattleAnimal implements Animal {

//    public CattleAnimal() {
//        System.out.println("我是牛的构造方法");
//    }

    @Override
    public void show() {
        System.out.println("我是牛-我显示了show！");
    }
}
