package com.komiles.study.oop.factoryMethod;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author komiles@163.com
 * @date 2020-05-24 23:29
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Index {

    @Test
    public void test(){
        // 马
        HorseAnimalFarm horseAnimalFarm = new HorseAnimalFarm();
        horseAnimalFarm.newAnimal();

        // 牛
        CattleAnimalFarm cattleAnimalFarm = new CattleAnimalFarm();
        cattleAnimalFarm.newAnimal();

    }
}
