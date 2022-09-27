package Lesson_1;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

//        int age = 20;
//
//
//
//        if (age >= 18) {
//            System.out.println("18 лет и более");
//        } else {
//            System.out.println("меньше 18 лет");
//        }
        ages(17);
    }

    public static void ages(int age) {


        System.out.println(age >= 18 ? age % 2 == 0 ?
        "18 лет и более, четное количество лет" :
        "18 лет и более, нечетное количество лет" : "меньше 18 лет");

//        String res = age >= 18 ? age % 2 == 0 ? "18 лет и более, четное количество лет"
//                : "18 лет и более, нечетное количество лет" : "меньше 18 лет";

//        if (age >= 18) {
//            System.out.println("18 лет и более");
//            if (age % 2 == 0) {
//                System.out.println("четное количество лет");
//            } else {
//                System.out.println("нечетное количество лет");
//            }
//        } else {
//            System.out.println("меньше 18 лет");
//        }


//        String res = age >= 18 ? "8 лет и более" : "меньше 18 лет";

    }

}



class Tetst1 {
    public static void main(String[] args) {
        int i = 8;
        System.out.println(i++);
        System.out.println(i + 1);
        System.out.println(i);
    }
}
















//
//class Task1 {
//    public static void main(String[] args) {
//        System.out.println(new Task1());
//    }
//}
//



class A {
    {
        System.out.println("dym a");
    }

    static {
        System.out.println("stat a");
    }

    A(){
        System.out.println("A");
    }

    public static void main(String[] args) {
        new A();
    }
}







class TestEquals {
    public static void main(String[] args) {
        String s1 = new String("Bicycle");
        String s2 = new String("bicycle");
        System.out.println(s1.equals(s2) == s2.equals(s1));
    }
}









//
//class TestInc {
//    public static void main(String[] args) {
//        int x = 0;
//        System.out.print(x++==++x);
//    }
//}


// 1 --------------------------
//class Mountain {
//    static String name = "Himalaya";
//    static Mountain getMountain() {
//        System.out.println("Getting Name ");
//        return null;
//    }
//    public static void main(String[ ] args) {
//        System.out.println( getMountain().name );
//    }
//}
// -----------------------------------


// 2 ---------------------
class Test2 {
    static void method(int... a) {
        System.out.println("inside int...");
    }

    static void method(long a, long b) {
        System.out.println("inside long");
    }

    static void method(Integer a, Integer b) {
        System.out.println("inside INTEGER");
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        method(a, b);
    }
}
// ------------------------------







// 3
//class Switch {
//    public static void main(String[] args) {
//        int i = 3;
//        switch(i) {
//            default:
//                System.out.println("default");
//            case 1:
//                System.out.println("1");
//            case 2:
//                System.out.println("2");
//        }
//    }
//}


//4
//Перечислите все валидные сигнатуры конструкторов класса Clazz:
//
//        Clazz(String name)
//        Clazz Clazz(String name)
//        int Clazz(String name)
//        void Clazz(String name)
//        Clazz(name)
//        Clazz()


// 5 вывести алфавит


//class TestStr {
//    public static void main(String[] args) {
//        String s = new String("ssssss");
//        StringBuffer sb = new StringBuffer("bbbbbb");
//        s.concat("-aaa");
//        sb.append("-aaa");
//        System.out.println(s);
//        System.out.println(sb);
//    }
//}


class Test5 {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
    }
}


class TestStreamApi {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }).start();
//
//
//
//        Runnable r = () -> {};


//        Runnable r1 = () -> {
//            System.out.println(1);
//        };
//
//        Runnable r2 = () -> {
//            System.out.println(2);
//        };
//
//        new Thread(r1).start();
//        new Thread(r2).start();


//        List<Person> persons = new ArrayList<>(Arrays.asList(
//                new Person("Bob1", "engineer", 15),
//                new Person("Bob11", "engineer", 25),
//                new Person("Bob2", "manager", 17),
//                new Person("Bob3", "manager", 19),
//                new Person("Bob4", "SEO", 22)
//        ));


//
//
//        достанем только инжинеров
//        и отсортируем по возрасту
//        и после этого мы хотим взять только их имена
//
//        List<Person> engineers = new ArrayList<>();
//        for (Person p : persons) {
//            if (p.getPosition().equals("engineer")) {
//                engineers.add(p);
//            }
//        }
//
//
////
//        Collections.sort(engineers, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
////
//        List<String> engineersNames = new ArrayList<>();
//
//        for (Person p : engineers) {
//            engineersNames.add(p.getName());
//        }
//
//        System.out.println(Arrays.asList(engineersNames));


//        List<String> egNames = persons.stream()
//                .filter(p -> p.getPosition().equals("engineer"))
//                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
//                .map(p -> p.getName())
//                .collect(Collectors.toList());
//
//        System.out.println(egNames);



        //        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        list.stream().map(new Function<Integer, Integer>() {
//@Override
//public Integer apply(Integer integer) {
//        return null;
//        }
//        });
//
//        где Function<Integer, Integer> 1 Integer это входной тип 2 Integer это то во что мы хотим преобразовать
//
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        list.stream().map(new Function<Integer, Integer>() {
//@Override
//public Integer apply(Integer integer) {
//        return integer * 2;
//        }
//        }).forEach(System.out::println);
//
//        каждое число умножим на 2 и распечатаем
//
//        теперь вариант покороче
//

//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        list.stream().map( n -> n * 5).forEach(System.out::println);

//
//
//        так же бывает полезна функция count, которая возвращает число объектов в потоке например
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        list.stream().filter( n -> n < 5).count();
//
//
//        так же бывает полезна функция limit (которая оставляет n первых элементов)
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        list.stream().filter( n -> n < 5).limit(2).forEach( t -> System.out.println(t));
//
//        так же можно сделать проверку который бы вернул boolean (например что все числа больше 0)
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        System.out.println( list.stream().allMatch( n -> n > 0));


    }
}


class Person {
    private String name;
    private String position;
    private int age;

    public Person(String name, String position, int age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


//    На примере потока попытаемся разобраться со Stream Api
//
//public class StreamApi {
//    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }).start();
//    }
//}
//
//    если Thread итак ожидает интерфейс Runnable то выкидываем, так же убираем фигурные
//        скобки так как там будет тело класса
//
//        new Thread(new Runnable()
//@Override
//public void run() {
//
//        }
//        ).start();
//
//        далее мы знаем что метод будет run так как там он один поэтому сокращаем и получаем
//
//        new Thread(
//        () -> {
//
//        }
//        ).start();
//
//
//        получаем что лямбда это скоращенная запись аннонимного класса, соотвествнно
//        если мы это знаем, мы можем сразу записать
//
//        Runnable r = () -> {};
//
//        например
//
//        Runnable r1 = () -> {
//        System.out.println(1);
//        };
//
//        Runnable r2 = () -> {
//        System.out.println(2);
//        };
//
//        new Thread(r1).start();
//        new Thread(r2).start();
//
//        создадим класс
//
//private static class Person {
//    private String name;
//    private String position;
//    private int age;
//
//    public Person(String name, String position, int age) {
//        this.name = name;
//        this.position = position;
//        this.age = age;
//    }
//}
//
//
//    и иницилизируем список
//
//public static void main(String[] args) throws Exception {
//
//
//        List<Person> persons = new ArrayList<>(Arrays.asList(
//        new Person("Bob1", "enginner", 15),
//        new Person("Bob2", "maneger", 17),
//        new Person("Bob3", "maneger", 19),
//        new Person("Bob4", "CEO", 22)
//        ));
//
//
//        достанем только инжинеров
//        и отсортируем по возрасту
//        и после этого мы хотим взять только их имена
//
//        List<Person> engineers = new ArrayList<>();
//        for (Person p : persons) {
//        if (p.position.equals("enginner")) {
//        engineers.add(p);
//        }
//        }
//
//        Collections.sort(engineers, new Comparator<Person>() {
//@Override
//public int compare(Person o1, Person o2) {
//        return o1.age - o2.age;
//        }
//        });
//
//        List<String> engineersNames = new ArrayList<>();
//
//        for (Person p : engineers) {
//        engineersNames.add(p.name);
//        }
//        System.out.println(engineersNames);
//
//        Теперь попробуем это решить в одну строку
//
//        List<String> egNames = persons.stream()
//        .filter(p -> p.position.equals("enginner"))
//        .sorted((o1, o2) -> o1.age - o2.age)
//        .map(p -> p.name)
//        .collect(Collectors.toList());
//
//        System.out.println(egNames);
//
//
//
//
//        Разберем подробнее операцию map
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        list.stream().map(new Function<Integer, Integer>() {
//@Override
//public Integer apply(Integer integer) {
//        return null;
//        }
//        });
//
//        где Function<Integer, Integer> 1 Integer это входной тип 2 Integer это то во что мы хотим преобразовать
//
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        list.stream().map(new Function<Integer, Integer>() {
//@Override
//public Integer apply(Integer integer) {
//        return integer * 2;
//        }
//        }).forEach(System.out::println);
//
//        каждое число умножим на 2 и распечатаем
//
//        теперь вариант покороче
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        list.stream().map( n -> n * 5).forEach(System.out::println);
//
//
//        так же бывает полезна функция count, которая возвращает число объектов в потоке например
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        list.stream().filter( n -> n < 5).count();
//
//
//        так же бывает полезна функция limit (которая оставляет n первых элементов)
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        list.stream().filter( n -> n < 5).limit(2).forEach( t -> System.out.println(t));
//
//        так же можно сделать проверку который бы вернул boolean (например что все числа больше 0)
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        System.out.println( list.stream().allMatch( n -> n > 0));
//
//        anyMatch (хотя бы один элемент)
//        nonMatch (ни один элемент)
//
//        далее поговорим немного про Optional
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        Integer res = list.stream().filter( n -> n < 2).findFirst();
//
//        но у нас может быть такая ситцация что в потоке нет нужных объеков и нам вернуться null
//        для этого мы помещает значение в спец контейнер и делаем проверку
