package com.komiles.study.basic2.phone;

/**
 * @author komiles@163.com
 * @date 2020-06-21 17:31
 */
public class SmartPhone extends TelPhone  implements IPlayGame{

    @Override
    public void call() {
        System.out.println("通过语音打电话");
    }

    @Override
    public void message() {
        System.out.println("通过语音发短信");
    }

    @Override
    public void playGame() {
        System.out.println("具有玩游戏的功能");
    }
}
