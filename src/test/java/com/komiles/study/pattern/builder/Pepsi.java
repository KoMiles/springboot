package com.komiles.study.pattern.builder;

/**
 * @author komiles@163.com
 * @date 2020-05-25 15:28
 */
public class Pepsi extends ColdDrink {

    @Override
    public Float price() {
        return 35.5F;
    }

    @Override
    public String name() {
        return "雪碧";
    }
}
