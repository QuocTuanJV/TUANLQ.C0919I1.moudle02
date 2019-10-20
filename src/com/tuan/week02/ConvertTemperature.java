package com.tuan.week02;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit = 0;
        double celsius = 0;
        int choice = 0;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius toFahrenheit ");
            System.out.println("0. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("Enter Fahrenheit:");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:

                    System.out.println("Enter Celsius:");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;

                case 0:
                    choice = 0;
                    break;

            }


        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
