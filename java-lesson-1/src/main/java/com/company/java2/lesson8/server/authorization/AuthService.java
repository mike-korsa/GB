package com.company.java2.lesson8.server.authorization;

public interface AuthService {
    void start();
    String getNickNameByLoginAndPassword(String login, String password);
    void end();
}
