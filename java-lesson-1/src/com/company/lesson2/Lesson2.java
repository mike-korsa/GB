package com.company.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        //printNumOfString("test", 5);
        System.out.println(isYearLeap(2026));
    }

    public static boolean isSummBetween(int a, int b){
        if ((a + b) > 10 && (a + b) <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void printPosOrNeg(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число Отрицательное");
        }
    }

    public static boolean isNumberPositive(int a) {
        if (a >= 0 ) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void printNumOfString(String s, int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println(s);
        }
    }

    public static boolean isYearLeap(int year) {
        if (year%400 == 0) {
            return true;
        }
        else if ((year%100 == 0)) {
            return false;
        }
        else if (year%4 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

}
