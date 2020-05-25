package com.komiles.study.oop.builder;

/**
 * @author komiles@163.com
 * @date 2020-05-25 15:22
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract Float price() ;
}
