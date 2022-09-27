package Lesson_1;

import org.springframework.stereotype.Component;

@Component("BlackAndWhiteCameraRoll")
public class BlackAndWhiteCameraRoll implements ICameraRoll{
    public void processing() {
        System.out.println("-1 ч/б кадр!");
    }
}
