package com.komiles.study.basic;

import java.util.Arrays;
import java.util.Collections;
import javax.persistence.criteria.CriteriaBuilder.In;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.yaml.snakeyaml.util.ArrayUtils;

/**
 * @author komiles@163.com
 * @date 2020-06-10 15:20
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Oop {

    @Test
    public void index(){
        Oop oop = new Oop();
        System.out.println("最大值为："+oop.getMaxAge());
    }

    public int getMaxAge()
    {
        int ages[] = {18 ,23 ,21 ,19 ,25 ,29 ,17};

        Arrays.sort(ages);


//        for (int age:ages){
//            System.out.println(age);
//        }
        return ages[ages.length-1];
    }

    @Test
    public void index1(){
        int ages[] = {18 ,23 ,21 ,19 ,25 ,29 ,17};

        Arrays.sort(ages);
        int maxNum = ages[ages.length-1];

        System.out.println("最大值为："+ maxNum);
    }


    @Test
    public void index2(){
        int ages[] = {18 ,23 ,21 ,19 ,25 ,29 ,17};


        int maxNum = Arrays.stream(ages).max().getAsInt();

        System.out.println("最大值为："+ maxNum);
    }



    @Test
    public void index3(){
        int ages[] = {18 ,23 ,21 ,19 ,25 ,29 ,17};
        Integer newAges[] = new Integer[ages.length];

        for(int i=0;i<ages.length;i++) {
            newAges[i] = (Integer)ages[i];
        }
        int maxNum = Collections.max(Arrays.asList(newAges));
        System.out.println("最大值为："+ maxNum);
    }

    @Test
    public void index4(){
        Integer ages[] = {18 ,23 ,21 ,19 ,25 ,29 ,17};
        int maxNum = Collections.max(Arrays.asList(ages));
        System.out.println("最大值为："+ maxNum);
    }
}
