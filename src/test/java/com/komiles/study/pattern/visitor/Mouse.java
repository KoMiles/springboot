package com.komiles.study.pattern.visitor;

/**
 * @author komiles@163.com
 * @date 2020-05-31 23:36
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
