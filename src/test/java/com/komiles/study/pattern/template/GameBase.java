package com.komiles.study.pattern.template;

/**
 * @author komiles@163.com
 * @date 2020-05-30 22:54
 */
public abstract class GameBase {
    // 初始化游戏
    abstract void initGame();

    // 开始游戏
    abstract void startGame();

    // 结束游戏
    abstract void endGame();

    // 模板
    public final void play(){
        initGame();
        startGame();
        endGame();
    }
}
