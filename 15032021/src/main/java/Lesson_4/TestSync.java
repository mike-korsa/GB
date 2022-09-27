package Lesson_4;


public class TestSync {


    //  private static Integer n = new Integer(300);

//    private static StringBuilder sb = new StringBuilder("a");

    static Object lock1 = new Object();
    static Object lock2 = new Object();

    static class DeadThreadOne extends Thread {
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println(" DeadThreadOne держит lock1");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("DeadThreadOne ждет lock2");
                synchronized (lock2) {
                    System.out.println("DeadThreadOne держит lock1 и lock2");
                }
            }
        }
    }

    static class DeadThreadTwo extends Thread {
        @Override
        public void run() {
            synchronized (lock2) {
                System.out.println(" DeadThreadTwo держит lock2");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("DeadThreadTwo ждет lock1");
                synchronized (lock1) {
                    System.out.println("DeadThreadTwo держит lock1 и lock2");
                }
            }
        }
    }

    public static void main(String[] args) {

        DeadThreadOne deadThreadOne = new DeadThreadOne();
        deadThreadOne.start();

        DeadThreadTwo deadThreadTwo = new DeadThreadTwo();
        deadThreadTwo.start();

//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (sb) {
//                    System.out.println("X");
//                   // n++;
//                    sb.append("a");
//                    try {
//                        Thread.sleep(3000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (sb) {
//                    System.out.println("Y");
//                    sb.append("a");
//                    try {
//                        Thread.sleep(3000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (sb) {
//                    System.out.println("Z");
//                    sb.append("a");
//                    try {
//                        Thread.sleep(3000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }).start();
    }
}