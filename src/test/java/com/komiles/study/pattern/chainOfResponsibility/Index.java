package com.komiles.study.pattern.chainOfResponsibility;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author komiles@163.com
 * @date 2020-05-27 19:45
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Index {

    @Test
    public void test(){
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,"This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG,"This is a debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR,"This is an error information.");
    }

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
