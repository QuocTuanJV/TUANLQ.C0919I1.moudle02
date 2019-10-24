package com.tuan.circleAndcylinder;

public class Cylinder extends Circle {
    private int height;
    public Cylinder(){

    }
    public Cylinder(int height, int radius, String color){
        super(radius, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public double volumeCylinder(){
        return super.getArea() * this.height;
    }
    public String toString(){
        return "Cylinder have radius: " + super.getRadius() + " and color is: " + super.getColor() + " and height: " + this.getHeight();
    }
}
