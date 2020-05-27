package com.komiles.study.pattern.chainOfResponsibility;



/**
 * 优点：
 * 1、降低耦合度。它将请求的发送者和接收者解耦。
 * 2、简化了对象。使得对象不需要知道链的结构。
 * 3、增强给对象指派职责的灵活性。通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任。 4、增加新的请求处理类很方便。
 *
 * 缺点：
 * 1、不能保证请求一定被接收。
 * 2、系统性能将受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用。
 * 3、可能不容易观察运行时的特征，有碍于除错。
 * @author komiles@163.com
 * @date 2020-05-27 19:00
 */
public abstract class AbstractLogger {

    public static Integer INFO = 1;
    public static Integer DEBUG = 2;
    public static Integer ERROR = 3;

    protected Integer Level;

    // 责任链中下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger abstractLogger){
        this.nextLogger = abstractLogger;
    }

    public void logMessage(Integer level, String message){
        if(this.Level<= level){
            write(message);
        }
        if(nextLogger != null){
            nextLogger.logMessage(level,message);
        }
    }

    abstract protected void write(String message);
}
