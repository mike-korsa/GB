package Lesson_7.Anon;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnon {
    int priority() default 5;
}


//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.METHOD)
//public @interface MyAnon {
//}