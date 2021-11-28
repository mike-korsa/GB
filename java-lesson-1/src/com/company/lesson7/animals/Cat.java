package com.company.lesson7.animals;

import com.company.lesson7.Plate;

public class Cat extends Animal {
    private final int MAXRUNLENGTH = 200;
    private final int MAXSWEEMLENGTH = 200;
    private String name;

    private int appetite;
    public Cat(String name,int appetite) {
        super(name, appetite);
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

    public void eat() { }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    public int getAppetite() {
        return appetite;
    }
}
