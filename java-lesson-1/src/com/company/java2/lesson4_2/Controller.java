package com.company.java2.lesson4_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import com.company.java2.lesson4_2.animals.Cat;
import com.company.java2.lesson4_2.read.AnimalFileReader;
import com.company.java2.lesson4_2.write.AnimalFileWriter;

public class Controller {
    @FXML
    private Label mainTextArea;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField colorTextField;
    @FXML
    private TextField ageTextField;
    @FXML
    private TextField jumpHeightTextField;

    private AnimalFileReader animalFileReader;
    private AnimalFileWriter animalFileWriter;

    public Controller() {
        this.animalFileReader = new AnimalFileReader();
        this.animalFileWriter = new AnimalFileWriter();
    }

    public void loadAnimals(ActionEvent event) {
        String text = animalFileReader.readFile();
        mainTextArea.setText(text);
    }

    public void saveAnimal(ActionEvent event) {
        Cat cat = new Cat();
        cat.setName(nameTextField.getText());
        cat.setColor(colorTextField.getText());
        cat.setAge(Integer.valueOf(ageTextField.getText()));
        cat.setJumpHeight(jumpHeightTextField.getText());

        animalFileWriter.write(cat);
    }
}
