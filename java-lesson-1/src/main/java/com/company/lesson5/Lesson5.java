package com.company.lesson5;

public class Lesson5 {

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Вся Петров", "Инженер", "mail@mail.com", "890255556665",
                50000, 45);
        employeeArray[1] = new Employee("Петя Васечкин", "Грузчик", "mail-2@mail.com", "890255555588",
                30000, 25);
        employeeArray[2] = new Employee("Иван Сидоров", "Главный грузчик", "mail-4@mail.com", "890255556665",
                28000, 38);
        employeeArray[3] = new Employee("Изя Петров", "Продавец", "mail-5@mail.com", "890255557722",
                60000, 50);
        employeeArray[4] = new Employee("Форест Гамп", "Водитель", "mail-6@mail.com", "890255557628",
                100000, 60);

        for (Employee emp : employeeArray) {
            if (emp != null && emp.getAge() > 40) {
                emp.printInfo();
            }
        }
    }
}
