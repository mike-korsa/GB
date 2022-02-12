package com.company.java2.lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Сервер запущен");
            //Ожидаем клиента
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            while (true) {
                String message = in.readUTF();
                if(message.equals("/end")) {
                    break;
                }
                System.out.println(message);
                out.writeUTF("На сервере получено сообщение: " + message);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
