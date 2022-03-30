package com.company.java3.lesson3;

import java.io.*;
import java.nio.file.*;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File f = new File("demo.txt");
        if (f.exists()) f.delete();
        try (BufferedWriter writer = new BufferedWriter(new
                FileWriter("demo.txt",true))) {
            for (int i = 0; i < 5; i++) {
                writer.write("Java" + i + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] arr = new String[100];
        try {
            List<String> l = Files.readAllLines(Paths.get("demo.txt"));
            Collections.reverse(l);
            int a= 0;
            //List<String> l = Files.readAllLines(Paths.get("file.txt")).get(32);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new
                FileReader("demo.txt"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
