package Lesson_7;

public class JavaTextBlock17 {
    public static void main(String[] args) {
        var get = """
                SELECT s.name, f.name, u.name FROM students s
                JOIN faculty f on s.f_id = f.id
                JOIN university u on u.id = s.u_id""";

        var code =  """
                public static void main(String[] args) {
                    System.out.println("Hello world!");
                }""";

        var oneString =  """
                One a very long long long long long long long long long long \
                long long long long long long long long line.""";

        var add =  """
                INSERT INTO students (name, score)
                VALUES('%s', %d)""".formatted("Bob", 10);
    }
}