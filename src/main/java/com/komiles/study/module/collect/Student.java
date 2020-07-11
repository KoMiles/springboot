package com.komiles.study.module.collect;

import java.util.HashSet;
import java.util.Set;

/**
 * @author komiles@163.com
 * @date 2020-07-11 13:16
 */
public class Student {

    private String id;

    private String name;

    public Set<Course> courses;


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
//        this.courses = new HashSet<Course>();
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
