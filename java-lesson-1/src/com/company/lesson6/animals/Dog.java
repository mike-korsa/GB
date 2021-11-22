package com.company.lesson6.animals;

public class Dog extends Animal{
    private final int MAXRUNLENGTH = 500;
    private final int MAXSWEEMLENGTH = 10;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int barrierLength) {
        if (barrierLength > MAXRUNLENGTH) {
            System.out.println(String.format("Собака не может бегать больче чем %s метров.", MAXRUNLENGTH));
        }
        else {
            super.run(barrierLength);
        }
    }

    @Override
    public void sweem(int barrierLength) {
        if (barrierLength > MAXSWEEMLENGTH) {
            System.out.println(String.format("Собака не может плавать больче чем %s метров.", MAXSWEEMLENGTH));
        }
        else {
            super.sweem(barrierLength);
        }
    }


}
