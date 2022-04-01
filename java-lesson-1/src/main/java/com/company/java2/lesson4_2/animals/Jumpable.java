package com.company.java2.lesson4_2.animals;

public interface Jumpable {
    default void jump() {
        System.out.println("Я не умею прыгать");
    }
}
