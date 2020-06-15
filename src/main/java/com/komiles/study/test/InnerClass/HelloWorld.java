package com.komiles.study.test.InnerClass;

/**
 * 成员内部类
 * 1、 Inner 类定义在 Outer 类的内部，相当于 Outer 类的一个成员变量的位置，Inner 类可以使用任意访问控制符，如 public 、 protected 、 private 等
 *
 * 2、 Inner 类中定义的 test() 方法可以直接访问 Outer 类中的数据，而不受访问控制符的影响，如直接访问 Outer 类中的私有属性a
 *
 * 3、 定义了成员内部类后，必须使用外部类对象来创建内部类对象，而不能直接去 new 一个内部类对象，即：内部类 对象名 = 外部类对象.new 内部类( );
 * @author komiles@163.com
 * @date 2020-06-15 10:33
 */
public class HelloWorld{

    /**
     * 外部类的私有属性name
     */
    private String name = "imooc";

    /**
     * 外部类的成员属性
     */
    int age = 20;

    /**
     * 成员内部类Inner
     */
    public class Inner {
        String name = "爱慕课";
        //内部类中的方法
        public void show() {
            System.out.println("外部类中的name：" + HelloWorld.this.name);
            System.out.println("内部类中的name：" + name);
            System.out.println("外部类中的age：" + age);
        }
    }

    /**
     * 测试成员内部类
     * @param args
     */
    public static void main(String[] args) {

        //创建外部类的对象
        HelloWorld o = new HelloWorld ();

        //创建内部类的对象
        Inner inn =  o.new Inner();

        //调用内部类对象的show方法
        inn.show();
    }
}
