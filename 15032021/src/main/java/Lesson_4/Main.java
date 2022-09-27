package Lesson_4;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
//        MyThread thread = new MyThread();
//        thread.start();

//        Thread t1 = new Thread(new MyThreadImp());
//        t1.run();


//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(1);
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(2);
//            }
//        });
//
//        t1.start();
//        t2.start();

//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        while (true) {
//            if (!t1.isAlive()) {
//                break;
//            }
//        }
//
//        while (true) {
//            if (!t2.isAlive()) {
//                break;
//            }
//        }



//        System.out.println("END!");
//







//        while (true) {
//            if (!t1.isAlive()) {
//                break;
//            }
//        }
//        while (true) {
//            if (!t2.isAlive()) {
//                break;
//            }
//        }
//
////        try {
////            t1.join();
////            t2.join();
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//
//        System.out.println("END");

//        Test t1 = new Test();
//        Test t2 = new Test();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                t1.m1();
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                t2.m1();
//            }
//        }).start();

//        AtomicInteger ai = new AtomicInteger(10);
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                if (ai.incrementAndGet() == 11) {
//                    System.out.println("First! t1");
//                }
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                if (ai.incrementAndGet() == 11) {
//                    System.out.println("First! t2");
//                }
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(ai);
    }
}

class Test {
    public synchronized void m1() {
        System.out.println("M1");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("M2");
    }
}


class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

class MyThreadImp implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}