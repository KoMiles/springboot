package com.komiles.study.basic3;

import com.komiles.study.module.collect.Course;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author komiles@163.com
 * @date 2020-07-11 13:12
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CollectTest {

    @Test
    public void index(){
        List coursesToSelect = new ArrayList();

        Course course1 = new Course("1","     数学");
        coursesToSelect.add(course1);

        Course res1 = (Course) coursesToSelect.get(0);
        System.out.println("课程信息："+res1.getId()+res1.getName());
//
        Course course2 = new Course("2","    语文");
        coursesToSelect.add(0,course2);

        Course res2 = (Course) coursesToSelect.get(0);
        System.out.println("课程信息："+res2.getId()+res2.getName());

        Course course3 = new Course("3","    英语");
        coursesToSelect.add(4,course3);
    }
}
