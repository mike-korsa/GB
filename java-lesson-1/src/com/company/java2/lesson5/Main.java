package com.company.java2.lesson5;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args)  throws InterruptedException{
        method1();
        method2();
    }

    public static void method1() {
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        fillArray(arr);
        long b = System.currentTimeMillis();
        System.out.println(b - a);
    }

    public static void method2() throws InterruptedException {
        float[] arr1 = new float[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        float[] leftArr = new float[h];
        float[] rightArr = new float[h];
        System.arraycopy(arr1, 0, leftArr, 0, h);
        System.arraycopy(arr1, h, rightArr, 0, h);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                fillArray(leftArr);
                System.out.println("thread1 done");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                fillArray(rightArr);
                System.out.println("thread2 done");
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        //склеить
        System.arraycopy(leftArr, 0, arr1, 0, h);
        System.arraycopy(rightArr, 0, arr1, h, h);
        long b = System.currentTimeMillis();
        System.out.println(b - a);
    }

    static void fillArray(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[1] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
