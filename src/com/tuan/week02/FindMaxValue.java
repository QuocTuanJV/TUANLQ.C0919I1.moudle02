package com.tuan.week02;

import java.util.Scanner;

public class FindMaxValue {
    public static void main(String[] args) {
        int[] myArray = getArray();
        System.out.println("Max value in array: " + getMaxValueArray(myArray));
        printArray(myArray);
    }
    public static int getMaxValueArray(int[] array){
        int max = array[0];
        for(int i=0; i<array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
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
