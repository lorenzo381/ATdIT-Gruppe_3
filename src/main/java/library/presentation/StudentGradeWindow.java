package library.presentation;
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


    public StudentGradeWindow (JButton jb) {

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
                }

                else if (wellJRB.isSelected()) {
                    System.out.println("Well");

                }

                else if (acceptableJRB.isSelected()) {
                    System.out.println("acceptable");
                }

                else if (notEnoughJRB.isSelected()) {
                    System.out.println("not enough");
                }

                else {
                    System.out.println("nothing");

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
