package com.tuan.classandobject;

public class QuadraticEquation {
    private double a, b, c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = this.b * this.b - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }

    public void caculateResult() {
        if (this.getDiscriminant() >= 0) {
            System.out.println("Have two roots: ");
            System.out.println("Result 01: " + this.getRoot1());
            System.out.println("Result 02: " + this.getRoot2());

        } else if (this.getDiscriminant() == 0) {
            System.out.println("Have two roots the same: ");
            System.out.println("Root 01: " + this.getRoot1());
            System.out.println("Root 02: " + this.getRoot2());
        } else {
            System.out.println("The equation has no roots");
        }
    }


}
