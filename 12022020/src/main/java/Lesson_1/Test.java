package Lesson_1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {
}



///////////////// 1

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





///////////////// 2




// Что произойдет при попытке скомпилировать и запустить данный код?
// Считается, что файл outstream уже создан.
//
//class Main {
//    public static void main(String[] args) {
//        try {
//            FileInputStream fis = new FileInputStream("outstream");
//            InputStreamReader isr = new InputStreamReader(fis);
//            BufferedReader br = new BufferedReader(isr);
//            try {
//                do {
//                    String str = br.readLine();
//                    System.out.println(str);
//                } while (str != null);
//            }
//            finally {
//                fis.close();
//                isr.close();
//                br.close();
//            }
//        } catch(IOException e){
//            e.printStackTrace();
//        }
//    }
//}





///////////////// 3
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









///////////////// 4
//Что будет выведено в консоль?

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










///////////////// 5
// Что напечатает следующий код?
//class TestWrap {
//    public static void main(String[] args) {
//        Integer ii = 1000;
//        Integer jj = 2000;
//
//        System.out.print((ii * 2 == jj) ? "yes " : "no ");
//        System.out.print((jj / 2 == ii) ? "yes " : "no ");
//        System.out.print((ii * 2 == jj) ^ (jj / 2 == ii) ? "yes " : "no ");
//    }
//}













///////////////// 6
// Что будет выведено на экран после выполнения следующего кода?
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









// 7
//interface I {
//    public final static int EASY = 5;
//}
//
//class Main2 implements I {
//    public static void main(String[] args) {
//        int a = 5;
//        test(++a);
//    }
//
//    static void test(int a) {
//        a += EASY + a++;
//        System.out.println(a);
//    }
//}












// 8  Какие интерфейсы хранят ключ-значение

// 1 Set
// 2 SortedMap
// 3 List
// 4 SortedSet
// 5 Map


















// 9
//
//    Как можно уничтожить объект в Java?
//
//        1. присвоить null всем ссылкам на объект
//        2. вызвать Runtime.getRuntime().gc()
//        3. вызвать метод finalize() у объекта
//        4. этого нельзя сделать вручную
//        5. вызвать деструктор у объекта















// 10 Что будет напечатано после попытки компиляции и выполнения кода:
//
class Test6 {
    public static void main(String[] args) {
        int[] mass = {1, 2};
        List<String> list = new ArrayList(10);
        list.add("03");
        list.add("04");
        System.out.println("." + mass.length + list.size() );
    }
}













// 11) Можно ли описать конструкторы в абстрактном классе?
//abstract class A {
//    int p1;
//    A() {
//        p1 = 1;
//    }
//
//}
//class B extends A {
//}




















// 12
//class TestClazz {
//    public static void main(String[] args) {
//        final long Byte = 0;            // 1
//        if ( Byte.equals(0) ) {        // 2
//            System.out.print("==");
//        } else {
//            System.out.print("!=");
//        }
//    }
//}

// 1       Возникнет ошибка компиляции в строке 1
// 2       Возникнет ошибка компиляции в строке 2
// 3       Код напечатает "=="
// 4       Код напечатает "!="
// 5       Код успешно скомпилируется