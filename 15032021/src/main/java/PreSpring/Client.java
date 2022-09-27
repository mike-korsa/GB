package PreSpring;

import Lesson_8.BlackAndWhiteCameraRoll;

public class Client {
    public static void main(String[] args) {
        Camera camera = new Camera();
        CameraRoll cameraRoll = new CameraRoll();
        camera.doPhotograph();
    }
}
