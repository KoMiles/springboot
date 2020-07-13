package com.komiles.study.basic3;

import com.komiles.study.module.collect.Course;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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

        // 这个会报数组越界
//        Course course3 = new Course("3","    英语");
//        coursesToSelect.add(4,course3);

        Course[] courses3 = {new Course("3","英语"), new Course("4","高等数学")};
        coursesToSelect.addAll(Arrays.asList(courses3));

        Course res3 = (Course) coursesToSelect.get(2);
        System.out.println("新添加课程信息："+res3.getId()+res3.getName());

        Course res4 = (Course) coursesToSelect.get(3);
        System.out.println("新添加课程信息："+res4.getId()+res4.getName());


        Course[] courses4 = {new Course("5","物理"), new Course("6","化学")};

        coursesToSelect.addAll(4,Arrays.asList(courses4));

        Course res5 = (Course) coursesToSelect.get(4);
        System.out.println("新添加index课程信息："+res5.getId()+res5.getName());

        Course res6 = (Course) coursesToSelect.get(5);
        System.out.println("新添加index课程信息："+res6.getId()+res6.getName());

//        print1(coursesToSelect);
//        print2(coursesToSelect);
        print3(coursesToSelect);
//        update(coursesToSelect);
//
//        delete(coursesToSelect);
//        delete2(coursesToSelect);
//        delete3(coursesToSelect);

        Course data = new Course("3","英语");
        Boolean rs = coursesToSelect.contains(data);
        System.out.println("包含对象："+rs+"name:"+data.getName()+"索引位置："+coursesToSelect.indexOf(data));

    }

    private void print1(List coursesToSelect){
        int size = coursesToSelect.size();
        System.out.println("=====全部课程表====");
        for(int i=0;i<size;i++) {
            Course rs = (Course) coursesToSelect.get(i);
            System.out.println("课程Id："+rs.getId()+"课程名称："+rs.getName());
        }
    }

    private void print2(List coursesToSelect){
        System.out.println("=====通过迭代器iterator打印课程表====");
        Iterator it = coursesToSelect.iterator();
        while (it.hasNext()){
            Course rs = (Course) it.next();
            System.out.println("课程Id："+rs.getId()+"课程名称："+rs.getName());
        }
    }

    private void print3(List coursesToSelect){
        System.out.println("=====通过foreach打印课程表====");
        for (Object obj:coursesToSelect
        ) {
            Course rs = (Course) obj;
            System.out.println("课程Id："+rs.getId()+"课程名称："+rs.getName());
        }
    }

    /**
     * 修改方法
     * @param coursesToSelect
     */
    private void update(List coursesToSelect){
        Course course1 = new Course("88","大学英语");
        coursesToSelect.set(2,course1);
    }

    /**
     * 删除方法
     * @param coursesToSelect
     */
    private void delete(List coursesToSelect){
        Course rs = (Course) coursesToSelect.get(2);
        System.out.println("即将删除数据");
        System.out.println("课程Id："+rs.getId()+"课程名称："+rs.getName());
        coursesToSelect.remove(rs);
        print1(coursesToSelect);
    }

    private void delete2(List coursesToSelect){
        coursesToSelect.remove(3);
        print1(coursesToSelect);
    }

    private void delete3(List coursesToSelect){
        Course[] del = {(Course)coursesToSelect.get(3),(Course)coursesToSelect.get(4)};
        coursesToSelect.removeAll(Arrays.asList(del));
        print1(coursesToSelect);
    }


    @Test
    public void index2()
    {
        List<Integer> idList = new ArrayList<Integer>();
        idList.add(1);
        System.out.println("泛型必须使用包装类型："+idList.get(0));
    }
}
