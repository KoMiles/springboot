package com.komiles.study.pattern.builder;

/**
 * 鸡肉汉堡
 * @author komiles@163.com
 * @date 2020-05-25 15:25
 */
public class ChickenBurger extends Burger{

    @Override
    public Float price() {
        return 50.5F;
    }

    @Override
    public String name() {
        return "鸡肉汉堡";
    }
}
