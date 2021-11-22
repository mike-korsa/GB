package com.company.lesson6;

public class Animal {
    private String name;
    private static int countOfObjects;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
        this.countOfObjects++;
    }

    public static int getCountOfObjects() {
        return countOfObjects;
    }

    protected void run(int barrierLength) {
        System.out.println(String.format("%s пробежал %d метров.", this.name , barrierLength ));
    }

    void sweem(int barrierLength) {
        System.out.println(String.format("%s проплыл %d метров.", this.name , barrierLength ));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
