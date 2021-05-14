package library.persistence.implementation;
// Interface for database functionality

import library.model.implementation.Student;

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
        }
        return conn;
    }

    public static void createTable() {            //Datenbank kreieren

        String sql = """
                CREATE TABLE IF NOT EXISTS student (     
                	id integer PRIMARY KEY,
                	lastName text NOT NULL,
                	firstName text NOT NULL,
                	frequency integer NOT NULL,
                    courseName text NOT NULL,
                	missedDays integer,
                	grade integer                             
                	
                );""";
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


        }

    }

    public static StudentData get(int id) {
        String sql = "SELECT id, lastName, firstName, frequency, courseName, missedDays FROM student WHERE id = ?";
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
                rueckgabestudent.setFrequency(rs.getInt("frequency"));
                rueckgabestudent.setCourseName(rs.getString("courseName"));
                rueckgabestudent.setMissedDays(rs.getInt("missedDays"));

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());


        }
        return rueckgabestudent;
    }

    public static void createStudent(Student student) {    // Submit Button Vorlage für Note in Datenbankeintrag übertragen
        String sql = "INSERT INTO student(id, lastName, firstName, frequency, courseName, missedDays, grade) VALUES(?,?,?,?,?,?,?)";

        Connection conn = connect();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, student.getId());
            pstmt.setString(2, student.getLastName());
            pstmt.setString(3, student.getFirstName());
            pstmt.setInt(4, student.getFrequency());
            pstmt.setString(5, student.getCourseName());
            pstmt.setInt(6, student.getMissedDays());
            pstmt.setInt(7, student.getGrade());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void setGrade(int value) {
        String sql = "INSERT INTO student(frequency, grade) VALUES(?,?) WHERE id='1'";

        Connection conn = connect();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(7, value);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}