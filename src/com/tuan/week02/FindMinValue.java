package com.tuan.week02;

import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {
        int[] myArray = getArray();
        System.out.println("Min value in array: " + getMinValueArray(myArray));
        printArray(myArray);
    }
    public static int getMinValueArray(int[] array){
        int min = array[0];
        for(int i=0; i<array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static int[] getArray(){
        int size = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number array:");
        size = sc.nextInt();
        int[] myArray = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Input array[" + i + "]");
            myArray[i] = sc.nextInt();
        }

        return  myArray;
    }
    public static void printArray(int[] array){
        for(int i = 0; i< array.length; i++){
            System.out.println(array[i] + "\t");
        }
    }
}
