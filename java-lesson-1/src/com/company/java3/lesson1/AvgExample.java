package com.company.java3.lesson1;

public class AvgExample {
    public static void main(String[] args) {
        Stats<Integer> integerStats = new Stats<>(new Integer[]{5, 10});
        System.out.println(integerStats.avg());
        Stats<Number> doubleStats = new Stats<>(new Number[]{5.0, 10.0});
        System.out.println(doubleStats.avg());

        System.out.println(integerStats.isSameAvg(doubleStats));

        Stats<Double> doubleStats1 = new Stats<>(new Double[]{1.1, 2.2, 10.10});
        System.out.println(doubleStats1.isSameAvg(integerStats));
    }
}
