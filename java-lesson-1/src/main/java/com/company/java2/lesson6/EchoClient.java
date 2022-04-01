package com.company.java2.lesson6;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    private final static String SERVER_ADDRESS = "localhost";
    private final static int SERVER_PORT = 8080;

    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public EchoClient(/*JTextArea chatTextArea*/) {
        try {
            openConnection(/*chatTextArea*/);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void openConnection(/*JTextArea chatArea*/) throws IOException {
        socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        String messageFromServer = in.readUTF();
                        if(messageFromServer.equals("/end")) {
                            break;
                        }
                        //chatArea.append(messageFromServer + "\n");
                        System.out.println("Сервер ответил: " + messageFromServer);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void closeConnection() {
        try {
            out.writeUTF("/end");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void sendMessage(String text) {
        try {
            out.writeUTF(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String text = "посылаем на сервер";
        final EchoClient client = new EchoClient(/*chatTextArea*/);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите сообщение:");
            text = sc.nextLine();
            if(!text.isEmpty()) {
                client.sendMessage(text);
                //messageTextField.setText("");
            }
        }


    }
}
