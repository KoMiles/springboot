package com.komiles.study.basic3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author komiles@163.com
 * @date 2020-07-12 18:53
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SortTest {

    /**
     * 随机出现10个100以内的数字，并进行排序
     */
    @Test
    public void index(){

        List<Integer> numList = new ArrayList<Integer>();
        Random random = new Random();
        Integer k;
        for(int i=0;i<10;i++){

            do{
                k = random.nextInt(100);

            }while (numList.contains(k));
            numList.add(k);
            System.out.println("添加的数字为："+k);
        }

        System.out.println("---------排序前---------");
        for (Integer num:numList
        ) {
            System.out.println(num);
        }
        Collections.sort(numList);
        System.out.println("---------排序后---------");
        for (Integer num:numList
        ) {
            System.out.println(num);
        }
    }


    /**
     * 生成一个字符串
     */
    @Test
    public void index2(){

        List<java.lang.String> strList = new ArrayList<java.lang.String>();
        java.lang.String allStr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ012345678";
        Integer k;
        Random random = new Random();
        // 随机生成一个字符串
        for(int i=0;i<10;i++){
            StringBuffer sb = new StringBuffer();


            do{
                k = random.nextInt(10);
                for(int j=0;j<k+1;j++) {
                    sb.append(allStr.charAt(random.nextInt(allStr.length())));
                }
            }while (strList.contains(sb));
                strList.add(sb.toString());
                System.out.println("生成字符串为："+sb);
        }


        System.out.println("---------排序前---------");
        for (java.lang.String str:strList
        ) {
            System.out.println(str);
        }
        Collections.sort(strList);
        System.out.println("---------排序前---------");
        for (java.lang.String str:strList
        ) {
            System.out.println(str);
        }

    }
}
