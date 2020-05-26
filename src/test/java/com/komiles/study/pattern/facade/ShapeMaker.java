package com.komiles.study.pattern.facade;

/**
 * 外观类
 * @author komiles@163.com
 * @date 2020-05-25 18:08
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    /**
     * 画个圆形
     */
    public void drawCircle(){
        circle.draw();
    }

    /**
     * 画个矩形
     */
    public void drawRectangle(){
        rectangle.draw();
    }

    /**
     * 画个正方形
     */
    public void drawSquare() {
        square.draw();
    }
}
