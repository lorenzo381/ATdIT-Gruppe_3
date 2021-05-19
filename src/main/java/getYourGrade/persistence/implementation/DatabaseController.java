package getYourGrade.persistence.implementation;
// Interface for database functionality

import java.sql.*;

public class DatabaseController {

    public static final String location = "jdbc:sqlite:src/main/resources/database/db.sqlite";

    public static Connection connect() {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(location);
            System.out.println("Connection to Database established");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(" Connection to Database failed.");
        }
        return conn;
    }

    public static void createTable() {            //Datenbank kreieren

        String sql = """
                CREATE TABLE IF NOT EXISTS student (     
                	id integer PRIMARY KEY NOT NULL,
                	lastName text NOT NULL,
                	firstName text NOT NULL,
                    courseName text NOT NULL,
                	missedDays integer NOT NULL,
                	grade integer NOT NULL                            
                	
                );""";
        Connection conn = connect();
        execute(conn, sql);

    }

    public static void clearTable() {

        String sql = "DELETE FROM student";
        Connection conn = connect();
        execute(conn, sql);

    }

    public static void execute(Connection conn, String sql) {     //führt universal alles mögliche aus
        try {
            Statement stmt = conn.createStatement();

            stmt.execute(sql);
            System.out.println(sql + " Befehl erfolgreich ausgeführt! ");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(" Execution failed.");


        }

    }

    public static StudentData get(int id) {
        String sql = "SELECT id, lastName, firstName, courseName, missedDays, grade FROM student WHERE id = ?";
        Connection conn = connect();
        StudentData rueckgabestudent = new StudentData();


        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {

                rueckgabestudent.setId(rs.getInt("id"));
                rueckgabestudent.setLastName(rs.getString("lastName"));
                rueckgabestudent.setFirstName(rs.getString("firstName"));
                rueckgabestudent.setCourseName(rs.getString("courseName"));
                rueckgabestudent.setMissedDays(rs.getInt("missedDays"));
                rueckgabestudent.setGrade(rs.getInt("grade"));

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(" Getting student Data failed.");


        }
        return rueckgabestudent;
    }

    public static void createStudent(StudentData student) {    // Submit Button Vorlage für Note in Datenbankeintrag übertragen
        String sql = "INSERT INTO student(id, lastName, firstName, courseName, missedDays, grade) VALUES(?,?,?,?,?,?)";

        Connection conn = connect();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, student.getId());
            pstmt.setString(2, student.getLastName());
            pstmt.setString(3, student.getFirstName());
            pstmt.setString(4, student.getCourseName());
            pstmt.setInt(5, student.getMissedDays());
            pstmt.setInt(6, student.getGrade());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void setGrade(int id, int value) {

        String sql = "UPDATE student SET grade = ? WHERE id = ?";

        Connection conn = connect();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, value);
            pstmt.setInt(2, id);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }
}