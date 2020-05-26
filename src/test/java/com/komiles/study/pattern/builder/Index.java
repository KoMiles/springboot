package com.komiles.study.pattern.builder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 建造者模式
 * @author komiles@163.com
 * @date 2020-05-25 15:29
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Index {

    @Test
    public void test()
    {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("蔬菜套餐:\n");
        vegMeal.showItems();
        System.out.println("Total cost:"+vegMeal.getCost());


        System.out.println("---------");
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("鸡肉套餐:\n");
        nonVegMeal.showItems();
        System.out.print("Total cost:"+nonVegMeal.getCost());
    }

}
