package com.komiles.study.pattern.builder;

/**
 * 蔬菜汉堡
 * @author komiles@163.com
 * @date 2020-05-25 15:24
 */
public class VegBurger extends Burger {

    @Override
    public Float price() {
        return 20.5F;
    }

    @Override
    public String name() {
        return "蔬菜汉堡";
    }
}
