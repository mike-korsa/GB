package Lesson_7;

//public record Point(int x, int y) {}



public record Point(int x, int y) {
    public Point{
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }
    }
}