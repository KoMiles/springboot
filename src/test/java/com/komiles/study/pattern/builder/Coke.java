package com.komiles.study.pattern.builder;

/**
 * @author komiles@163.com
 * @date 2020-05-25 15:27
 */
public class Coke extends ColdDrink {

    @Override
    public Float price() {
        return 30.0F;
    }

    @Override
    public String name() {
        return "可乐";
    }
}
