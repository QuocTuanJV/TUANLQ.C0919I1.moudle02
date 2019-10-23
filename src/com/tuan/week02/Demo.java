package com.tuan.week02;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        AA a = new AA();
        a.printA();
    }
}
class A {
    public void aM(){
        System.out.println("This is A");
    }
}
class AA extends A {

    public void aM(){
        System.out.println("This is AA");
    }
    public void printA(){
        this.aM();
    }
}
class AAA extends AA{
    public AAA(){
        System.out.println("constructor AAA");
    }
}


