package com.company.java2.lesson3;

public class Main {
    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        ab.addPerson(new Person("Иванов","789456"));
        ab.addPerson(new Person("Иванов","76868768"));
        ab.addPerson(new Person("Сидоров","23487623"));
        printPhonesByLastName("Иванов", ab);
        printPhonesByLastName("Сидоров", ab);
    }

    static void printPhonesByLastName(String lastName, AddressBook ab) {
        for (Person p : ab.getListPersonsByLastName(lastName)) {
            System.out.println("Фамилия: " + p.getLastName() + ", номер: " + p.getPhoneNumber());
        }
    }
}
