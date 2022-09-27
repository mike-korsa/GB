package Lesson_6;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
//
//public class Test {
//
//}
//

//
//
//class Test1 {
//    public static void main(String[] args) {
//        float f = 1.0f + 1.0f;
//        f = f + 1;
//        System.out.println( f / 0 );
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//class QTest {
//    {
//        System.out.print("1");
//    }
//
//    public static void main(String[] args) {
//        System.out.print("2");
//        new QTest();
//    }
//
//    static {
//        System.out.print("3");
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//class QTest{
//    public static void main(String[] args) {
//        int i1 = 012;
//        int i2 = 20;
//        System.out.println(i1 * i2);
//    }
//}
//
//

//
//
//
//
//
//
//
//
//
//
//
//
//
//class Main123 {
//    public static void main(String[] args) {
//        Integer i = new Integer("10");
//        if (i.toString().intern() == i.toString().intern()) {
//            System.out.println("Равный");
//        } else {
//            System.out.println("Неравный");
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//class Foo {
//    public static void main(String[] args) {
//        for (int k = 1; k <= 10; k++) {
//            if (k % 5 == 0) break label;
//            System.out.print(k + " ");
//        }
//
//        label:
//        {
//            System.out.print("stop!");
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//class Funcs extends java.lang.Math {
//    public int add(int x, int y) {
//        return x + y;
//    }
//    public int sub(int x, int y) {
//        return x - y;
//    }
//    public static void main(String[] a) {
//        Funcs f = new Funcs();
//        System.out.println("" + f.add(1, 2));
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//class App1 {
//    public static void main(String[] args) {
//        System.out.println(addToString("12345678910",','));
//    }
//
//    public static StringBuffer addToString(String s, char c) {
//        StringBuffer b = new StringBuffer(s);
//        int p = 0;
//        for (int i = 1; i < b.length(); i++) {
//            if (i%3 == 0) {
//                b.insert(b.length()-i-p, c);
//                p++;
//            }
//        }
//        return b;
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//class Main123 {
//    public static void main(String[] args) {
//        System.out.println(args.length);
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//class Main56 {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 100;
//        double c = (double) (a/b);
//        String str = String.format("%1.5f", c);
//        System.out.println(str);
//    }
//}


//    Что произойдет в результате попытки компиляции и выполнения программы?
//class TreeTest {
//    private static Set<String> set = new TreeSet<String>();
//    public static void main(String[] args) {
//        set.add("one");
//        set.add("two");
//        set.add("three");
//        set.add("1");
//        set.add("2");
//        set.add("3");
//        for (String string : set) {
//            System.out.print(string + " ");
//        }
//    }
//}


// Что будет напечатано в результате компиляции и выполнения данного кода?
//
//class TestClass {
//    public static void main(String[] args) {
//        Base sub = new Sub();
//        sub.test();
//    }
//}
//
//class Base {
//    public static void test() {
//        System.out.println("Base.test()");
//    }
//}
//
//class Sub extends Base {
//    public static void test() {
//        System.out.println("Sub.test()");
//    }
//}


//Что будет выведено в консоль?
//
//class A
//{
//    {
//        System.out.print("5");
//    }
//
//    static {
//        System.out.print("3");
//    }
//
//    public A() {
//        System.out.print("4");
//    }
//}
//
//class B extends A {
//    {
//        System.out.print("2");
//    }
//
//    static {
//        System.out.print("6");
//    }
//
//    public B() {
//        System.out.print("1");
//    }
//
//    public static void main(String[] args) {
//        new B();
//    }
//}


//
//class Test1 {
//    public static void main(String[] args){
//        int x = 1;
//        Integer y = new Integer(x);
//        int [] z = {x};
//
//        func(x, y, z);
//
//        System.out.print(x);
//        System.out.print(y);
//        System.out.println(z[0]);
//    }
//
//    static void func (int x, Integer y, int[] z) {
//        x++;
//        y++;
//        z[0]++;
//    }
//}


//class Test2 {
//    static void method(int... a) {
//        System.out.println("inside int...");
//    }
//    static void method(long a, long b) {
//        System.out.println("inside long");
//    }
//    static void method(Integer a, Integer b) {
//        System.out.println("inside INTEGER");
//    }
//    public static void main(String[] args) {
//        int a = 2;
//        int b = 3;
//        method(a,b);
//    }
//}


//class TestDel {
////    public static void main(String[] args) {
////        System.out.println(11 / 0);
////    }
////
//    public static void main(String[] args) {
//        double d1 = 11. / 0;
//        double d2 = 15. / 0;
//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(d1 - d2);
//    }
//}


//    9


//    10


class Test3 {
    public static void main(String[] args) {
//        double d1 = 11. / 0;
//        double d2 = 15. / 0;
//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(d1 - d2);

//        System.out.println(2 + 2  + "=" + 2 + 2);

//        int a = 10;
//        testIncInt(a);
//        System.out.println(a);
//        int[] mass = {1,2,3};
//        testMass(mass);
//        System.out.println(Arrays.toString(mass));

        String str = "Hello";
        tesString(str);
        System.out.println(str);

    }

    static void testIncInt(int a) {
        a++;
    }

    static void testMass(int[] mass) {
        mass[0] = 10;
    }

    static void tesString(String str) {
        str += " world!";
    }



}