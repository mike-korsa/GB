package com.company.java3.lesson1.fruits;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.addFruit(new Apple());
        b1.addFruit(new Apple());
        System.out.println(b1.getWeight());
        Box b2 = new Box();
        b2.addFruit(new Orange());
        b2.addFruit(new Orange());
        System.out.println("Коробки одинкового веса - " + b1.compare(b2));
        b1.addFruit(new Apple());
        System.out.println("Коробки одинкового веса - " +b1.compare(b2));
        b2.addFruit(new Apple());
        System.out.println("В первой коробке " + b1.getListFruits().size() + " фруктов, во второй - " + b2.getListFruits().size() );
        moveAllFruits(b2, b1);
        System.out.println("В первой коробке " + b1.getListFruits().size() + " фруктов, во второй - " + b2.getListFruits().size() );
        Box b3 = new Box();
        b3.addFruit(new Apple());
        moveAllFruits(b1, b3);
        System.out.println("В первой коробке " + b1.getListFruits().size() + " фруктов, в третьей - " + b3.getListFruits().size() );
    }

    public static void moveAllFruits(Box sourceBox, Box targetBox) {
        if (targetBox.addFruits(sourceBox.getListFruits())) {
            sourceBox.remomeAllFruits();
        }
    }
}
