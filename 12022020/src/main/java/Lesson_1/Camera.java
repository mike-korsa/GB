package Lesson_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Random;

@Component("camera")
@Scope("prototype")
public class Camera implements ICamera {

    Integer res = 0;
    //  //  Random random = new Random(System.currentTimeMillis());
    Random random = new Random();

    public Camera() {
        res = random.nextInt();
    }

//    @Autowired
//    @Qualifier("BlackAndWhiteCameraRoll")
//    private ICameraRoll cameraRollnoColor;
//
//    @Autowired
//    @Qualifier("ColorCameraRoll")
//    private ICameraRoll cameraRollColor;

////
//    @Autowired
////    @Qualifier("BlackAndWhiteCameraRoll")
//    public void setCameraRoll(ICameraRoll cameraRoll) {
//        this.cameraRollnoColor = cameraRoll;
//    }
//

    @Autowired
    @Qualifier("BlackAndWhiteCameraRoll")
    private ICameraRoll cameraRoll;

//    @Autowired
//    @Qualifier("BlackAndWhiteCameraRoll")
//    public void setCameraRoll(ICameraRoll cameraRoll) {
//        this.cameraRoll = cameraRoll;
//    }

//    public void doPhotograph(CameraRollType type) {
//        System.out.println("Щелк!");
//       // cameraRoll.processing();
////
//        if (type == CameraRollType.BlackAndWhite) {
//            cameraRollnoColor.processing();
//        } else  {
//            cameraRollColor.processing();
//        }
//    }

    @Override
    public void doPhotograph() {
        System.out.println("Щелк!");
        cameraRoll.processing();
    }

    @Override
    public void doPhotographColor() {
        System.out.println("Щелк!");
        System.out.println("камера " + res);
        cameraRoll.processing();
    }
}


