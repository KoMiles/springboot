package com.komiles.study.pattern.factoryMethod;

/**
 * 抽象工厂，畜牧场
 * @author komiles@163.com
 * @date 2020-05-24 23:25
 */
public interface AnimalFarm {
    /*
        创建动物
     */
    public Animal newAnimal();
}
