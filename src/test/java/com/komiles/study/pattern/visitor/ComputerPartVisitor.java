package com.komiles.study.pattern.visitor;

/**
 * @author komiles@163.com
 * @date 2020-05-31 23:36
 */
public interface ComputerPartVisitor {

    public void visit(Computer computer);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
    public void visit(Mouse mouse);
}
