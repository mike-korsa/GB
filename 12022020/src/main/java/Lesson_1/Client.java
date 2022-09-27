package Lesson_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;

public class Client {
    public static CameraRollType type = CameraRollType.ColorCamera;

    public static void main(String[] args) {
//        CameraClient client = new CameraClient();
//        Camera camera = client.getCamera();
//        camera.doPhotograph();

//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        ICamera camera1 = context.getBean("camera", ICamera.class);
//        ICamera camera2 = context.getBean("camera", ICamera.class);
//        ICamera camera3 = context.getBean("camera", ICamera.class);
//        camera1.doPhotographColor();
//        camera2.doPhotographColor();
//        camera3.doPhotographColor();

//        ICamera camera1 = context.getBean("camera", ICamera.class);
//        ICamera camera2 = context.getBean("camera", ICamera.class);
//        camera1.doPhotographColor();
//        camera2.doPhotographColor();


       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
////
        ICamera camera1 = context.getBean("camera", ICamera.class);
//       // ICamera camera2 = context.getBean("camera", ICamera.class);
        camera1.doPhotograph();
//        camera2.doPhotographColor();

//        ICamera camera2 = context.getBean("camera", ICamera.class);
//        camera2.doPhotograph();



        //@PathVariable
        // PostConstruct
        // PreDestroy
        // @Scope

//        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//        Registry registry = context.getBean("Registry",Registry.class );
//        registry.issue_direction();

//          ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//          HelloMan hm = context.getBean("helloman", HelloMan.class);
//         // hm.setName("Vaska");
//          hm.helloSay();


//        ICamera camera2 = context.getBean("camera", ICamera.class);
//        camera2.doPhotograph();
    }

}
