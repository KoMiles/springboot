package com.komiles.study.oop.factoryMethod;

/**
 * @author komiles@163.com
 * @date 2020-05-24 23:26
 */
public class HorseAnimalFarm implements AnimalFarm {

//    public HorseAnimalFarm() {
//        System.out.println("我是马场");
//    }

    @Override
    public Animal newAnimal() {
        System.out.println("新马出生了！");
        return new HorseAnimal();
    }
}
