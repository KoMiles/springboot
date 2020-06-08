package com.komiles.study.basic;

import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author komiles@163.com
 * @date 2020-06-06 18:36
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Array {

    @Test
    public void init(){
        // 声明数组
        int[] result;
        String result1[];

        // 分配空间
        result = new int[2];
        result1 = new String[3];
    }

    @Test
    public void index(){
        int scores[]= new int[5];
        scores[0]=1;
        scores[2]=99;
        System.out.println(scores[2]);
    }

    @Test
    public void index2(){
//        int scores[] = {1,2,3,89,4};
        // 等价于
        int scores[] = new int[]{1,2,3,89,4};
        System.out.println(scores[3]);
    }

    @Test
    public void index3(){
        // 定义一个长度为 3 的字符串数组，并赋值初始值
        String[] hobbys = { "sports", "game", "movie" };

        System.out.println("循环输出数组中元素的值：");
        // 使用循环遍历数组中的元素

        for(int i=0;i<hobbys.length;i++){
            System.out.println(hobbys[i]);
        }
    }

    /**
     * 升序
     */
    @Test
    public void index4(){
        int scores[] = new int[]{1,2,3,89,4};
        Arrays.sort(scores);
        for (int i:scores
        ) {
            System.out.println(i);
        }
    }

    /**
     * 降序
     * https://blog.csdn.net/Eknaij/article/details/89789589
     * 不能使用基本类型（int,double, char），如果是int型需要改成Integer，float要改成Float,
     */
    @Test
    public void index5(){
        Integer scores[] = {1,2,3,89,4};
        Arrays.sort(scores,Collections.reverseOrder());
        for (Integer i:scores
        ) {
            System.out.println(i);
        }
    }

    @Test
    public void index6(){
        int scores[] = new int[]{1,2,3,89,4};
        Integer newScores[] = new Integer [5];
        for(int i=0;i<scores.length;i++){
            newScores[i]= new Integer(scores[i]);
        }

        Arrays.sort(newScores,Collections.reverseOrder());
        for (Integer i:newScores
        ) {
            System.out.println(i);
        }
    }

    @Test
    public void index7(){
        String[] hobbies = { "sports", "game", "movie" };
        Arrays.sort(hobbies);
        for (String i:hobbies
        ) {
            System.out.println(i);
        }
    }

    @Test
    public void index8(){
//        String[] hobbies = { "sports", "game", "movie" };
//        System.out.println(Arrays.toString(hobbies));

        // 定义一个字符串数组
        String[] hobbies = { "sports", "game", "movie" };

        // 使用Arrays类的sort()方法对数组进行排序
        Arrays.sort(hobbies);

        // 使用Arrays类的toString()方法将数组转换为字符串并输出
        System.out.println(Arrays.toString(hobbies));
    }

    @Test
    public void index9(){
        // 定义两行三列的二维数组并赋值
        String[][] names={{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};

        // 通过二重循环输出二维数组中元素的值
        for (int i = 0; i < names.length    ; i++) {

            for (int j = 0; j < names[i].length; j++) {

                System.out.println(names[i][j]);
            }
        }
            System.out.println("\n");
    }
}
