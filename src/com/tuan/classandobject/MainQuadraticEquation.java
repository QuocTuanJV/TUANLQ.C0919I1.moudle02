package com.tuan.classandobject;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a:");
        double a = scanner.nextInt();
        System.out.println("Input b:");
        double b = scanner.nextInt();
        System.out.println("Input c:");
        double c = scanner.nextInt();

        QuadraticEquation myQuadraticEquation = new QuadraticEquation(a, b,c);
        myQuadraticEquation.caculateResult();
    }
}
