package com.komiles.study.oop.builder;

/**
 * 创建一个表示食物条目的接口。
 * @author komiles@163.com
 * @date 2020-05-25 15:13
 */
public interface Item {
    public String name();
    public Packing packing();
    public Float price();
}
