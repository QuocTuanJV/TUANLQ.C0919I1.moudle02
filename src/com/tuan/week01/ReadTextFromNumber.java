package com.tuan.week01;

public class ReadTextFromNumber {
    public static void main(String[] args) {
        System.out.println(getTextFromNumber(30));
    }

    public static String getTextFromNumber(int number) {
        String textFromNumber = "";
        if(isOutOfAbility(number)){
            textFromNumber = "Out of Ability";
        }
        if (number >= 0 && number < 10) {
            textFromNumber = textOneNumber(number);
        }
        else if(number >=10 && number < 20){
            textFromNumber = textTwoNumber(number);
        }
        return textFromNumber;
    }

    public static boolean isOutOfAbility(int number) {
        boolean isOutOfAbility = false;
        if (number > 20) {
            isOutOfAbility = true;
        } else
            isOutOfAbility = false;
        return isOutOfAbility;
    }

    public static String textTwoNumber(int number) {
        String textFromNumber = "";
        String numberConvert = String.valueOf(number);
        char numberIndexNo1 = numberConvert.charAt(1);
        switch (numberIndexNo1) {
            case '0':
                textFromNumber = "Ten";
                break;
            case '1':
                textFromNumber = "Eleven";
                break;
            case '2':
                textFromNumber = "twelfth";
                break;
            case '3':
                textFromNumber = "Thirteen";
                break;
            case '4':
                textFromNumber = "Fourteen";
                break;
            case '5':
                textFromNumber = "Fifteen";
                break;
            case '6':
                textFromNumber = "Seventeen";
                break;
            case '7':
                textFromNumber = "Thirteen";
                break;
            case '8':
                textFromNumber = "Eightteen";
                break;
            case '9':
                textFromNumber = "Nineteen";
                break;
        }
        return textFromNumber;

    }

    public static String textOneNumber(int number) {
        String textFromNumber = "";
        switch (number) {
            case 0:
                textFromNumber = "Zero";
                break;
            case 1:
                textFromNumber = "One";
                break;
            case 2:
                textFromNumber = "Two";
                break;
            case 3:
                textFromNumber = "Three";
                break;
            case 4:
                textFromNumber = "Four";
                break;
            case 5:
                textFromNumber = "Five";
                break;
            case 6:
                textFromNumber = "Six";
                break;
            case 7:
                textFromNumber = "Seven";
                break;
            case 8:
                textFromNumber = "Eight";
                break;
            case 9:
                textFromNumber = "Nine";
                break;
        }
        return textFromNumber;

    }
}
