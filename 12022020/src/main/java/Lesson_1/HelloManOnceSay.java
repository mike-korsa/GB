package Lesson_1;

import org.springframework.beans.factory.annotation.Value;

//@Component
public class HelloManOnceSay implements HelloMan{

    @Value("Jorick")
    private String name;

    public HelloManOnceSay(String name) {
        this.name = name;
    }

    @Override
    public void helloSay() {
        System.out.println("Hello " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
