package Lesson_1.oop;

public class Assistant {

    public Camera getCamera() {
        Camera camera = new Camera();
        ICameraRoll cameraRoll = new BlackAndWhiteCameraRoll();
        camera.setRoll(cameraRoll);
        return camera;
    }
}
