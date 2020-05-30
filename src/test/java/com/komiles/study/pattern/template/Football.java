package com.komiles.study.pattern.template;

/**
 * @author komiles@163.com
 * @date 2020-05-30 22:56
 */
public class Football extends GameBase {

    @Override
    void initGame() {
        System.out.println(Football.class+" init game");
    }

    @Override
    void startGame() {
        System.out.println(Football.class+" start game");
    }

    @Override
    void endGame() {
        System.out.println(Football.class+" end game");
    }
}
