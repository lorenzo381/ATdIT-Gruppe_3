
// Schnitstelle zwischen Datenbank und rest des Programms von uns

import java.util.ResourceBundle;

public class DBConnect {
    ResourceBundle resourcebundle = ResourceBundle.getBundle("presentation");


    public static final String location = "jdbc:sqlite:src/main/java/library/Database/db.sqlite";

    public static Connection connect() {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(location);
            System.out.println(resourcebundle.getString("Connection to Database established"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
