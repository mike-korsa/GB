package com.company.lesson3;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(  getIntArr(3, 18)));
    }

    public static void replaceZeros() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int currItem : arr) {
            currItem = currItem == 0 ? 1 : (currItem == 1 ? 0 : currItem);
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    /**
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
     *
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

    public static boolean checkBalance(int[] arr) {
        for (int i = 1 ; i < arr.length - 1; i++){

        }
    }

    public static int getArrRangeSumm(int[] arr, int startIndex, int endIndex) {
        int summValue = 0;
        for (int i = startIndex ; i <= endIndex - 1; i++){
            summValue += arr[i];
        }
        return summValue;
    }

}
