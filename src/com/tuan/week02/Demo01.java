package com.tuan.week02;

public class Demo01 {
    public static void main(String[] args) {
        int arrayLength = 4;
        int indexInsert = 2;
        int valueInsert = 10;
        int[] a = {1, 2, 3, 4, 0};

        for(int i= arrayLength - 1;i >= indexInsert - 1; i--){
            a[i + 1] = a[i];
        }
        a[indexInsert - 1] = valueInsert;

        for (int i = 0; i< a.length; i++){
            System.out.println(a[i] + "\t");
        }

    }
}
