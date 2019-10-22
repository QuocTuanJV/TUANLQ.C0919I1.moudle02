package com.tuan.week02;

import java.util.Scanner;

public class InsertValueInArray {
    public static void main(String[] args) {
        int[] myArray = getArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input position insert: ");
        int indexInsert = sc.nextInt();
        System.out.println("Input value input: ");
        int valueInsert = sc.nextInt();
        printArray(insertValueToArray(indexInsert,valueInsert,myArray));

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
    public static int[] insertValueToArray(int indexInsert,int valueInsert, int[] array){
        int[] newArray = new int[array.length + 1];
        int myIndexInsert = indexInsert - 1;
        assignElementArray(newArray, array);
        if(indexInsert < 1 || indexInsert > array.length){
            System.out.println("Cannot insert to Array");
        } else{
            for(int i = array.length - 1; i >=  myIndexInsert; i--){
                newArray[i + 1] = newArray[i];
            }
            newArray[myIndexInsert] = valueInsert;
        }
        return newArray;
    }
    public static void printArray(int[] array){
        for(int i = 0; i< array.length; i++){
            System.out.println(array[i] + "\t");
        }
    }
    public static void assignElementArray(int[] arrayAssigned, int[] arrayAssign){
        if(arrayAssign.length > arrayAssigned.length) return;
        for(int i = 0; i < arrayAssign.length; i++){
            arrayAssigned[i] =arrayAssign[i];
        }
    }

}
