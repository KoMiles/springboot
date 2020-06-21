package com.komiles.study.basic2.phone;

/**
 * @author komiles@163.com
 * @date 2020-06-21 17:31
 */
public class CellPhone extends TelPhone {

    @Override
    public void call() {
        System.out.println("通过键盘打电话");
    }

    @Override
    public void message() {
        System.out.println("通过键盘发短信");
    }
}
