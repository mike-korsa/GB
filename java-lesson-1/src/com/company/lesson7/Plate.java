package com.company.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void decreaseFood(int n) {
        if (n <= this.food) {
            this.food -= n;
        }
        else {
            System.out.println("В тарелке недостаточно еды.");
        }
    }

    public void increaseFood(int n) {
        this.food += n;
    }


}
