package com.company.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        // write your code here
        /*printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();*/
        //System.out.println(  2 + 2 + "sdfsd" );
        System.out.println(new int[][] { { 1, 2, 7 }, { 3, 4, 5 } }[1][2]);
        String s = "sss";
        System.out.println(s.charAt(1));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 3;
        int s = a + b;
        if (s >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");

    }

    public static void printColor() {
        int value = 45;
        if (value <= 0)
            System.out.println("Красный");
        else if (value >0 && value <=100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }

    public static void  compareNumbers() {
        int a = 15;
        int b = 13;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }
}
