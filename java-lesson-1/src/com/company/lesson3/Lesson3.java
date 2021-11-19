package com.company.lesson3;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(  getIntArr(3, 18)));
        int[] arr = {2, 2, 2, 1, 2, 2,  10, 1};
        //checkBalance(arr);
        //printMaxMinValues(arr);
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        printRotatedArray(arr1, 2);
    }

    /**
     * 1-е задание
     */
    public static void replaceZeros() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int currItem : arr) {
            currItem = currItem == 0 ? 1 : (currItem == 1 ? 0 : currItem);
        }
    }

    /**
     * 2-е Задание
     */
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    /**
     * 3-е задание
     * Множить на 2, но не все
     */
    public static void multiplyItems() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    /**
     * 4-е задание
     * заменить диагонали в матрице
     */
    public static void peplaceDiagonalElements() {
        int[][] arr = {{2,3,3,2},{4,5,5,4},{7,6,6,7},{8,9,9,8}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j ||  i == arr.length - j - 1) {
                    arr[i][j] = 1;
                }
            }
        }
    }

    /**
     * 5-е задание
     * @param len длина массива
     * @param initialValue чем заполнить
     * @return
     */
    public static int[] getIntArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    /**
     * 6-е задание
     * @param arr
     */
    public static void printMaxMinValues(int[] arr) {
        int minVal = arr[0];
        int maxVal = arr[0];
        for (int currItem : arr) {
            if (currItem < minVal) {
                minVal = currItem;
            }
            if (currItem > maxVal) {
                maxVal = currItem;
            }
        }
        System.out.println(String.format("Массив : %s. Мин. значение - %d, макс. значение - %d",
                Arrays.toString(arr),minVal,maxVal));
    }

    /**
     * 7-е задание
     * @param arr
     * @return
     * тут еще ожно отрефакторить - вычислять сумму справа и слева только на первой итерации.
     * на последующих только прибавлять к леввой сумме значение следующего элемента, а соответстсвенно
     * правую уменьшать на это же значение/
    public static boolean checkBalance(int[] arr) {
        for (int i = 1 ; i < arr.length; i++){
            int summLeft = getArrRangeSumm(arr, 0, i - 1);
            int summRight = getArrRangeSumm(arr, i, arr.length-1);
            if (summLeft == summRight) {
                return true;
            }
        }
        return false;
    }

    /**
     * Получить сумму злементов диапазона
     * @param arr
     * @param startIndex
     * @param endIndex
     * @return
     */
    public static int getArrRangeSumm(int[] arr, int startIndex, int endIndex) {
        int summValue = 0;
        for (int i = startIndex ; i <= endIndex ; i++){
            summValue += arr[i];
        }
        return summValue;
    }

    /**
     * 8-е задание
     *
     */
    public static void printRotatedArray(int[] arr, int n) {
        System.out.println(Arrays.toString(arr));
        for (int j = 1; j <= Math.abs(n); j++){
            int b;
            if (n > 0) {
                int a = arr[arr.length - 1];
                for (int i = 0 ; i < arr.length; i++) {
                    b = arr[i];
                    arr[i] = a;
                    a = b;
                }
            }
            if (n < 0) {
                int a = arr[0];
                for (int i = arr.length -1 ; i >= 0; i--) {
                    b = arr[i];
                    arr[i] = a;
                    a = b;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /*public static void printRotatedArray(int[] arr, int n) {
        System.out.println(Arrays.toString(arr));
        if (n > 0) {
            for (int j = 1; j <= n; j++){
                int a = arr[0];
                int b;
                for (int i = 0 ; i < arr.length-1; i++) {
                    //двигаем крайние элементы
                    if (i == 0) {
                        arr[i] = arr[arr.length - 1];
                        arr[arr.length - 1] = arr[arr.length - 2];
                    }
                    else {
                        b = arr[i];
                        arr[i] = a;
                        a = b;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }*/
}
