package com.komiles.study.pattern.template;

/**
 * @author komiles@163.com
 * @date 2020-05-30 22:58
 */
public class Basketball extends GameBase {

    @Override
    void initGame() {
        System.out.println(Basketball.class+" init game");
    }

    @Override
    void startGame() {
        System.out.println(Basketball.class+" start game");
    }

    @Override
    void endGame() {
        System.out.println(Basketball.class+" end game");
    }
}
