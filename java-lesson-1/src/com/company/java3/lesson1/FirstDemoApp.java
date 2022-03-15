package com.company.java3.lesson1;

public class FirstDemoApp {
    public static void main(String[] args) {
        SimpleBox intBox1 = new SimpleBox(20);
        SimpleBox intBox2 = new SimpleBox(30);

        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {
            int sum = (Integer)intBox1.getObj() + (Integer)intBox2.getObj();
            System.out.println("sum = " + sum);
        } else {
            System.out.println("Содержимое коробок отличается по типу");
        }

        intBox1.setObj("123");
        int sum = (Integer)intBox1.getObj() + (Integer)intBox2.getObj();
    }

    public static class SimpleBox {
        private Object obj;

        public Object getObj() {
            return obj;
        }

        public void setObj(Object obj) {
            this.obj = obj;
        }

        public SimpleBox(Object obj) {
            this.obj = obj;
        }
    }
}