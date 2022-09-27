package PreSpring;

import Lesson_8.BlackAndWhiteCameraRoll;

public class Camera {
    private CameraRoll cameraRoll;

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph(){
        System.out.println("Щелк!");
        cameraRoll.doPhotograph();
    }
}
