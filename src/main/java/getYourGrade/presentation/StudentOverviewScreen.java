package getYourGrade.presentation;

import getYourGrade.persistence.implementation.DatabaseController;

import javax.swing.*;
import java.awt.*;

public class StudentOverviewScreen extends JFrame {

    Container pane;
    JPanel white, description;

    JPanel zero, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen;
    JPanel jpArray [] = {zero, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen};
    JLabel jp , jlLastName, jlFirstName, jlCourseName,  jlMissedDays, jlGrade;
    JLabel jlArray[] = {jlLastName, jlFirstName, jlCourseName,  jlMissedDays, jlGrade};


    String arrayDescriptions [] = {"lastname", "firstname",  "course name", "missed days", "grade"};

    public StudentOverviewScreen() {
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("StudentOverview");
        //setUndecorated(true);

        pane = getContentPane();
        pane.setLayout(new GridLayout(20,1));

        white = new JPanel();
        white.setBackground(Color.white);
        pane.add(white);

        description = new JPanel(new GridLayout(1,5));

        for (int i = 0; i<arrayDescriptions.length; i++) {
            jp = new JLabel(arrayDescriptions[i], JLabel.CENTER);
            jp.setBackground(Color.gray);
            jp.setForeground(Color.white);
            jp.setOpaque(true);
            jp.setBorder(BorderFactory.createMatteBorder(0,1,2,1, Color.white));
            description.add(jp);

        }
        pane.add(description);

        System.out.println(jpArray.length);





        for (int i=0; i<jpArray.length; i++) {
            jpArray[i] = new JPanel();
            jpArray[i].setLayout(new GridLayout(1,5));

            jlLastName = new JLabel(DatabaseController.get(i).getLastName());
            jlFirstName = new JLabel(DatabaseController.get(i).getFirstName());
            jlCourseName = new JLabel(DatabaseController.get(i).getCourseName());
            jlMissedDays = new JLabel(String.valueOf(DatabaseController.get(i).getMissedDays()));
            jlGrade = new JLabel(String.valueOf(DatabaseController.get(i).getGrade()));


            jlLastName.setBackground(Color.white);
            jlFirstName.setBackground(Color.white);
            jlCourseName.setBackground(Color.white);
            jlMissedDays.setBackground(Color.white);
            jlGrade.setBackground(Color.white);

            jlLastName.setOpaque(true);
            jlFirstName.setOpaque(true);
            jlCourseName.setOpaque(true);
            jlMissedDays.setOpaque(true);
            jlGrade.setOpaque(true);

            jlLastName.setBorder(BorderFactory.createMatteBorder(0, 1, 2, 1, Color.lightGray));
            jlFirstName.setBorder(BorderFactory.createMatteBorder(0, 1, 2, 1, Color.lightGray));
            jlCourseName.setBorder(BorderFactory.createMatteBorder(0, 1, 2, 1, Color.lightGray));
            jlMissedDays.setBorder(BorderFactory.createMatteBorder(0, 1, 2, 1, Color.lightGray));
            jlGrade.setBorder(BorderFactory.createMatteBorder(0, 1, 2, 1, Color.lightGray));

            jpArray[i].add(  jlLastName);
            jpArray[i].add(  jlFirstName);
            jpArray[i].add(  jlCourseName);
            jpArray[i].add(  jlMissedDays);
            jpArray[i].add(  jlGrade);


            pane.add(jpArray[i]);

                 }





        setVisible(true);
    }

    public static void main(String[] args) {
        StudentOverviewScreen so = new StudentOverviewScreen();


    }
}
