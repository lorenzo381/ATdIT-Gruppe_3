package library.presentation;
import library.persistence.implementation.DatabaseController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGradeWindow extends JFrame {

    JButton jb;
    Container pane;
    JRadioButton veryWellJRB, wellJRB, acceptableJRB, notEnoughJRB;
    ButtonGroup buttonGroup;
    JButton submitJB;
    int x,y;


    public StudentGradeWindow (JCustomButton jb) {

        submitJB = jb;
        pane = getContentPane();
        pane.setLayout(new GridLayout(6,1));
        pane.add(new JLabel(jb.getText(), JLabel.CENTER));

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //DISPOSE_ON_CLOSE schließt nur neues fenster, EXIT_ON_CLOSE würde auch die pane schließen
        setUndecorated(true);
        setTitle(jb.getText());

        setSize(150, 150);
        setLocation(530,400);

        setVisible(true);

        submitJB = new JButton("Submit");
        submitJB.setBackground(Color.green);
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeFrame();
                jb.setBackground(null);

                if(veryWellJRB.isSelected()) {
                    System.out.println("VeryWell");
                    System.out.println();
                }

                else if (wellJRB.isSelected()) {
                    System.out.println("Well");
                    System.out.println(jb.getID());
                    DatabaseController.setGrade(jb.getID(),1);

                }

                else if (acceptableJRB.isSelected()) {
                    DatabaseController.setGrade(jb.getID(),2);
                    System.out.println("acceptable");
                    System.out.println(jb.getID());
                }

                else if (notEnoughJRB.isSelected()) {
                    DatabaseController.setGrade(jb.getID(),3);
                    System.out.println("not enough");
                    System.out.println(jb.getID());
                }

                else {
                    DatabaseController.setGrade(jb.getID(),4);
                    System.out.println("nothing");
                    System.out.println(jb.getID());

                }

            }
        };

        submitJB.addActionListener(al);



        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //DISPOSE_ON_CLOSE schließt nur neues fenster, EXIT_ON_CLOSE würde auch die pane schließen

        veryWellJRB = new JRadioButton("VERY WELL");
        wellJRB = new JRadioButton("WELL");
        acceptableJRB = new JRadioButton("ACCEPTABLE");
        notEnoughJRB = new JRadioButton("NOT ENOUGH");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(veryWellJRB);
        buttonGroup.add(wellJRB);
        buttonGroup.add(acceptableJRB);
        buttonGroup.add(notEnoughJRB);


        pane.add(veryWellJRB);
        pane.add(wellJRB);
        pane.add(acceptableJRB);
        pane.add(notEnoughJRB);
        pane.add(submitJB);

    }

    public void closeFrame() {
        dispose();
    }


}
