package getYourGrade.persistence.implementation;

import java.sql.*;

/**
 * The class DatabaseController manages the essential functions of the database used in the project.
 *
 * @version : 24.05.2021
 * @author : Jonas Jamin
 **/

public class DatabaseController {

    /**
     * Defining data path for database file.
     **/
    public static final String location = "jdbc:sqlite:src/main/resources/database/db.sqlite";

    /**
     * Connecting database to program. Creating java object 'conn' that represents the database.
     **/
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

    /**
     * Actually creating the database with its columns. Using JDBC application.
     **/
    public static void createTable() {
        String sql = """
                CREATE TABLE IF NOT EXISTS student (     
                	ID integer PRIMARY KEY NOT NULL,
                	LASTNAME text NOT NULL,
                	FIRSTNAME text NOT NULL,
                    courseName text NOT NULL,
                	missedDays integer NOT NULL,
                	grade integer NOT NULL                            
                	
                );""";
        Connection conn = connect();
        execute(conn, sql);

    }

    /**
     * Data from database gets fully cleared.
     **/
    public static void clearTable() {

        String sql = "DELETE FROM student";
        Connection conn = connect();
        execute(conn, sql);

    }

    /**
     * Executes orders of any kind if requested by other methods, working with given transfer parameters.
     **/
    public static void execute(Connection conn, String sql) {
        try {
            Statement stmt = conn.createStatement();

            stmt.execute(sql);
            System.out.println(sql + " Command executed successfully ");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(" Execution failed.");


        }

    }

    /**
     * Receiving in database listed data for the requested student. Creating java object 'rueckgabestudent' to deliver the data from database.
     **/
    public static StudentData get(int ID) {
        String sql = "SELECT ID, LASTNAME, FIRSTNAME, courseName, missedDays, grade FROM student WHERE ID = ?";
        Connection conn = connect();
        StudentData rueckgabestudent = new StudentData();


        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, ID);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {

                rueckgabestudent.setId(rs.getInt("ID"));
                rueckgabestudent.setLASTNAME(rs.getString("LASTNAME"));
                rueckgabestudent.setFIRSTNAME(rs.getString("FIRSTNAME"));
                rueckgabestudent.setCourseName(rs.getString("courseName"));
                rueckgabestudent.setMissedDays(rs.getInt("missedDays"));
                rueckgabestudent.setGrade(rs.getInt("grade"));
                conn.close();

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(" Getting student Data failed.");


        }
        return rueckgabestudent;
    }

    /**
     * Creating database entries (students), filling their columns with data.
     **/
    public static void createStudent(StudentData student) {
        String sql = "INSERT INTO student(ID, LASTNAME, FIRSTNAME, courseName, missedDays, grade) VALUES(?,?,?,?,?,?)";

        Connection conn = connect();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, student.getID());
            pstmt.setString(2, student.getLASTNAME());
            pstmt.setString(3, student.getFIRSTNAME());
            pstmt.setString(4, student.getCourseName());
            pstmt.setInt(5, student.getMissedDays());
            pstmt.setInt(6, student.getGrade());
            pstmt.executeUpdate();
            conn.close();


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(" Creating student failed. ");
        }

    }

    /**
     * Changing data in column 'grade' for a specific entry (student) in the database.
     **/
    public static void setGrade(int ID, int value) {

        String sql = "UPDATE student SET grade = ? WHERE ID = ?";

        Connection conn = connect();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, value);
            pstmt.setInt(2, ID);

            pstmt.executeUpdate();
            conn.close();


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(" Updating grade failed. ");

        }


    }


}