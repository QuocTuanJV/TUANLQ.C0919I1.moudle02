package com.tuan.circleAndcylinder;

public class Circle {
    private int radius;
    private String color;
    public Circle(){

    }
    public Circle(int radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public String toString(){
        return "Circle have radius: " + this.getRadius() + " and color: " + this.getColor();
    }
}
