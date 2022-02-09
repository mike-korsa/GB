package com.company.java2.lesson4.animals;

public interface Jumpable {
    default void jump() {
        System.out.println("Я не умею прыгать");
    }
}
