package com.company.java3.lesson2.server.authorization;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class InMemoryAuthServiceImpl implements AuthService {
    private final Map<String, UserData> users;
    private static Connection connection;
    private static Statement statement;

    public InMemoryAuthServiceImpl() {
        users = new HashMap<>();
        try {
            fillUsersFromDB();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //users.put("login1", new UserData("login1", "password1", "first_user"));
        //users.put("login2", new UserData("login2", "password2", "second_user"));
        //users.put("login3", new UserData("login3", "password3", "third_user"));
    }

    @Override
    public void start() {
        System.out.println("Сервис аутентификации инициализирован");
    }

    @Override
    public synchronized String getNickNameByLoginAndPassword(String login, String password) {
        UserData user = users.get(login);
        // Ищем пользователя по логину и паролю, если нашли то возвращаем никнэйм
        if (user != null && user.getPassword().equals(password)) {
            return user.getNickName();
        }

        return null;
    }

    @Override
    public void end() {
        System.out.println("Сервис аутентификации отключен");
    }

    private static void connect() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gb", "postgres", "postgres");
        statement = connection.createStatement();
    }

    private void fillUsersFromDB() {
        try (ResultSet rs = statement.executeQuery("select * from users;")) {
            while (rs.next()) {
                users.put(rs.getString("login"), new UserData(rs.getString("login"), rs.getString("password"),
                        rs.getString("nikname")));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
