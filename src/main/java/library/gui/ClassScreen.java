package library.gui;
import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;


public class ClassScreen extends JFrame{

    Container pane;
    JPanel borderleft, first, second, third, fourth, fifth, sixth, seventh;

    //BORDER LEFT COLUMN
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6 , seventhWhiteBottomJL;
    JLabel whiteJL;
    JPanel exitJP;
    JButton  exitClassJB;

    //FIRST COLUMN
    JLabel whiteTopJL,whiteBottomJB;
    JButton  laraJB, maxJB, timJB, lauraJB,marcoJB, lucaJB;

    //SECOND COLUMN
    JButton jonasJB;
    JLabel  secondWhiteTopJL, secondWhiteBoardJL, secondGreenBoardJL;
    JPanel bord1;

    //THIRD COLUMN
    JButton leonJB;
    JLabel thirdWhiteTopJL,  thirdwhiteBoardJL, greenboardJL, teacherJL;
    JPanel bord2;

    //FOURTH COLUMN
    JButton maximJL;
    JLabel fourthWhiteTopJL, fourthWhiteJL ;
    JPanel bord3;

    //FIFTH COLUMN
    JLabel  fifthWhiteTopJL, fifthWhiteBottomJL;
    JButton tomJB, philippJB, noahJB, robertJB, claraJB, sophiaJB;

    //SIXTH COLUMN

    //SEVENTH
    JLabel timerJL, absentJL, seventhwhiteBoardJL, timerHeadline, dateJL, absentNamesJL;
    String dateS;
    Color gr = new Color(0,60,0);


private ResourceBundle resourcebundle=ResourceBundle.getBundle("presentation");

    public ClassScreen(){
        setExtendedState(MAXIMIZED_BOTH);
        setTitle(resourcebundle.getString("ClassScreen"));
        setUndecorated(true);
        pane = getContentPane();
        pane.setLayout(new GridLayout(1,8));



        borderleft = new JPanel( new GridLayout(8,1));
        exitJP = new JPanel(new FlowLayout());
        exitJP.setBackground(Color.white);
        CloseClassScreenListener closeClassScreenListener = new CloseClassScreenListener(this);
        exitClassJB= new JButton(resourcebundle.getString("Exit Class"));
        exitClassJB.addActionListener(closeClassScreenListener);
        exitClassJB.setBackground(Color.green);
        exitClassJB.setPreferredSize(new Dimension(130,40));
        //bl1.addActionListener();
        exitJP.add(exitClassJB,CENTER_ALIGNMENT);
        borderleft.add(exitJP);

        for (int i=0; i<7; i++) {
            whiteJL = new JLabel("");
            whiteJL.setBackground(Color.white);
            whiteJL.setOpaque(true);
            borderleft.add(whiteJL);
        }
        pane.add(borderleft);



        first = new JPanel(new GridLayout(8,1));
        laraJB = new JButton("Lara");
        maxJB= new JButton("Max");
        timJB= new JButton("Tim");
        lauraJB= new JButton("Laura");
        marcoJB= new JButton("Marco") ;
        lucaJB= new JButton("Luca");
        whiteTopJL = new JLabel("");
        whiteTopJL.setBackground(Color.white);
        whiteTopJL.setOpaque(true);
        whiteBottomJB = new JLabel("");
        whiteBottomJB.setBackground(Color.white);
        whiteBottomJB.setOpaque(true);

        AufrufListener al1 = new AufrufListener(laraJB);
        laraJB.addMouseListener(al1);
        laraJB.setBackground(Color.CYAN);

        AufrufListener al4 = new AufrufListener(marcoJB);
        marcoJB.addMouseListener(al4);
        marcoJB.setBackground(Color.CYAN);

        AufrufListener al5 = new AufrufListener(lucaJB);
        lucaJB.addMouseListener(al5);
        lucaJB.setBackground(Color.CYAN);

        first.add(whiteTopJL);
        first.add(laraJB);
        first.add(maxJB);
        first.add(timJB);
        first.add(lauraJB);
        first.add(marcoJB);
        first.add(lucaJB);
        first.add(whiteBottomJB);
        pane.add(first);



        second = new JPanel( new GridLayout(8,1));
        secondWhiteTopJL = new JLabel("");
        secondWhiteTopJL.setBackground(Color.white);
        secondWhiteTopJL.setOpaque(true);
        second.add(secondWhiteTopJL);

        jonasJB = new JButton("Jonas");
        jonasJB.setBackground(Color.cyan);
        second.add(jonasJB);

        AufrufListener al2 = new AufrufListener(jonasJB);

        for (int i=0; i<5; i++) {
            whiteJL = new JLabel("");
            whiteJL.setBackground(Color.white);
            whiteJL.setOpaque(true);
            second.add(whiteJL);
        }

        jonasJB.addMouseListener(al2);
        bord1 = new JPanel(new GridLayout(2,1));
        bord1.setBackground(Color.white);
        secondGreenBoardJL = new JLabel("");
        secondGreenBoardJL.setBackground(gr);
        secondGreenBoardJL.setOpaque(true);
        secondWhiteBoardJL = new JLabel("");
        secondWhiteBoardJL.setBackground(Color.white);
        secondWhiteBoardJL.setPreferredSize(new Dimension(130,40));
        secondWhiteBoardJL.setOpaque(true);
        bord1.add(secondWhiteBoardJL);
        bord1.add(secondGreenBoardJL);

        second.add(bord1 );
        pane.add(second);



        third = new JPanel( new GridLayout(8,1));
        thirdWhiteTopJL = new JLabel("");
        thirdWhiteTopJL.setBackground(Color.white);
        thirdWhiteTopJL.setOpaque(true);
        leonJB = new JButton("Leon");

        third.add(thirdWhiteTopJL);
        third.add(leonJB);

        for (int i=0; i<4; i++) {
            whiteJL = new JLabel("");
            whiteJL.setBackground(Color.white);
            whiteJL.setOpaque(true);
            third.add(whiteJL);
        }

        teacherJL = new JLabel(resourcebundle.getString("Teacher"), JLabel.CENTER);
        teacherJL.setForeground(Color.white);
        teacherJL.setBackground(Color.darkGray);
        teacherJL.setOpaque(true);
        thirdwhiteBoardJL = new JLabel("");
        thirdwhiteBoardJL.setBackground(Color.white);
        thirdwhiteBoardJL.setOpaque(true);

        bord2 = new JPanel(new GridLayout(2,1));
        greenboardJL = new JLabel(resourcebundle.getString("Board"),JLabel.CENTER);
        greenboardJL.setForeground(Color.white);
        greenboardJL.setBackground(gr);
        greenboardJL.setOpaque(true);
        bord2.add(thirdwhiteBoardJL);
        bord2.add(greenboardJL);

        third.add(teacherJL);
        third.add(bord2);
        pane.add(third);



        fourth = new JPanel( new GridLayout(8,1));
        fourthWhiteTopJL = new JLabel("");
        fourthWhiteTopJL.setBackground(Color.white);
        fourthWhiteTopJL.setOpaque(true);
        maximJL= new JButton("Maxim");
        maximJL.setBackground(Color.cyan);

        fourth.add(fourthWhiteTopJL);
        fourth.add(maximJL);

        for (int i=0; i<5; i++) {
            whiteJL = new JLabel("");
            whiteJL.setBackground(Color.white);
            whiteJL.setOpaque(true);
            fourth.add(whiteJL);
        }

        fourthWhiteJL = new JLabel("");
        fourthWhiteJL.setBackground(Color.white);
        fourthWhiteJL.setOpaque(true);

        AufrufListener al3 = new AufrufListener(maximJL);
        maximJL.addMouseListener(al3);

        bord3 = new JPanel(new GridLayout(2,1));
        fourthWhiteTopJL = new JLabel("");
        fourthWhiteTopJL.setBackground(gr);
        fourthWhiteTopJL.setOpaque(true);
        bord3.add(fourthWhiteJL);
        bord3.add(fourthWhiteTopJL);

        fourth.add(bord3);
        pane.add(fourth);


        fifth = new JPanel(new GridLayout(8,1));
        tomJB = new JButton("Tom");
        philippJB= new JButton("Philipp");
        noahJB = new JButton("Noah");
        robertJB= new JButton("Robert");
        claraJB= new JButton("Clara") ;
        sophiaJB= new JButton("Sophia");
        fifthWhiteTopJL = new JLabel("");
        fifthWhiteTopJL.setBackground(Color.white);
        fifthWhiteTopJL.setOpaque(true);
        fifthWhiteBottomJL = new JLabel("");
        fifthWhiteBottomJL.setBackground(Color.white);
        fifthWhiteBottomJL.setOpaque(true);

        fifth.add(fifthWhiteTopJL);
        fifth.add(tomJB);
        fifth.add(philippJB);
        fifth.add(noahJB);
        fifth.add(robertJB);
        fifth.add(claraJB);
        fifth.add(sophiaJB);
        fifth.add(fifthWhiteBottomJL);
        pane.add(fifth);



        sixth = new JPanel( new GridLayout(8,1));

        seventhwhiteBoardJL = new JLabel("");
        seventhwhiteBoardJL.setBackground(Color.white);
        seventhwhiteBoardJL.setOpaque(true);
        absentJL = new JLabel(resourcebundle.getString("absent"), JLabel.RIGHT);
        absentJL.setForeground(Color.red);
        absentJL.setBackground(Color.white);
        absentJL.setOpaque(true);

        sixth.add(seventhwhiteBoardJL);
        sixth.add(absentJL);

        for (int i=0; i<6; i++) {
            whiteJL = new JLabel("");
            whiteJL.setBackground(Color.white);
            whiteJL.setOpaque(true);
            sixth.add(whiteJL);
        }

        pane.add(sixth);


        seventh = new JPanel( new GridLayout(8,1));

        timerJL = new JLabel(dateS, JLabel.CENTER);
        timerJL.setBackground(Color.white);
        timerJL.setOpaque(true);
        timerJL.setForeground(Color.red);
        timerJL.setBorder(BorderFactory.createLineBorder(Color.red));

        Font f = new Font("SansSerif", Font.BOLD + Font.ITALIC, 16);
        timerJL.setFont(f);
        TimerCountdown timerCountdown = new TimerCountdown(timerJL);
        Color gr =  Color.WHITE;
        absentNamesJL = new JLabel("  Noah, Lily, Luis");
        absentNamesJL.setForeground(Color.red);
        absentNamesJL.setBackground(gr);
        absentNamesJL.setOpaque(true);
        lbl2 = new JLabel( "");
        timerHeadline = new JLabel(resourcebundle.getString("Time left"), JLabel.CENTER);
        timerHeadline.setBackground(gr);
        timerHeadline.setOpaque(true);

        dateJL = new JLabel(dateS);
        dateJL.setBackground(gr);
        dateJL.setOpaque(true);
        DateTimer dateTimer = new DateTimer(dateJL);
        seventh.add(dateJL);
        seventh.add(absentNamesJL);

        for (int i=0; i<3; i++) {
            whiteJL = new JLabel("");
            whiteJL.setBackground(Color.white);
            whiteJL.setOpaque(true);
            seventh.add(whiteJL);
        }


        seventhWhiteBottomJL = new JLabel("");
        seventhWhiteBottomJL.setBackground(Color.white);
        seventhWhiteBottomJL.setOpaque(true);

        seventh.add(timerHeadline);
        seventh.add(timerJL);
        seventh.add(seventhWhiteBottomJL);
        pane.add(seventh);


        setVisible(true);
    }
    public static void main (String [] args) {
        ClassScreen cs = new ClassScreen();

    }


    public  void closeFrame() {
        this.dispose();
    }

}
