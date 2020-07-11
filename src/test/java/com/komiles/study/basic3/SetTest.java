package com.komiles.study.basic3;

import com.komiles.study.module.collect.Course;
import com.komiles.study.module.collect.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author komiles@163.com
 * @date 2020-07-11 17:59
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SetTest {

    @Test
    public void index()
    {
        List<Course> coursesToSelect = new ArrayList();

        Course course1 = new Course("1","     数学");
        coursesToSelect.add(course1);

        Course course2 = new Course("2","    语文");
        coursesToSelect.add(0,course2);

        Course[] courses3 = {new Course("3","英语"), new Course("4","高等数学")};
        coursesToSelect.addAll(Arrays.asList(courses3));

        Course[] courses4 = {new Course("5","物理"), new Course("6","化学")};

        coursesToSelect.addAll(4,Arrays.asList(courses4));

        print(coursesToSelect);

        Student student = new Student("1","张三");

        List<java.lang.String> idList = new ArrayList<java.lang.String>(Arrays.asList("3","4"));

        Set<Course> courseSet = new HashSet<Course>();

        for (java.lang.String i:idList
        ) {
            for (Course cr: coursesToSelect
            ) {
                if(cr.getId().equals(i)) {
//                    student.courses.add(cr);
//                    student.courses.add(cr);
                    courseSet.add(cr);
                    student.setCourses(courseSet);
//                    System.out.println("课程Id："+cr.getId()+"课程名称："+cr.getName());
                }
            }
        }

        System.out.println("=====选择的课程====");
        for (Course rs: student.courses
        ) {
            System.out.println("课程Id："+rs.getId()+"课程名称："+rs.getName());
        }


    }

    private void print(List<Course> coursesToSelect){
        System.out.println("=====全部课程表====");
        for (Course rs:coursesToSelect
        ) {
            System.out.println("课程Id："+rs.getId()+"课程名称："+rs.getName());
        }
    }
}
