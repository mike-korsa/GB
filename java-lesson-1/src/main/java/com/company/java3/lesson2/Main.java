package com.company.java3.lesson2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) throws SQLException {
        // Найти запись 100 рублей/100 рублей
        // Взять запись 100 рублей/100 рублей
        // Изменить запись 50 рублей/250 рублей
        // Сохранить запись 1) шаг стало 50 рублей 2) шаг стало 250 рублей
        try {
            connect();
            //insert("Антон", 90);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }



    private static void connect() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gb", "postgres", "postgres");
        statement = connection.createStatement();
    }

    private static void insert(String name, int score) throws SQLException {
        statement.executeUpdate(String.format("INSERT INTO students(name, score) values('%s', %s);", name, score));
    }

    private static void disconnect() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
