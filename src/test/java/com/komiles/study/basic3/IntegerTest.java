package com.komiles.study.basic3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author komiles@163.com
 * @date 2020-07-05 22:01
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class IntegerTest {

    @Test
    public void index(){
        java.lang.Integer a = 123;
        Byte b = a.byteValue();
        System.out.println("byte:"+b);
        Double d = a.doubleValue();
        System.out.println("double:"+d);
        Float f = a.floatValue();
        System.out.println("float:"+f);
        int i = a.intValue();
        System.out.println("int:"+i);
        Long l = a.longValue();
        System.out.println("long:"+l);

        java.lang.String s = "1232";
        int  rs = java.lang.Integer.parseInt(s);
        System.out.println("字符串转int:"+rs);

        java.lang.String s1 = "1232";
        java.lang.Integer rs1 = java.lang.Integer.valueOf(s1);
        System.out.println("字符串转Integer:"+rs1+"类型为："+rs1.getClass().getTypeName());
    }

    @Test
    public void index2(){

        // 基本类型转字符串
        int a = 123;
        java.lang.String res = Integer.toString(a);
        java.lang.String res1 = java.lang.String.valueOf(a);
        System.out.println(res+res1);

        // 字符串转基本类型
        java.lang.String b = "123";
        int res2 = Integer.parseInt(b);
        int res3 = java.lang.Integer.valueOf(b);
        System.out.println(res2+res3);
    }

    @Test
    public void index3(){

        double m = 78.5;
        //将基本类型转换为字符串
        java.lang.String str1 = Double.toString(m);

        System.out.println("m 转换为String型后与整数20的求和结果为： "+(str1+20));

        java.lang.String str = "180.20";
        // 将字符串转换为基本类型
        Double a =   Double.parseDouble(str);

        System.out.println("str 转换为double型后与整数20的求和结果为： "+(a+20));
    }

    @Test
    public void index4(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

        java.lang.String res = simpleDateFormat.format(date);
        System.out.println(res);
    }

    @Test
    public void index5()throws ParseException {
        // 使用format()方法将日期转换为指定格式的文本
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 创建Date对象，表示当前时间
        Date now = new Date();

        // 调用format()方法，将日期转换为字符串并输出
        System.out.println(sdf1.format(now));
        System.out.println(sdf2.format(now));
        System.out.println(sdf3.format(now));

        // 使用parse()方法将文本转换为日期
        java.lang.String d = "2014-6-1 21:05:36";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 调用parse()方法，将字符串转换为日期
        Date date = sdf.parse(d);

        System.out.println(date);
    }

    @Test
    public void index6(){
        // 创建Calendar对象
        Calendar c = Calendar.getInstance();
        // 将Calendar对象转换为Date对象
        Date date = c.getTime();

        // 创建SimpleDateFormat对象，指定目标格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 将日期转换为指定格式的字符串
        java.lang.String now = sdf.format(date);
        System.out.println("当前时间：" + now);
    }


    @Test
    public void index7(){
        // 定义一个整型数组，长度为10
        int[] nums = new int[10];

        //通过循环给数组赋值
        for (int i = 0; i < nums.length; i++) {
            // 产生10以内的随机数
            int x = (int) (Math.random()*10);
            nums[i] = x;// 为元素赋值
        }

        // 使用foreach循环输出数组中的元素
        for ( int num:nums                   ) {
            System.out.println(num + " ");
        }
    }

}
