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
        int max = ages[0];
        for(int i = 1;i<ages.length;i++){
            if(ages[i]>max){
                max = ages[i];
            }
        }
        return max;
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

    /**
     * 方法重载
     */
    @Test
    public void index5(){
        show();
        show("kongming");
        show("kongming",20);
        show(22,"kongming");
    }

    public void show(){
        System.out.println("welcome");
    }

    public void show(String name){
        System.out.println("welcome"+name);
    }

    public void show(String name,int age){
        System.out.println("welcome"+name+"age:"+age);
    }

    public void show(int age, String name){
        System.out.println("welcome2"+name+"age2:"+age);
    }

    @Test
    public void index6(){
        int numList[] = new int[5];

        for(int i=0;i<numList.length;i++){
            numList[i] =(int)(Math.random()*100);
        }

        System.out.println(Arrays.toString(numList));
    }


    @Test
    public void index7(){
        // 创建对象，对象名为hello
        Oop hello = new Oop();

        // 调用方法并将返回值保存在变量中
        int[] nums = hello.getArray(8);

        // 将数组转换为字符串并输出
        System.out.println(Arrays.toString(nums));
    }

    public int[] getArray(int length) {
        // 定义指定长度的整型数组
        int[] nums = new int[length];

        // 循环遍历数组赋值
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
            // 产生一个100以内的随机数，并赋值给数组的每个成员

        }
        return nums;
    }


    @Test
    public void index8(){
        int scores[] = { 89 , -23 , 64 , 91 , 119 , 52 , 73};
        Oop hello = new Oop();
        System.out.println("考试成绩的前3名为：")  ;
        hello.paiMing(scores);
    }

    public int[] paiMing(int[] numList){
       Arrays.sort(numList);
       int num = 0;
       for(int i=numList.length-1;i>=0;i--){
           if(numList[i]<0 || numList[i]>100) {
                continue;
           }
           num++;
            if(num>3) {
                break;
            }
           System.out.println(numList[i]);
       }
       return numList;
    }
}
