package com.company.java2.lesson4.write;

import com.company.java2.lesson4.animals.Animal;
import com.company.java2.lesson4.constants.Constants;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AnimalFileWriter {
    public void write(Animal animal) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Constants.FILE_NAME, true))) {
            bufferedWriter.write(animal.preparingToFile() + "\n");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
