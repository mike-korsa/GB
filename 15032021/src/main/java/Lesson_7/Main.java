package Lesson_7;

import Lesson_7.Anon.MyAnon;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {
    public static void main(String[] args) throws Exception {

         var point = new Point(1,2);


//        Class c = Cat.class;
//        Field[] fields = c.getDeclaredFields();
//
//////
//        for (Field f : fields) {
//            System.out.println(f);
//        }

//        Cat cat = new Cat("Barsik", "age", 5);
//        cat.info1();
////
//////        Class c = Cat.class;
//////        cat.info();
//        Class c = Cat.class;
//        Field f = c.getDeclaredField("age");
//        f.setAccessible(true);
//        f.set(cat, 10);
////
//        cat.info1();

//        Class c = Cat.class;
//        Cat cat = new Cat("Barsik", "age", 5);
//        Method m = c.getDeclaredMethod("info2");
//        m.setAccessible(true);
//        m.invoke(cat);
        //Method m2 =



//        Class ch = URLClassLoader.newInstance(new URL[] {new File("C:/123").toURL()}).loadClass("Human");
//        Constructor constructor = ch.getConstructor(String.class);
//        Object human = constructor.newInstance("Bob");
//        Method m = ch.getDeclaredMethod("info");
//        m.invoke(human);



//        Class c = Cat.class;
//        Cat cat = new Cat("C", "A", 2);
//        Method[] methods = c.getDeclaredMethods();
//        for (Method o : methods) {
//            if (o.isAnnotationPresent(MyAnon.class)) {
//                System.out.println(o.getAnnotation(MyAnon.class).priority());
//                o.invoke(cat);
//            }
//        }

    }
}
