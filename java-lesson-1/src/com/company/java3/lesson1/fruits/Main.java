package com.company.java3.lesson1.fruits;

public class Main {
    public static void main(String[] args) {
        Apple app = new Apple();
        Apple app1 = new Apple();
        app.printInfo();
        Box b = new Box();
        b.addFruit(app);
        System.out.println(b.getWeight());
        b.addFruit(app1);
        System.out.println(b.getWeight());
        Orange or = new Orange();
        Orange or1 = new Orange();
        Box b1 = new Box();
        b1.addFruit(or);
        b1.addFruit(or1);
        System.out.println(b.compare(b1));
        Apple app2 = new Apple();
        b.addFruit(app2);
        System.out.println(b.compare(b1));
    }
}
