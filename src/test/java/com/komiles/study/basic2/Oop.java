package com.komiles.study.basic2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author komiles@163.com
 * @date 2020-06-12 20:58
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Oop {

    @Test
    public void index()
    {
        Person person = new Person();
        person.setName("张三");
        person.setWeight(89F);
        person.setSex(1);
        System.out.println("姓名:"+person.getName()+"性别:"+person.getSex()+"体重:"+person.getWeight());
    }
}

class Person{

    String name;

    Integer sex;

    Float weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
}
