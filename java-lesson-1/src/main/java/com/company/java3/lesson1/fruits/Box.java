package com.company.java3.lesson1.fruits;

import java.util.ArrayList;

public class Box {

    private Fruit obj;
    private ArrayList<Fruit> listFruits = new ArrayList<>();
    private int countFruits;

    public ArrayList<Fruit> getListFruits() {
        return listFruits;
    }

    public void setListFruits(ArrayList<Fruit> listFruits) {
        this.listFruits = listFruits;
    }

    public void remomeAllFruits() {
        listFruits.clear();
    }

    public void addFruit(Fruit f) {
        if ((listFruits.size() > 0 && listFruits.get(0).getClass().equals(f.getClass())) || listFruits.size() == 0) {
            listFruits.add(f);
        } else {
            System.out.println("Нелзья добавить " + f.getName() + " в коробку с " + listFruits.get(0).getName());
        }
    }

    public boolean addFruits(ArrayList<Fruit> fruits) {
        if ((listFruits.size() > 0 && listFruits.get(0).getClass().equals(fruits.get(0).getClass())) || listFruits.size() == 0) {
            listFruits.addAll(fruits);
            return true;
        } else {
            System.out.println("Нелзья добавить " + fruits.get(0).getName() + " в коробку с " + listFruits.get(0).getName());
            return false;
        }
    }

    public Float getWeight() {
        float w = 0;
        if (listFruits != null) {
            w = listFruits.size() * listFruits.get(0).getWeight();
        }
        return w;
    }

    public boolean compare(Box anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

}
