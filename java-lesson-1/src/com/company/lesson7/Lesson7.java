package com.company.lesson7;

import com.company.lesson7.animals.Animal;
import com.company.lesson7.animals.Cat;
import com.company.lesson7.animals.Dog;

public class Lesson7 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat();
        plate.setFood(plate.getFood() - cat.getAppetite());
    }
}



