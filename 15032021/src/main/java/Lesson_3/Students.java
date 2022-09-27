package Lesson_3;

import java.io.*;

// extends Lesson_7.Human
// extends Lesson_7.Human implements Serializable
public class Students implements Serializable {
    int id;
    String name;
    transient Book book;

    public Students(int id, String name) {
//        super(1);
        System.out.println("Students constr");
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void info() {
        System.out.println(id + " " + name);
    }
}
