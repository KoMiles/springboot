package com.komiles.study.pattern.strategy;


/**
 * @author komiles@163.com
 * @date 2020-05-30 23:10
 */
public class Context {
    private Strategy strategy;

    public Context() {
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Integer executeStrategy(Integer num1, Integer num2){
        return strategy.operate(num1,num2);
    }
}
