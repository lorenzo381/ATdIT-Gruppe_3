package library.gui;
import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

public class StudentOverviewScreen extends JFrame{

    ResourceBundle resourcebundle=ResourceBundle.getBundle("presentation");

    Container pane;
    public StudentOverviewScreen() {
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle(resourcebundle.getString("StudentOverview"));
        setSize(1395,900);
        pane = getContentPane();
        pane.setLayout(new GridLayout());
        setVisible(true);
    }

    public static void main (String [] args) {
        ResourceBundle resourcebundle=ResourceBundle.getBundle("presentation");
        StudentOverviewScreen so = new StudentOverviewScreen();
        so.setVisible(true);
        so.setTitle(resourcebundle.getString("ClassScreen"));
        so.setSize(1395,900);
    }
}
