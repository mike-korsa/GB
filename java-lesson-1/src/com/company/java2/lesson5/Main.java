package com.company.java2.lesson5;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        method1();

    }

    public static void method1() {
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[1] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long b = System.currentTimeMillis();
        System.out.println(b - a);
    }

    public static void method2() {
        float[] arr1 = new float[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        float[] leftArr = new float[h];
        float[] rightArr = new float[h];
        System.arraycopy(arr1, 0, leftArr, 0, h);
        System.arraycopy(arr1, h, rightArr, 0, h);
        

    }
}
