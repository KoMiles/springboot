package com.komiles.study.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * @author komiles@163.com
 * @date 2020-05-26 13:57
 */
public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    public void setMsg(String msg){
        notifyAll(msg);
    }

    // 订阅
    public void addAttach(Observer observer){
        observerList.add(observer);
    }

    // 通知所有订阅的观察者
    private void notifyAll(String msg){
        for (Observer observer:observerList){
            observer.update(msg);
        }
    }
}
