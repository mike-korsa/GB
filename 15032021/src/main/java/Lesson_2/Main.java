package Lesson_2;

import java.sql.*;

public class Main {

    private static Connection connection;
    private static Statement stmt;
    private static PreparedStatement pstmt;

    public static void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:main.db");
            stmt = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static void main(String[] args) throws SQLException {

        connect();

//        try {
//            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + " " + rs.getString("name") + " " + rs.getString("score"));
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }

//        ResultSet rs = stmt.executeQuery("SELECT * FROM students;");
//
//        ResultSetMetaData rsmd = rs.getMetaData();
//
//        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
//            System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnType(i));
//        }

//        try {
//            stmt.executeUpdate("CREATE TABLE students1 (" +
//                    " id INTEGER PRIMARY KEY AUTOINCREMENT," +
//                    " name TEXT," +
//                    " score INTEGER)");
//
//            long t = System.currentTimeMillis();
////////
//           connection.setAutoCommit(false);
////////
//            for (int i = 0; i < 1000; i++) {
//                stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('test_name', 100)");
//            }
////////
//            connection.setAutoCommit(true);
////////
//            System.out.println(System.currentTimeMillis() - t);

            long t = System.currentTimeMillis();
            connection.setAutoCommit(false);
            pstmt = connection.prepareStatement("INSERT INTO students (name, score) VALUES (?, ?);");
            for (int i = 0; i < 100; i++) {
                pstmt.setString(1, "Bob" + i);
                pstmt.setInt(2, i);
                pstmt.addBatch();
            }
            pstmt.executeBatch();
            connection.setAutoCommit(true);
            System.out.println(System.currentTimeMillis() - t);

            //            try {
//                stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob2', 20);");
//                stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob2', 20);");
//                stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob2', 20);");
//                stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob2', 20);");
//                connection.commit();
//            } catch (Exception e) {
//                connection.rollback(sp);
//            }

//
//            connection.setAutoCommit(false);
//
//            stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob1', 10);");
//
//            Savepoint sp = connection.setSavepoint();
//
//            stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob2', 20);");
//
//            connection.rollback(sp);
//
//            connection.setAutoCommit(true);
//
//            stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob3', 30);");


//
//            stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob3', 30);");
//
//            connection.commit();


//
            disconnect();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        } finally {
//            disconnect();
//        }
    }
}
