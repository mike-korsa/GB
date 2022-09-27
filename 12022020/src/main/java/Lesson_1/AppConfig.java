package Lesson_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@Configuration
@ComponentScan
public class AppConfig {

//    @Bean(name = "cameraRoll")
//    public ICameraRoll cameraRoll() {
//        return new ColorCameraRoll();
//    }
//
//    @Bean(name = "camera")
//    public ICamera camera(ICameraRoll cameraRoll) {
//        Camera camera = new Camera();
//        camera.setCameraRoll(cameraRoll);
//        return camera;
//    }
}










//        if (CameraRollType.BlackAndWhite.getId() == Client.type.getId()) {
//            return new BlackAndWhiteCameraRoll();
//        } else if (CameraRollType.ColorCamera.getId() == Client.type.getId()) {
//            return new ColorCameraRoll();
//        }
////        return new ColorCameraRoll();
//        throw new IllegalArgumentException("нет такого типа");
