package com.company.java2.lesson2.exeptions;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(String s) {
        System.out.println(s);
    }
}
