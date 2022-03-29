package com.company.java3.lesson1.fruits;

import java.util.ArrayList;

public class Box {

    private Fruit obj;
    private ArrayList<Fruit> listFruits;

    /*public Box(Fruit obj) {
        this.obj = obj;
    }*/

    public Fruit getObj() {
        return obj;
    }

    public void setObj(Fruit obj) {
        this.obj = obj;
    }

    public void addFruit(Fruit f) {
        if (listFruits == null ) listFruits = new ArrayList<>();
        listFruits.add(f);
    }

    public Float getWeight() {
        float w = 0;
        for (Fruit f : listFruits) {
            w += f.getWeight();
        }
        return w;
    }

    public boolean compare(Box anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

}
