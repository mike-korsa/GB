package Lesson_1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("ColorCameraRoll")
@Scope("prototype")
public class ColorCameraRoll implements ICameraRoll {
    Integer res = 0;
//  //  Random random = new Random(System.currentTimeMillis());
    Random random = new Random();

    public ColorCameraRoll() {
        res = random.nextInt();
    }

    public void processing() {
        System.out.println("-1 цветной кадр!");
        System.out.println("пленка" + res);
    }

//    public Integer getRes() {
//        return res;
//    }
//
//    public void setRes(Integer res) {
//        this.res = res;
//    }
//
//    public Random getRandom() {
//        return random;
//    }
//
//    public void setRandom(Random random) {
//        this.random = random;
//    }
}
