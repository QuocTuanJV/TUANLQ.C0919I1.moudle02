package com.tuan.extendcourse;

 public class Shape {
    private String color = "green";
    private boolean filled = true;
    public Shape(){

    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String setFilledText(){
        if(this.isFilled()){
            return "filled";
        }
        else
            return "not filled";
    }
    public String toString(){
        return "A Shape with color of " + this.getColor() +
                " and " + this.setFilledText();
    }

//     public abstract void resize(int i);
 }
class Circle extends Shape implements Resizeable{
    private double radius = 1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    public String toString(){
       return "A Circle with radius= " + this.radius + ", which is a" +
               " subclass of " + super.toString();
    }


    @Override
    public void resize123(double percent) {
        System.out.println("Area of Circle before increase " + this.getArea());
        System.out.println("Area of Circle after increase " + percent + " is: " + this.getArea() * percent);
    }

}
class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length,String color, boolean filled ){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.length * this.width;
    }
    public double getPerimeter(){
        return (this.length + this.width) * 2;
    }
    public String toString(){
        return "A Rectangle with=" + this.width + " and length= " + this.length +", which is a subclass of " + super.toString();
    }

    @Override
    public void resize123(double percent) {
        System.out.println("Area of Rectangle before increase " + this.getArea());
        System.out.println("Area of Rectangle after increase " + percent + " is: " + this.getArea() * percent);
    }
}
class Square extends Rectangle{
     public Square(){

     }
     public Square(double side){
         super(side, side);
     }
     public Square(double side, String color, boolean filled){
         super(side,side,color,filled);
     }
     public double getSide(){
         return this.getLength();
     }
     public void setSide(double side){
         this.setLength(side);
         this.setWidth(side);
     }
     public void setWidth(double width){
         this.setSide(width);
     }
     public void setLength(double length){
         this.setSide(length);
     }

     public String toString(){
         return "A Square with side = " + this.getSide() +", which is a subclass of " + super.toString();
     }
}
interface Resizeable{
     void resize123(double percent);
}

