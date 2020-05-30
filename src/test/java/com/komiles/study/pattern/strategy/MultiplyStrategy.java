package com.komiles.study.pattern.strategy;

/**
 * @author komiles@163.com
 * @date 2020-05-30 23:10
 */
public class MultiplyStrategy implements Strategy {

    @Override
    public Integer operate(Integer num1, Integer num2) {
        return num1 * num2;
    }
}
