package com.komiles.study.oop.factoryMethod;

/**
 * @author komiles@163.com
 * @date 2020-05-24 23:26
 */
public class CattleAnimalFarm implements AnimalFarm {

    public CattleAnimalFarm() {
        System.out.println("我是牛场");
    }

    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生了！");
        return new CattleAnimal();
    }
}
