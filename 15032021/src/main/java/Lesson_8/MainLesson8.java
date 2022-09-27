package Lesson_8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainLesson8 {
    public static void main(String[] args) {



//        var camera = new Camera();
//        var roll = new BlackAndWhiteCameraRoll();
//        camera.setCameraRoll(roll);
//        camera.doPhotograph();


//        ICameraRoll roll = new BlackAndWhiteCameraRoll();
//        ICameraRoll roll1 = new ColorCameraRoll();
//        Camera camera = new Camera();
//        camera.setCameraRoll(roll);
//        camera.doPhotograph();




















        var assistant = new Assistant();
        var camera = assistant.getCamera();
        camera.doPhotograph();

//         new Thread( () -> {
//
//             }
//         ).start();

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
//                new Person("Bob1", "enginner", 15),
//                new Person("Bob2", "manager", 25),
//                new Person("Bob3", "CEO", 35)
//        ));
//
//        List<Person> engineers = new ArrayList<>();
//        for (Person p : engineers) {
//            if (p.getPosition().equalsIgnoreCase("enginner")) {
//                engineers.add(p);
//            }
//        }
//
//        Collections.sort(engineers, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
//
//        List<String> egNames = persons.stream().filter( p -> p.getPosition().equals("enginner"))
//                .sorted( ((o1, o2) -> o1.getAge() - o2.getAge()))
//                .map( p -> p.getName())
//                .collect(Collectors.toList());


//        Stream<Phone> phoneStream = Stream.of(
//                new Phone("iPhone X", "Apple", 700),
//                new Phone("S20", "Samsung", 500),
//                new Phone("S10", "Samsung", 300)
//        );
//
//        Map<String, List<Phone>> phonesByCompany = phoneStream.collect(Collectors.groupingBy(Phone::getCompany));
//
//        for (Map.Entry<String, List<Phone>> item : phonesByCompany.entrySet()) {
//            System.out.println(item.getKey());
//
//            for (Phone phone : item.getValue()) {
//                System.out.println(phone.getName());
//            }
//
//            System.out.println();
//        }



//        Stream<Phone> phoneStream = Stream.of(
//                new Phone("iPhone X", "Apple", 700),
//                new Phone("S20", "Samsung", 500),
//                new Phone("S10", "Samsung", 300)
//        );
//
//        Map<String, Long> phonesByCompany = phoneStream.collect(Collectors.groupingBy(Phone::getCompany, Collectors.counting()));
//
//        for (Map.Entry<String, Long> item : phonesByCompany.entrySet()) {
//            System.out.println(item.getKey() + " " + item.getValue());
//
//
//        }


    }
}


class Phone {
    private String name;
    private String company;
    private int price;

    public Phone(String name, String company, int price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

