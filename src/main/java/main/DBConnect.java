package main;
// Schnitstelle zwischen Datenbank und rest des Programms von uns

import library.model.implementation.Student;

import java.sql.*;

public class DBConnect {

    public static final String location = "jdbc:sqlite:src/main/java/library/Database/db.sqlite";

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

    public static void main(String[] args) {

        tabelleanlegen();
        createStudent(new Student(1, "Heribert", "prog5", 27 ));
        Student unserStudent = get(1);
        System.out.println("A");
    }

    public static void tabelleanlegen() {            //Datenbank kreieren

        String sql = """
                CREATE TABLE IF NOT EXISTS student (     
                	id integer PRIMARY KEY,
                	name text NOT NULL,
                	
                	courseName text,
                	missedDays integer                             
                	
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

    public static Student get(int id) {
        String sql = "SELECT id, name, courseName, missedDays FROM student WHERE id = ?";
        Connection conn = connect();
        //Student rueckgabestudent = new Student();


        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

               /* rueckgabestudent.setId(rs.getInt("id"));
                rueckgabestudent.setName(rs.getString("name"));
                rueckgabestudent.setCourseName(rs.getString("courseName"));
                rueckgabestudent.setMissedDays(rs.getInt("missedDays"));*/

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());


        }
       // return rueckgabestudent;
        return null;
    }

    public static void createStudent(Student student) {    // Submit Button Vorlage für Note in Datenbankeintrag übertragen
        String sql = "INSERT INTO student(id, name, courseName, missedDays) VALUES(?,?,?,?)";

        Connection conn = connect();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, student.getId());
            pstmt.setString(2, student.getName());
            pstmt.setString(3, student.getCourseName());
            pstmt.setInt(4, student.getMissedDays());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}