package com.company.java3.lesson2.server.authorization;

public interface AuthService {
    void start();
    String getNickNameByLoginAndPassword(String login, String password);
    void end();
}
