package com.company.lesson6;

import com.company.lesson6.animals.Animal;
import com.company.lesson6.animals.Cat;
import com.company.lesson6.animals.Dog;

public class Lesson6 {
    public static void main(String[] args) {
       Cat cat1 = new Cat("Вася");
       Dog dog1 = new Dog("Бобик");
       Dog dog2 = new Dog("Шарик");
       cat1.sweem(10);
       dog2.run(50);
       dog1.run(1000);
       System.out.println("Объектов создано - " + Animal.getCountOfObjects());
    }
}
