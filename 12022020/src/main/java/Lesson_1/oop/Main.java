package Lesson_1.oop;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static class Person {
        private String name;
        private String position;
        private int age;

        public Person(String name, String position, int age) {
            this.name = name;
            this.position = position;
            this.age = age;
        }
    }

    public static void main(String[] args) throws Exception {


        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Bob1", "enginner", 25),
                new Person("Bob11", "enginner", 35),
                new Person("Bob12", "enginner", 33),
                new Person("Bob2", "manager", 27),
                new Person("Bob3", "manager", 29),
                new Person("Bob4", "CEO", 22)
        ));

        List<Person> engineers = new ArrayList<>();
        for (Person p : persons) {
            if (p.position.equals("enginner")) {
                engineers.add(p);
            }
        }

        Collections.sort(engineers, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

        List<String> engineersNames = new ArrayList<>();

        for (Person p : engineers) {
            engineersNames.add(p.name);
        }
        System.out.println(engineersNames);

//
        List<String> egNames = persons.stream()
                .filter(p -> p.position.equals("enginner"))
                .sorted((o1, o2) -> o1.age - o2.age)
                .map(p -> p.name)
                .collect(Collectors.toList());

        System.out.println(egNames);
    }
}
