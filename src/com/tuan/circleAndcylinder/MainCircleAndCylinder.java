package com.tuan.circleAndcylinder;

public class MainCircleAndCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(1,"green");
        Cylinder cylinder = new Cylinder(2,2,"red");
        System.out.println(circle);
        System.out.println(cylinder.volumeCylinder());

    }

}
