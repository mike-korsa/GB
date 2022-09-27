package Lesson_1;

public class Zoo <T extends Animals> {
    T animal;

    public Zoo(T animal) {
        this.animal = animal;
    }
}
