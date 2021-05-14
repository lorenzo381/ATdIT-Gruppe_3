package library.presentation;

import javax.swing.*;
import java.awt.*;


public class ClassScreen extends JFrame {

    Container pane;
    JPanel borderleft, first, second, third, fourth, fifth, sixth, seventh;

    //BORDER LEFT COLUMN
    JPanel exitJP;
    JButton exitClassJB;

    //FIRST COLUMN
    JButton laraJB, maxJB, timJB, lauraJB, marcoJB, lucaJB;

    //SECOND COLUMN
    JButton jonasJB;


    //THIRD COLUMN
    JButton leonJB;
    JLabel teacherJL;


    //FOURTH COLUMN
    JButton maximJL;

    //FIFTH COLUMN

    JButton tomJB, philippJB, noahJB, robertJB, claraJB, sophiaJB;

    //SIXTH COLUMN

    //SEVENTH
    JLabel timerJL, absentJL, timerHeadline, dateJL, absentNamesJL;
    String dateS;


    public ClassScreen() {
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("ClassScreen");
        setUndecorated(true);
        pane = getContentPane();
        pane.setLayout(new GridLayout(1, 8));
        addClassScreen acs = new addClassScreen();


        borderleft = new JPanel(new GridLayout(8, 1));
        exitJP = new JPanel(new FlowLayout());
        exitJP.setBackground(Color.white);
        CloseClassScreenListener closeClassScreenListener = new CloseClassScreenListener(this);
        exitClassJB = new JButton("Exit Class");
        exitClassJB.addActionListener(closeClassScreenListener);
        exitClassJB.setBackground(Color.green);
        exitClassJB.setPreferredSize(new Dimension(130, 40));
        //bl1.addActionListener();
        exitJP.add(exitClassJB, CENTER_ALIGNMENT);
        borderleft.add(exitJP);

        for (int i = 0; i < 7; i++) {
            acs = new addClassScreen();
            acs.addWhiteJlToClassScreen(borderleft);
        }
        pane.add(borderleft);


        first = new JPanel(new GridLayout(8, 1));
        laraJB = new JButton("Mauritz");
        maxJB = new JButton("Zlatan");
        timJB = new JButton("Tim");
        lauraJB = new JButton("Laura");
        marcoJB = new JButton("Marco");
        lucaJB = new JButton("Luca");

        AufrufListener al1 = new AufrufListener(laraJB);
        laraJB.addMouseListener(al1);
        laraJB.setBackground(Color.CYAN);

        AufrufListener al4 = new AufrufListener(marcoJB);
        marcoJB.addMouseListener(al4);
        marcoJB.setBackground(Color.CYAN);

        AufrufListener al5 = new AufrufListener(lucaJB);
        lucaJB.addMouseListener(al5);
        lucaJB.setBackground(Color.CYAN);

        acs.addWhiteJlToClassScreen(first);
        first.add(laraJB);
        first.add(maxJB);
        first.add(timJB);
        first.add(lauraJB);
        first.add(marcoJB);
        first.add(lucaJB);
        acs.addWhiteJlToClassScreen(first);
        pane.add(first);


        second = new JPanel(new GridLayout(8, 1));
        acs.addWhiteJlToClassScreen(second);

        jonasJB = new JButton("Lara");
        jonasJB.setBackground(Color.cyan);
        second.add(jonasJB);

        AufrufListener al2 = new AufrufListener(jonasJB);

        for (int i = 0; i < 5; i++) {
            acs = new addClassScreen();
            acs.addWhiteJlToClassScreen(second);

        }

        jonasJB.addMouseListener(al2);
        acs.addBordJpToClassScreen(second);
        pane.add(second);


        third = new JPanel(new GridLayout(8, 1));

        acs.addWhiteJlToClassScreen(third);

        leonJB = new JButton("Jonas");


        third.add(leonJB);

        for (int i = 0; i < 4; i++) {

            acs.addWhiteJlToClassScreen(third);
        }

        teacherJL = new JLabel("Teacher", JLabel.CENTER);
        teacherJL.setForeground(Color.white);
        teacherJL.setBackground(Color.darkGray);
        teacherJL.setOpaque(true);


        third.add(teacherJL);
        acs.addBordWithTextJpToClassScreen(third);
        pane.add(third);


        fourth = new JPanel(new GridLayout(8, 1));
        acs = new addClassScreen();
        acs.addWhiteJlToClassScreen(fourth);
        maximJL = new JButton("Maxim");
        maximJL.setBackground(Color.cyan);


        fourth.add(maximJL);

        for (int i = 0; i < 5; i++) {
            acs.addWhiteJlToClassScreen(fourth);
        }


        AufrufListener al3 = new AufrufListener(maximJL);
        maximJL.addMouseListener(al3);


        acs.addBordJpToClassScreen(fourth);
        pane.add(fourth);


        fifth = new JPanel(new GridLayout(8, 1));
        tomJB = new JButton("Tom");
        philippJB = new JButton("Philipp");
        noahJB = new JButton("Noah");
        robertJB = new JButton("Robert");
        claraJB = new JButton("Clara");
        sophiaJB = new JButton("Sophia");


        acs.addWhiteJlToClassScreen(fifth);
        fifth.add(tomJB);
        fifth.add(philippJB);
        fifth.add(noahJB);
        fifth.add(robertJB);
        fifth.add(claraJB);
        fifth.add(sophiaJB);
        acs.addWhiteJlToClassScreen(fifth);
        pane.add(fifth);


        sixth = new JPanel(new GridLayout(8, 1));


        absentJL = new JLabel("Abwesend: ", JLabel.RIGHT);
        absentJL.setForeground(Color.red);
        absentJL.setBackground(Color.white);
        absentJL.setOpaque(true);

        acs.addWhiteJlToClassScreen(sixth);
        sixth.add(absentJL);

        for (int i = 0; i < 6; i++) {
            acs.addWhiteJlToClassScreen(sixth);
        }

        pane.add(sixth);


        seventh = new JPanel(new GridLayout(8, 1));

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
        timerHeadline = new JLabel("TIME LEFT:", JLabel.CENTER);
        timerHeadline.setBackground(gr);
        timerHeadline.setOpaque(true);

        dateJL = new JLabel(dateS);
        dateJL.setBackground(gr);
        dateJL.setOpaque(true);
        DateTimer dateTimer = new DateTimer(dateJL);
        seventh.add(dateJL);
        seventh.add(absentNamesJL);

        for (int i = 0; i < 3; i++) {
            acs.addWhiteJlToClassScreen(seventh);
        }


        seventh.add(timerHeadline);
        seventh.add(timerJL);
        acs.addWhiteJlToClassScreen(seventh);
        pane.add(seventh);


        setVisible(true);
    }

    public static void main(String[] args) {
        ClassScreen cs = new ClassScreen();

    }


    public void closeFrame() {
        this.dispose();
    }

}
