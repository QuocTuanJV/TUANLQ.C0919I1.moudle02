package com.tuan.week02;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's student");
        String input_name = scanner.nextLine();
        if(isFindedName(input_name, students)){
            System.out.println("Position of the studens in the list is: " + getIndexValue(input_name,students) );
        }
        else
            System.out.println("Not found " + input_name + " in list");

    }

    public static boolean isFindedName(String name, String[] students) {
        boolean isFinded = true;
        for (int i =0; i< students.length; i++){
            if(name.equals(students[i])){
                isFinded = true;
                break;
            }
            else
                isFinded = false;
        }
       return isFinded;

    }
    public static int getIndexValue(String name, String[] students) {
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (name.equals(students[i])) {
                index = i + 1;
                break;
            }
        }
        return index;
    }
}


