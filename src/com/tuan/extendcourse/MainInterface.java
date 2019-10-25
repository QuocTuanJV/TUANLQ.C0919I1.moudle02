package com.tuan.extendcourse;

public class MainInterface {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] =  new Circle(2,"green", true);
        shapes[1] = new Rectangle(12,10,"green",true);

        for(Shape shape: shapes){
            if(shape instanceof Circle){
                ((Circle) shape).resize123(100);
            } else if(shape instanceof Rectangle){
                ((Rectangle) shape).resize123(200);
            }
        }


    }
}
