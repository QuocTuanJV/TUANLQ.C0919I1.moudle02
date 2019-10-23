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
        return "Cylinder have radius: " + this.getRadius() + " and color is: " + this.getColor() + " and height: " + this.getHeight();
    }
}
