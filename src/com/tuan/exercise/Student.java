package com.tuan.exercise;

public class Student {
    private String name;
    private double mark;
    public Student(){
        System.out.println("I'm student");
    }
    public Student(String name, double mark){
        this.name = name;
        this.mark = mark;
    }
    public String getName(){
        return this.name;
    }
    public double getMark(){
        return this.mark;
    }
}
