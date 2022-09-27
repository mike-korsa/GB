package Lesson_1;

public class Human {
    int id;
    int entutyId;
    int parentId;
    String name;



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Human(int id, int entutyId, int parentId, String name) {
        this.id = id;
        this.entutyId = entutyId;
        this.parentId = parentId;
        this.name = name;
    }


}