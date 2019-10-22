package com.tuan.classandobject;

import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = scanner.nextInt();
        System.out.println("Enter the height: ");
        double height = scanner.nextInt();
        Rectangle rec = new Rectangle(width, height);
        System.out.println("Your Rectangle \n" + rec.display());
        System.out.println("Perimeter of the Rectangle: " + rec.getPerimeter());
        System.out.println("Area of the Rectangle: " + rec.getArea());
    }
}
