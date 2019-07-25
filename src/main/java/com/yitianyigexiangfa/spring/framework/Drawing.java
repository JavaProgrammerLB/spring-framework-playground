package com.yitianyigexiangfa.spring.framework;

/**
 * @author Bill Lau
 * @date 2019-07-23
 */
public class Drawing {

    Shape shape;

    public Drawing(Shape shape) {
        this.shape = shape;
    }

    public void drawAShape(){
        shape.draw();
    }
}
