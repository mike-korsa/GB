package com.company.lesson5;

public class Employee {
    private String fio;
    private String post; //должность
    private String email;
    private String phone;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Employee(String fio, String post, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(String.format("ФИО: %s, должность: %s, email: %s, телефон: %s, зарплата: %d, возраст: %d.",
                this.fio, this.post, this.email, this.phone, this.salary, this.age));
    }

}
