package library.presentation;
import javax.swing.*;
import java.awt.*;

public class StudentOverviewScreen extends JFrame {

    Container pane;
    JPanel idJP, familynameJP, firstnameJP, missedDaysJP, qualityJP ,quantityJP ,gradeJP, homeworkJP;
    JPanel white, description;
    JPanel one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve;
    JPanel jpArray [] = {one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve};
    JLabel jp, jl, lastname, firstname, coursename, frequancy, missedDays, grade;
    String arrayDescriptions [] = {"ID","lastname", "firstname", "frequency", "course name", "missed days", "grade"};

    public StudentOverviewScreen() {
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("StudentOverview");
        //setUndecorated(true);

        pane = getContentPane();
        pane.setLayout(new GridLayout(15,1));

        white = new JPanel();
        white.setBackground(Color.white);
        pane.add(white);

        description = new JPanel(new GridLayout(1,7));

        for (int i = 0; i<arrayDescriptions.length; i++) {
            jp = new JLabel(arrayDescriptions[i], JLabel.CENTER);
            jp.setBackground(Color.gray);
            jp.setForeground(Color.white);
            jp.setOpaque(true);
            jp.setBorder(BorderFactory.createMatteBorder(0,1,2,1, Color.white));
            description.add(jp);

        }
        pane.add(description);

        for (int i =0; i<jpArray.length; i++) {
            jpArray[i] = new JPanel();
            jpArray[i].setLayout(new GridLayout(1,7));
            for ( int j =0; j<7; j++) {

                 jl = new JLabel ();
                 jl.setBackground(Color.lightGray);
                 jl.setOpaque(true);
                 jl.setOpaque(true);
                 jl.setBorder(BorderFactory.createMatteBorder(0,1,2,1, Color.white));
                 jpArray[i].add(jl);


            }
            pane.add(jpArray[i]);
        }


        setVisible(true);
    }

    public static void main(String[] args) {
        StudentOverviewScreen so = new StudentOverviewScreen();


    }
}
