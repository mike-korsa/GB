package com.company.lesson7.animals;

import com.company.lesson7.Plate;

public class Animal {
    private String name;
    private static int countOfObjects;
    private int appetite;
    private boolean fellFed = false;

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

    public int getAppetite() { return appetite; }

    public boolean isFellFed() { return fellFed; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int barrierLength) {
        System.out.println(String.format("%s пробежал %d метров.", this.name , barrierLength ));
    }

    public void sweem(int barrierLength) {
        System.out.println(String.format("%s проплыл %d метров.", this.name , barrierLength ));
    }

    public void eat(Plate p) {
        if (appetite <= p.getFood()) {
            p.decreaseFood(appetite);
            this.fellFed = true;
        }
        else  {
            this.fellFed = false;
        }
    }

}
