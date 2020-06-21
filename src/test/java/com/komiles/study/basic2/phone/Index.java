package com.komiles.study.basic2.phone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author komiles@163.com
 * @date 2020-06-21 17:33
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Index {

    @Test
    public void test(){
//        CellPhone cellPhone = new CellPhone();
//        cellPhone.call();
//        cellPhone.message();
        TelPhone telPhone = new CellPhone();
        telPhone.call();
        telPhone.message();


//        SmartPhone smartPhone  = new SmartPhone();
//        smartPhone.call();
//        smartPhone.message();
        IPlayGame iPlayGame = new SmartPhone();
        iPlayGame.playGame();

        IPlayGame iPlayGame1 = new Psp();
        iPlayGame1.playGame();
    }


    @Test
    public void test2()
    {

        IPlayGame iPlayGame = new IPlayGame() {
            @Override
            public void playGame() {
                System.out.println("使用匿名内部类的方式实现接口");
            }
        };

        iPlayGame.playGame();
    }

    @Test
    public void test3(){
        new IPlayGame(){
            @Override
            public void playGame() {
                System.out.println("直接new Iplay方法");
            }
        }.playGame();
    }

}
