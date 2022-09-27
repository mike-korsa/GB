package Lesson_4;


public class TestInt {
//        private static Integer n = new Integer(300);
    private static StringBuilder stringBuilder = new StringBuilder("hello");
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (stringBuilder) {
                    System.out.println("x");
//                    n++;
//                    System.out.println(n);
                    stringBuilder.append("a");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (stringBuilder) {
                    System.out.println("y");
//                    n++;
//                    System.out.println(n);
                    stringBuilder.append("b");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (stringBuilder) {
                    System.out.println("z");
//                    n++;
//                    System.out.println(n);
                    stringBuilder.append("c");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

//        DeadThreadOne deadThreadOne = new DeadThreadOne();
//        deadThreadOne.start();
//
//        DeadThreadTwo deadThreadTwo = new DeadThreadTwo();
//        deadThreadTwo.start();


    }
}