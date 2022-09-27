package Lesson_1.oop;

public class Camera {

    private ICameraRoll roll;

    public void setRoll(ICameraRoll roll) {
        this.roll = roll;
    }

    public void doPhotograph() {
        System.out.println("Щелк!");
        roll.processing();
    }
}
