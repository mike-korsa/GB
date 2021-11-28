package com.company.lesson7.animals;

public class Animal {
    private String name;
    private static int countOfObjects;
    private int appetite;
    public Animal() {
    }

    public Animal(String name) {
         this.name = name;
         this.countOfObjects++;
    }

    public Animal(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.countOfObjects++;
    }

    public static int getCountOfObjects() {
        return countOfObjects;
    }

    public void run(int barrierLength) {
        System.out.println(String.format("%s пробежал %d метров.", this.name , barrierLength ));
    }

    public void sweem(int barrierLength) {
        System.out.println(String.format("%s проплыл %d метров.", this.name , barrierLength ));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
