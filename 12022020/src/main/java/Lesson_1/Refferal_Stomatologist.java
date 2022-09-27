package Lesson_1;

import org.springframework.stereotype.Component;

@Component("Refferal")
public class Refferal_Stomatologist implements Refferal {
    public void direct() {
        System.out.println("Выдано направление к стоматологу");
    }
}