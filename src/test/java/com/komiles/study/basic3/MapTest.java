package com.komiles.study.basic3;

import com.komiles.study.module.collect.Student;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author komiles@163.com
 * @date 2020-07-12 10:52
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MapTest {

    @Test
    public void index(){
        Map<java.lang.String, Student> studentHashMap = new HashMap<>();

        Student student1 = new Student("1","张三");
        studentHashMap.put(student1.getId(),student1);

        Student student2 = new Student("2","李四");
        studentHashMap.put(student2.getId(),student2);

        Student student3 = new Student("3","小明");
        studentHashMap.put(student3.getId(),student3);


        // 删除map中的值
//        studentHashMap.remove("2");

        // 修改map中的值
        Student studentUpdate = new Student("88","马云");
        studentHashMap.put("2",studentUpdate);

//        // 取出所有的key
//        for (java.lang.String key: studentHashMap.keySet()
//        ) {
//
//            System.out.println("key:"+key);
//        }
//
//        // 取出所有的value
//        for (Student st:studentHashMap.values()
//        ) {
//            System.out.println("id:"+st.getId()+" name:"+st.getName());
//        }
        // 取出所有的value
        for (java.lang.String key: studentHashMap.keySet()
        ) {
            Student st = studentHashMap.get(key);
            System.out.println("id:"+st.getId()+" name:"+st.getName());
        }
    }


    /**
     * 通过某一个key或者value，查询HashMap中的值
     */
    @Test
    public void index2(){
        Map<java.lang.String, Student> studentHashMap = new HashMap<>();

        Student student1 = new Student("1","张三");
        studentHashMap.put(student1.getId(),student1);

        Student student2 = new Student("2","李四");
        studentHashMap.put(student2.getId(),student2);

        Student student3 = new Student("3","小明");
        studentHashMap.put(student3.getId(),student3);

        // 通过key查询
//        Boolean keyIsExist = studentHashMap.containsKey("2");
//        if(keyIsExist) {
//            Student st = studentHashMap.get("2");
//            System.out.println("对应的学生：id:"+st.getId()+" name:"+st.getName());
//        }

        // 通过value查询
        Boolean keyIsExist = studentHashMap.containsValue(new Student(null,"小明"));
        if(keyIsExist) {
//            Student st = studentHashMap.get("2");
            System.out.println("查到对应的学生");
        } else {
            System.out.println("不存在同学");
        }

        // 取出所有的value
        for (java.lang.String key: studentHashMap.keySet()
        ) {
            Student st = studentHashMap.get(key);
            System.out.println("id:"+st.getId()+" name:"+st.getName());
        }
    }
}
