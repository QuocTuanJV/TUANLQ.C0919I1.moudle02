package com.tuan.week01;

import java.util.Scanner;

public class caculateDayEveryMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0;
        System.out.println("input month to caculate: ");
        month = sc.nextInt();

            switch (month){
                case 2:
                    System.out.println("Has 28 or 29 days");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Has 31 days");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Has 30 days");
                    break;
                default:
                    System.out.println("invalid input!");
                    break;

        }
    }
}
