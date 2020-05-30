package com.komiles.study.pattern.strategy;

/**
 * 两个数相加
 * @author komiles@163.com
 * @date 2020-05-30 23:08
 */
public class AddStrategy implements Strategy {

    @Override
    public Integer operate(Integer num1, Integer num2) {

        return num1 + num2;
    }
}
