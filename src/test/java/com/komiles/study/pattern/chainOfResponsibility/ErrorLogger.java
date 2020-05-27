package com.komiles.study.pattern.chainOfResponsibility;

/**
 * @author komiles@163.com
 * @date 2020-05-27 19:05
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(Integer level) {
        this.Level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("错误输出："+message);
    }
}
