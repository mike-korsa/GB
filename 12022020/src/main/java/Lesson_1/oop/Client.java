package Lesson_1.oop;


public class Client {
    public static void main(String[] args) {
        Assistant assistant = new Assistant();
        Camera camera = assistant.getCamera();
        camera.doPhotograph();
    }
}
