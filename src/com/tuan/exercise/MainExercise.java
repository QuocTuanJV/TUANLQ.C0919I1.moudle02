package com.tuan.exercise;

import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager ma = new Manager();
        Student dung = new Student("Dung", 10.5);
        Student minh = new Student("Minh", 30.5);
        Student tuan = new Student("Tuan", 20);
        Student cuong = new Student("Cuong", 25);
        ma.addStudentToList(dung);
        ma.addStudentToList(minh);
        ma.addStudentToList(tuan);
        ma.addStudentToList(cuong);
        ma.removeStudentFromList(tuan);
        ma.removeStudentFromList(cuong);
        ma.printListStudent();
        System.out.println("Avg Mark: " + ma.getAvgMark());
    }
}
