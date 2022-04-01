package com.company.lesson7;

import com.company.lesson7.animals.Animal;
import com.company.lesson7.animals.Cat;
import com.company.lesson7.animals.Dog;

public class Lesson7 {
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Барсик", 5);
        Plate plate = new Plate(20);
        plate.info();
        //catBarsik.eat();
        //plate.setFood(plate.getFood() - catBarsik.getAppetite());
        Cat catVasya = new Cat("Вася", 7);
        Cat catMurzik = new Cat("Мурзик", 3);
        Cat catMarkiz = new Cat("Маркиз", 9);
        Cat[] cats = new Cat[]{catBarsik, catVasya , catMurzik, catMarkiz, };
        feedCats(cats, plate);
        plate.increaseFood(30);
        plate.info();
        feedCats(cats, plate);
    }

    public static void feedCats(Cat[] cats, Plate plate ) {
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println("Кот " + cat.getName() + (cat.isFellFed() ? " сыт." : " не сыт."));
        }
    }
}



