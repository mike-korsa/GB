package com.company.java2.lesson3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"Машина","Поезд","Самолет","Лодка","Ракета","Машина", "Колесо","Поезд","Лодка","Лодка"};
        printArrayDistinct(arr);
        AddressBook ab = new AddressBook();
        ab.addPerson(new Person("Иванов","789456"));
        ab.addPerson(new Person("Иванов","76868768"));
        ab.addPerson(new Person("Сидоров","23487623"));
        printPhonesByLastName("Иванов", ab);
        printPhonesByLastName("Сидоров", ab);
    }

    static void printArrayDistinct(String[] arr) {
        HashMap<String ,Integer> hm = new HashMap<>();
        for (String s : arr) {
            hm.put(s,  hm.get(s) == null ? 1 : hm.get(s) + 1);
        }
        for (String key : hm.keySet()) {
            System.out.println("Элемент - " + key + ", вхождений - " + hm.get(key));
        }
    }

    static void printPhonesByLastName(String lastName, AddressBook ab) {
        for (Person p : ab.getListPersonsByLastName(lastName)) {
            System.out.println("Фамилия: " + p.getLastName() + ", номер: " + p.getPhoneNumber());
        }
    }
}
