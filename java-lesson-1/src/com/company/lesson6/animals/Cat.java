package com.company.lesson6.animals;

public class Cat extends Animal {
    private final int MAXRUNLENGTH = 200;
    private final int MAXSWEEMLENGTH = 200;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int barrierLength) {
        if (barrierLength > MAXRUNLENGTH) {
            System.out.println(String.format("Кот не может бегать больче чем %s метров.", MAXRUNLENGTH));
        }
        else {
            super.run(barrierLength);
        }
    }

    @Override
    public void sweem(int barrierLength) {
        System.out.println("Кот не умеет плавать.");
    }
}
