package com.komiles.study.module.collect;

/**
 * @author komiles@163.com
 * @date 2020-07-11 13:16
 */
public class Student {

    private String id;

    private String name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
