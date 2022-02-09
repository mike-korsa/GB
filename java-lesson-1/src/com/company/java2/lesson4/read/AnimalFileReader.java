package com.company.java2.lesson4.read;

import com.company.java2.lesson4.animals.Animal;
import com.company.java2.lesson4.animals.AnimalFactory;
import com.company.java2.lesson4.constants.Constants;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AnimalFileReader {
    public String readFile() {
        try(BufferedReader reader = new BufferedReader(new FileReader(Constants.FILE_NAME))) {
            String s;
            StringBuilder result = new StringBuilder();
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
                Animal animal = AnimalFactory.createAnimal(s.split(","));
                result.append(animal).append("\n");
            }

            return result.toString();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return "";
    }
}
