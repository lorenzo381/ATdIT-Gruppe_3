package library.presentation;
import javax.swing.*;
import java.awt.*;

public class StudentOverviewScreen extends JFrame {

    Container pane;
    JPanel idJP, familynameJP, firstNameJP, missedDaysJP, qualityJP ,quantityJP ,gradeJP, homeworkJP;

    public StudentOverviewScreen() {
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("StudentOverview");
        //setUndecorated(true);

        pane = getContentPane();
        pane.setLayout(new GridLayout(1,7));


        idJP = new JPanel(new GridLayout(20,1));
        idJP.setBackground(Color.white);
        pane.add(idJP);

        familynameJP = new JPanel(new GridLayout(20,1));
        familynameJP.setBackground(Color.white);
        pane.add(familynameJP);

        firstNameJP = new JPanel(new GridLayout(20,1));
        firstNameJP.setBackground(Color.white);
        pane.add(firstNameJP);

        missedDaysJP = new JPanel(new GridLayout(20,1));
        missedDaysJP.setBackground(Color.white);
        pane.add(missedDaysJP);

        qualityJP = new JPanel(new GridLayout(20,1));
        qualityJP.setBackground(Color.white);
        pane.add(qualityJP);

        quantityJP = new JPanel(new GridLayout(20,1));
        quantityJP.setBackground(Color.white);
        pane.add(quantityJP);

        gradeJP = new JPanel(new GridLayout(20,1));
        gradeJP.setBackground(Color.white);
        pane.add(gradeJP);

        homeworkJP = new JPanel(new GridLayout(20,1));
        homeworkJP.setBackground(Color.white);
        pane.add(homeworkJP);

        setVisible(true);
    }

    public static void main(String[] args) {
        StudentOverviewScreen so = new StudentOverviewScreen();


    }
}
