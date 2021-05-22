package getYourGrade.presentation;

import getYourGrade.persistence.implementation.DatabaseController;

import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;


public class ClassScreen extends JFrame {

    Container pane;
    JPanel zeroJP, firstJP, secondJP, thirdJP, fourthJP, fifthJP, sixthJP, seventhJP;

    //BORDER LEFT COLUMN
    JPanel exitJP;
    JButton exitClassJB;

    //FIRST COLUMN
    JCustomButton zeroJCB, oneJCB, twoJCB, threeJCB,  fourJCB, fiveJCB,  sixJCB;
    int zero = 0,one=1, two=2, three=3, four=4, five=5, six=6, seven =7, eight=8, nine = 9, ten = 10, eleven =11, twelve =12, thirteen=13, fourteen=14;

    //SECOND COLUMN
    JCustomButton sevenJB;


    //THIRD COLUMN
    JCustomButton leonJB;
    JLabel teacherJL;


    //FOURTH COLUMN
    JCustomButton eightJCB;

    //FIFTH COLUMN

    JCustomButton nineJCB, tenJCB, elevenJCB, twelveJCB, thirteenJCB, fourteenJCB;

    //SIXTH COLUMN

    //SEVENTH
    JLabel timerJL, absentJL, timerHeadline, dateJL, absentNamesJL;
    String dateS;
    ResourceBundle resourcebundle = ResourceBundle.getBundle("i18n/presentation");


    public ClassScreen() {
        setExtendedState(MAXIMIZED_BOTH);
        setTitle(resourcebundle.getString("ClassScreen"));
        setUndecorated(true);
        pane = getContentPane();
        pane.setLayout(new GridLayout(1, 8));
        addClassScreen acs = new addClassScreen();


        zeroJP = new JPanel(new GridLayout(8, 1));
        exitJP = new JPanel(new FlowLayout());
        exitJP.setBackground(Color.white);
        CloseClassScreenListener closeClassScreenListener = new CloseClassScreenListener(this);
        exitClassJB = new JButton(resourcebundle.getString("Exit Class"));
        exitClassJB.addActionListener(closeClassScreenListener);
        exitClassJB.setBackground(Color.green);
        exitClassJB.setPreferredSize(new Dimension(130, 40));
        //bl1.addActionListener();
        exitJP.add(exitClassJB, CENTER_ALIGNMENT);
        zeroJP.add(exitJP);

        for (int i = 0; i < 7; i++) {
            acs = new addClassScreen();
            acs.addWhiteJlToClassScreen(zeroJP);
        }
        pane.add(zeroJP);


        firstJP = new JPanel(new GridLayout(8, 1));

        zeroJCB = new JCustomButton(DatabaseController.get(zero).getFIRSTNAME(),zero);
        oneJCB = new JCustomButton(DatabaseController.get(one).getFIRSTNAME(),one);
        twoJCB = new JCustomButton(DatabaseController.get(two).getFIRSTNAME(),two);
        threeJCB = new JCustomButton(DatabaseController.get(three).getFIRSTNAME(),three);
        fourJCB = new JCustomButton(DatabaseController.get(four).getFIRSTNAME(), four);
        fiveJCB = new JCustomButton(DatabaseController.get(five).getFIRSTNAME(), five);

        PickOnListener al1 = new PickOnListener(fourJCB);
        fourJCB.addMouseListener(al1);
        fourJCB.setBackground(Color.CYAN);

        PickOnListener al4 = new PickOnListener(threeJCB);
        threeJCB.addMouseListener(al4);
        threeJCB.setBackground(Color.CYAN);

        PickOnListener al5 = new PickOnListener(fiveJCB);
        fiveJCB.addMouseListener(al5);
        fiveJCB.setBackground(Color.CYAN);

        acs.addWhiteJlToClassScreen(firstJP);
        firstJP.add(fourJCB);
        firstJP.add(zeroJCB);
        firstJP.add(oneJCB);
        firstJP.add(twoJCB);
        firstJP.add(threeJCB);
        firstJP.add(fiveJCB);
        acs.addWhiteJlToClassScreen(firstJP);
        pane.add(firstJP);


        secondJP = new JPanel(new GridLayout(8, 1));
        acs.addWhiteJlToClassScreen(secondJP);

        sixJCB = new JCustomButton(DatabaseController.get(six).getFIRSTNAME(), six);
        sixJCB.setBackground(Color.cyan);
        secondJP.add(sixJCB);

        PickOnListener al2 = new PickOnListener(sixJCB);

        for (int i = 0; i < 5; i++) {
            acs = new addClassScreen();
            acs.addWhiteJlToClassScreen(secondJP);

        }

        sixJCB.addMouseListener(al2);
        acs.addBordJpToClassScreen(secondJP);
        pane.add(secondJP);


        thirdJP = new JPanel(new GridLayout(8, 1));

        acs.addWhiteJlToClassScreen(thirdJP);

        sevenJB = new JCustomButton(DatabaseController.get(seven).getFIRSTNAME(), seven);


        thirdJP.add(sevenJB);

        for (int i = 0; i < 4; i++) {

            acs.addWhiteJlToClassScreen(thirdJP);
        }

        teacherJL = new JLabel(resourcebundle.getString("Teacher"), JLabel.CENTER);
        teacherJL.setForeground(Color.white);
        teacherJL.setBackground(Color.darkGray);
        teacherJL.setOpaque(true);


        thirdJP.add(teacherJL);
        acs.addBordWithTextJpToClassScreen(thirdJP);
        pane.add(thirdJP);


        fourthJP = new JPanel(new GridLayout(8, 1));
        acs = new addClassScreen();
        acs.addWhiteJlToClassScreen(fourthJP);
        eightJCB = new JCustomButton(DatabaseController.get(eight).getFIRSTNAME(), eight);
        eightJCB.setBackground(Color.cyan);


        fourthJP.add(eightJCB);

        for (int i = 0; i < 5; i++) {
            acs.addWhiteJlToClassScreen(fourthJP);
        }


        PickOnListener al3 = new PickOnListener(eightJCB);
        eightJCB.addMouseListener(al3);


        acs.addBordJpToClassScreen(fourthJP);
        pane.add(fourthJP);


        fifthJP = new JPanel(new GridLayout(8, 1));
        nineJCB = new JCustomButton(DatabaseController.get(nine).getFIRSTNAME(), nine);
        tenJCB = new JCustomButton(DatabaseController.get(ten).getFIRSTNAME(),ten );
        elevenJCB = new JCustomButton(DatabaseController.get(eleven).getFIRSTNAME(), eleven);
        twelveJCB = new JCustomButton(DatabaseController.get(twelve).getFIRSTNAME(), twelve);
        thirteenJCB = new JCustomButton(DatabaseController.get(thirteen).getFIRSTNAME(), thirteen);
        fourteenJCB = new JCustomButton(DatabaseController.get(fourteen).getFIRSTNAME(), fourteen);


        acs.addWhiteJlToClassScreen(fifthJP);
        fifthJP.add(nineJCB);
        fifthJP.add(tenJCB);
        fifthJP.add(elevenJCB);
        fifthJP.add(twelveJCB);
        fifthJP.add(thirteenJCB);
        fifthJP.add(fourteenJCB);
        acs.addWhiteJlToClassScreen(fifthJP);
        pane.add(fifthJP);


        sixthJP = new JPanel(new GridLayout(8, 1));


        absentJL = new JLabel(resourcebundle.getString("absent"), JLabel.RIGHT);
        absentJL.setForeground(Color.red);
        absentJL.setBackground(Color.white);
        absentJL.setOpaque(true);

        acs.addWhiteJlToClassScreen(sixthJP);
        sixthJP.add(absentJL);

        for (int i = 0; i < 6; i++) {
            acs.addWhiteJlToClassScreen(sixthJP);
        }

        pane.add(sixthJP);


        seventhJP = new JPanel(new GridLayout(8, 1));

        timerJL = new JLabel(dateS, JLabel.CENTER);
        timerJL.setBackground(Color.white);
        timerJL.setOpaque(true);
        timerJL.setForeground(Color.red);
        timerJL.setBorder(BorderFactory.createLineBorder(Color.red));

        Font f = new Font("SansSerif", Font.BOLD + Font.ITALIC, 16);
        timerJL.setFont(f);
        TimerCountdown timerCountdown = new TimerCountdown(timerJL);
        Color gr = Color.WHITE;
        absentNamesJL = new JLabel("  Noah, Lily, Luis");
        absentNamesJL.setForeground(Color.red);
        absentNamesJL.setBackground(gr);
        absentNamesJL.setOpaque(true);
        timerHeadline = new JLabel(resourcebundle.getString("Time left"), JLabel.CENTER);
        timerHeadline.setBackground(gr);
        timerHeadline.setOpaque(true);

        dateJL = new JLabel(dateS);
        dateJL.setBackground(gr);
        dateJL.setOpaque(true);
        DateTimer dateTimer = new DateTimer(dateJL);
        seventhJP.add(dateJL);
        seventhJP.add(absentNamesJL);

        for (int i = 0; i < 3; i++) {
            acs.addWhiteJlToClassScreen(seventhJP);
        }


        seventhJP.add(timerHeadline);
        seventhJP.add(timerJL);
        acs.addWhiteJlToClassScreen(seventhJP);
        pane.add(seventhJP);


        setVisible(true);
    }

    public static void main(String[] args) {
        ClassScreen cs = new ClassScreen();

    }


    public void closeFrame() {
        this.dispose();
    }

}
