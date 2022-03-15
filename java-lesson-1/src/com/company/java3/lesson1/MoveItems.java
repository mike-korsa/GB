package com.company.java3.lesson1;

public class MoveItems {
    public static void main(String[] args) {
        Genericc[] arr = {new Genericc("first"), new Genericc(2)};
        printArray(arr);
        getMovedArray(arr, 0, 1);
        printArray(arr);
    }

    public static Genericc[] getMovedArray(Genericc[] arr, int firstIndex, int secondIndex) {
        Genericc tmp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = tmp;
        return arr;
    }

    public static <T> void printArray(Genericc[] inputArray) {
        for (Genericc item : inputArray)
            System.out.printf("%s ", item.getObj());
        System.out.println();
    }

    public static class Genericc<T> {
        private T obj;

        public Genericc(T obj) {
            this.obj = obj;
        }

        public T getObj() {
            return obj;
        }

        public void setObj(T obj) {
            this.obj = obj;
        }
    }
}
