package Lesson_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(1);
//        Box box2 = new Box("str");
//////
//        box1.info();
//        box2.info();
////////
//        int x = 10;
////////
//        x = x  + (Integer) box1.getObj();
//        System.out.println("x = " + x);
//////
//        x = x  + (Integer) box2.getObj();
//        System.out.println("x = " + x);
////
//        BoxInt box3 = new BoxInt(1);

//        BoxUltimate<String> box1 = new BoxUltimate<String>("Hello");
//        BoxUltimate<Integer> box2 = new BoxUltimate<Integer>(140);
////
//        box1.info();
//        box2.info();
////////
////        int x = 10;
////        x = x  + box1.getObj();
////        System.out.println("x = " + x);
//
//        int x = 10;
//        x = x  + box2.getObj();
//        System.out.println("x = " + x);

//        List<String> al = new ArrayList<String>();
//////
//        HashMap<String, Integer> hm = new HashMap<>();

//        TwoGen<Integer, String> twoGen = new TwoGen<Integer, String>(555, "Str1");
//
//        twoGen.showTypes();




//        Stats<Double> iob1 = new Stats<Double>(mass);

//        Zoo<Cat> catZoo = new Zoo<>();

//
//        Double res = iob1.avg();
//
//        System.out.println(res);
//

        Integer[] inums = {1, 2, 3, 4, 5};
        Double[] mass = {1.0, 2.0, 3.0, 4.0, 5.0};

        Stats<Integer> intArray = new Stats<Integer>(inums);
        Stats<Double> doubleArray = new Stats<Double>(mass);

        intArray.sameAvg(doubleArray);
//
//        Double res_second = iob.avg();
//        System.out.println(res_second);
//
//        if (iob.sameAvg(iob1)) {
//            System.out.println("Средние значения равны!");
//        } else {
//            System.out.println("Средние значения не равны!");
//        }

//
//        double intRes = iob.avg();
//        System.out.println(intRes);
//
//
////
//        Double[] dnums = {1.0, 2.0, 3.0, 4.0, 5.0};
//        Stats<Double> dob = new Stats<Double>(dnums);
//        double dobRes = dob.avg();
//        System.out.println(dobRes);
////
////
//
//        if (iob.sameAvg(dob)) {
//            System.out.println("Средние значения равны!");
//        } else  {
//            System.out.println("Средние значения не равны!");
//        }

//        String[] strs = {"1", "2", "3"};
//        Stats<String> sob = new Stats<String>(strs);


    }
}
