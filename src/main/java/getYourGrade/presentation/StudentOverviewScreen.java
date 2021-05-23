package getYourGrade.presentation;

import getYourGrade.persistence.implementation.DatabaseController;

import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

public class StudentOverviewScreen extends JFrame {

    Container pane;
    JPanel white, description;

    JPanel zero, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen;
    JPanel jpArray[] = {zero, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen};
    JLabel jp, jlLASTNAME, jlFIRSTNAME, jlCourseName, jlMissedDays, jlGrade;
    JLabel jlArray[] = {jlLASTNAME, jlFIRSTNAME, jlCourseName, jlMissedDays, jlGrade};

    ResourceBundle resourcebundle = ResourceBundle.getBundle("i18n/presentation");
    String arrayDescriptions[] = {resourcebundle.getString("lastname"), resourcebundle.getString("firstname"), resourcebundle.getString("course name"), resourcebundle.getString("missed days"), resourcebundle.getString("grade")};


    public StudentOverviewScreen() {
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(resourcebundle.getString("StudentOverview"));


        pane = getContentPane();
        pane.setLayout(new GridLayout(20, 1));

        white = new JPanel();
        white.setBackground(Color.white);
        pane.add(white);

        description = new JPanel(new GridLayout(1, 5));

        for (int i = 0; i < arrayDescriptions.length; i++) {
            jp = new JLabel(arrayDescriptions[i], JLabel.CENTER);
            jp.setBackground(Color.gray);
            jp.setForeground(Color.white);
            jp.setOpaque(true);
            jp.setBorder(BorderFactory.createMatteBorder(0, 1, 2, 1, Color.white));
            description.add(jp);

        }
        pane.add(description);

        System.out.println(jpArray.length);


        for (int i = 0; i < jpArray.length; i++) {
            jpArray[i] = new JPanel();
            jpArray[i].setLayout(new GridLayout(1, 5));

            jlLASTNAME = new JLabel(DatabaseController.get(i).getLASTNAME());
            jlFIRSTNAME = new JLabel(DatabaseController.get(i).getFIRSTNAME());
            jlCourseName = new JLabel(DatabaseController.get(i).getCourseName());
            jlMissedDays = new JLabel(String.valueOf(DatabaseController.get(i).getMissedDays()));
            jlGrade = new JLabel(String.valueOf(DatabaseController.get(i).getGrade()));


            jlLASTNAME.setBackground(Color.white);
            jlFIRSTNAME.setBackground(Color.white);
            jlCourseName.setBackground(Color.white);
            jlMissedDays.setBackground(Color.white);
            jlGrade.setBackground(Color.white);

            jlLASTNAME.setOpaque(true);
            jlFIRSTNAME.setOpaque(true);
            jlCourseName.setOpaque(true);
            jlMissedDays.setOpaque(true);
            jlGrade.setOpaque(true);

            jlLASTNAME.setBorder(BorderFactory.createMatteBorder(0, 1, 2, 1, Color.lightGray));
            jlFIRSTNAME.setBorder(BorderFactory.createMatteBorder(0, 1, 2, 1, Color.lightGray));
            jlCourseName.setBorder(BorderFactory.createMatteBorder(0, 1, 2, 1, Color.lightGray));
            jlMissedDays.setBorder(BorderFactory.createMatteBorder(0, 1, 2, 1, Color.lightGray));
            jlGrade.setBorder(BorderFactory.createMatteBorder(0, 1, 2, 1, Color.lightGray));

            jpArray[i].add(jlLASTNAME);
            jpArray[i].add(jlFIRSTNAME);
            jpArray[i].add(jlCourseName);
            jpArray[i].add(jlMissedDays);
            jpArray[i].add(jlGrade);


            pane.add(jpArray[i]);

        }


        setVisible(true);
    }


}
