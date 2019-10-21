package com.tuan.week01;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float heightRectangle = 0.0f;
        float widthRectangle = 0.0f;
        System.out.println("Input width: ");
        widthRectangle = sc.nextFloat();
        System.out.println("Input height: ");
        heightRectangle = sc.nextFloat();
        System.out.println("Area is: " + (heightRectangle * widthRectangle));
    }
}
