package com.company.java3.lesson1;

import java.util.HashMap;

public class TwoGenericsDemoApplication {
    public static void main(String[] args) {
        TwoGeneric<String, Integer> stringIntegerTwoGeneric = new TwoGeneric<>("123", 456);
        stringIntegerTwoGeneric.showTypes();

        stringIntegerTwoGeneric.setObj1("789");
        System.out.println(stringIntegerTwoGeneric.getObj1());

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("123", 789);

        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2.put(123, "789");
    }

    public static class TwoGeneric<Key, Value> {
        private Key obj1;
        private Value obj2;

        public TwoGeneric(Key obj1, Value obj2) {
            this.obj1 = obj1;
            this.obj2 = obj2;
        }

        public Key getObj1() {
            return obj1;
        }

        public void showTypes() {
            System.out.println("Тип K: " + obj1.getClass().getName() + "\n" + "Тип V: " + obj2.getClass().getName());
        }

        public void setObj1(Key obj) {
            this.obj1 = obj;
        }

        public void setObj2(Value obj2) {
            this.obj2 = obj2;
        }

        public Value getObj2() {
            return obj2;
        }
    }
}
