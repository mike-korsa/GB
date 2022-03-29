package com.company.java3.lesson1.fruits;

public class Fruit {

    protected float weight;
    protected String name;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Это " + this.name + ", весит " + this.weight);
    }

}
