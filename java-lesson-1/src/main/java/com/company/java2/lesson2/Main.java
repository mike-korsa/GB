package com.company.java2.lesson2;

import com.company.java2.lesson2.exeptions.MyArrayDataException;
import com.company.java2.lesson2.exeptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][] {
                {"0", "2", "5", "8"},
                {"0", "24", "5", "8"},
                {"0", "27", "5", "8"},
                {"0", "2", "55", "18g"}
                //,{"0", "2", "55", "18g"}
        };
        System.out.println(getArraySumm(arr));
    }

    public static int getArraySumm(String[][] arr) {
        int summ = 0;
        try {
            if (arr.length > 4) {
                throw new MyArraySizeException("Превышем размер массива");
            }
        }
        catch (MyArraySizeException e) {
           //e.getMessage();
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    int currentItem = Integer.parseInt(arr[i][j]);
                    summ +=currentItem;
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка при конвертации элемента " + i + ", " + j +". Со значением " +  arr[i][j]);
                    //System.out.println();
                    //return 0;
                }

            }
        }
        return summ;
    }




}

