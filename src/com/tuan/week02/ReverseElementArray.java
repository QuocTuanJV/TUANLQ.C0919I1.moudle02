package com.tuan.week02;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseElementArray {
    public static void main(String[] args) {
        int[] myArray = getNewArray();
        System.out.println("Array before");
        printArray(myArray);
        System.out.println("Array after");
        printArray(getReverseArray(myArray));

    }
    public static int[] getNewArray(){
        int size;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("input number size > 20:");
            size= scanner.nextInt();
        }while(size < 3);
        int[] myArray = new int[size];
        for (int i = 0; i < size ; i++){
            System.out.println("Input ");
            myArray[i] = i ;
        }
        return myArray;
    }
    public static void printArray(int[] array){
        for(int i = 0; i< array.length; i++){
            System.out.println(array[i] + "\t");
        }
    }
    public static int[] getReverseArray(int[] array){
        int[] myArray = new int[array.length];
        for (int i = 0; i< array.length; i++){
            myArray[array.length - 1 - i] = array[i];
        }
        return myArray;
    }
}
