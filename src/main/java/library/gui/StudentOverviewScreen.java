package library.gui;
import javax.swing.*;
import java.awt.*;

public class StudentOverviewScreen extends JFrame{

    Container pane;
    public StudentOverviewScreen() {
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("StudentOverview");
        setSize(1395,900);
        pane = getContentPane();
        pane.setLayout(new GridLayout());
        setVisible(true);
    }

    public static void main (String [] args) {
        StudentOverviewScreen so = new StudentOverviewScreen();
        so.setVisible(true);
        so.setTitle("ClassScreen");
        so.setSize(1395,900);
    }
}
