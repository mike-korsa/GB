package com.company.java3.lesson1;

import java.util.HashMap;

public class GenericDemoApplication {
    public static void main(String[] args) {
        OneGeneric<String> genericString = new OneGeneric<>("123");
        genericString.showType();
        genericString.setObj("456");
        OneGeneric<Integer> genericInteger = new OneGeneric<>(789);
        genericInteger.showType();
        genericInteger.setObj(999);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("123", 789);

        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2.put(123, "789");
    }

    public static class OneGeneric<T> {
        private T obj;

        public OneGeneric(T obj) {
            this.obj = obj;
        }

        public T getObj() {
            return obj;
        }

        public void showType() {
            System.out.println("Тип T: " + obj.getClass().getName());
        }

        public void setObj(T obj) {
            this.obj = obj;
        }
    }
}
