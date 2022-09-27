package Lesson_8;

public class Assistant {
    public Camera getCamera() {
        Camera camera = new Camera();
        ICameraRoll cameraRoll = new BlackAndWhiteCameraRoll();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }
}
