package library.gui;

import javax.swing.*;
import java.awt.*;
import java.io.File;


public class LogInScreen extends JFrame {
    JButton submitJB;
    JPasswordField passwordField;
    JTextField usernameField;
    JLabel thirdRowLeftJL, passwordJL, usernameJL, fourthRowLeftJL;
    Container pane;
    GridBagConstraints c;
    ImageIcon account;
    JPanel textJP, boxJP, combinedJP, thirdRowSubmitJP;


    public LogInScreen() {
       setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("LogInScreen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // setUndecorated(true);

        pane = getContentPane();
        pane.setBackground(Color.white);
        pane.setLayout(new GridBagLayout());
        c = new GridBagConstraints();


        /*________________________________________________________________0.Reihe_____________________________________*/

        thirdRowLeftJL = new JLabel();
        thirdRowLeftJL.setBackground(Color.white);
        thirdRowLeftJL.setOpaque(true);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.weighty = 3;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        c.ipady = 200;
        pane.add(thirdRowLeftJL, c);





        /*___________________________________________1. Reihe Mit Logo________________________________________________*/
        thirdRowLeftJL = new JLabel();
        thirdRowLeftJL.setLayout(new BorderLayout());
        thirdRowLeftJL.setBackground(Color.white);
        c.weightx = 2.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.ipady = 200;
        pane.add(thirdRowLeftJL, c);


        account = new ImageIcon(new File("./src/main/resources/account.png").getPath());

        account.setImage(account.getImage().getScaledInstance(225, 225, Image.SCALE_DEFAULT));
        thirdRowLeftJL = new JLabel(account, JLabel.CENTER);
        thirdRowLeftJL.setBackground(Color.white);
        thirdRowLeftJL.setOpaque(true);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.weighty = 1;
        c.gridx = 1;
        c.gridy = 1;
        c.ipady = 200;
        c.gridwidth = 1;
        c.gridheight = 1;
        pane.add(thirdRowLeftJL, c);

        thirdRowLeftJL = new JLabel();
        thirdRowLeftJL.setBackground(Color.white);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 1;
        c.ipady = 200;
        pane.add(thirdRowLeftJL, c);


        /*___________________________________________ 2 Reihe mit Feldern_____________________________________________*/

        thirdRowLeftJL = new JLabel();
        thirdRowLeftJL.setBackground(Color.white);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 2;
        c.ipady = 200;
        pane.add(thirdRowLeftJL, c);


        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 100;      //make this component tall
        c.weightx = 2;
        c.weighty = 10;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 1;
        c.gridy = 2;
        /* submitJB.setBorderPainted(false);*/
        passwordJL = new JLabel("Password:");
        passwordJL.setFont(new Font("SansSerif", Font.ITALIC, 24));
        usernameJL = new JLabel("Username: ");
        usernameJL.setFont(new Font("SansSerif", Font.ITALIC, 24));


        passwordField = new JPasswordField();
        usernameField = new JTextField();
        passwordField.setPreferredSize(new Dimension(150, 35));
        usernameField.setPreferredSize(new Dimension(150, 35));

        textJP = new JPanel(new GridLayout(2, 1, 0, 5));
        textJP.setBackground(Color.white);
        boxJP = new JPanel(new GridLayout(2, 1, 0, 5));
        boxJP.setBackground(Color.white);
        textJP.add(usernameJL);
        textJP.add(passwordJL);
        boxJP.add(usernameField);
        boxJP.add(passwordField);

        combinedJP = new JPanel(new FlowLayout());
        combinedJP.add(textJP);
        combinedJP.add(boxJP);
        combinedJP.setBackground(Color.white);
        pane.add(combinedJP, c);


        thirdRowLeftJL = new JLabel();
        thirdRowLeftJL.setBackground(Color.white);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.3;
        c.gridx = 2;
        c.gridy = 2;
        c.ipady = 200;
        pane.add(thirdRowLeftJL, c);

        /*_________________________________________3. Reihe___________________________________________________________*/
        thirdRowLeftJL = new JLabel();
        thirdRowLeftJL.setBackground(Color.white);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.7;
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 3;
        c.ipady = 200;
        pane.add(thirdRowLeftJL, c);


        thirdRowSubmitJP = new JPanel();
        thirdRowSubmitJP.setBackground(Color.white);
        submitJB = new JButton("Submit");
        submitJB.setPreferredSize(new Dimension(100, 40));
        submitJB.setBackground(Color.green);
        submitJB.setBorderPainted(false);
        submitJB.setVerticalAlignment(1);
        submitJB.addActionListener( new CloseLoginScreenListener(this,passwordField, usernameField));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;       //reset to default
        c.weighty = 1.0;
        c.anchor = GridBagConstraints.PAGE_END;
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 3;
        thirdRowSubmitJP.add(submitJB, JPanel.TOP_ALIGNMENT);
        pane.add(thirdRowSubmitJP, c);


        thirdRowLeftJL = new JLabel();
        thirdRowLeftJL.setBackground(Color.white);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 3;
        c.ipady = 200;
        pane.add(thirdRowLeftJL, c);

        /*___________________________________________4. Reihe_________________________________________________________*/
        fourthRowLeftJL = new JLabel();
        fourthRowLeftJL.setPreferredSize(new Dimension(10, 10));
        fourthRowLeftJL.setBackground(Color.white);
        fourthRowLeftJL.setOpaque(true);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.weighty = 15;
        c.gridwidth = 5;
        c.gridx = 0;
        c.gridy = 4;
        c.ipady = 200;
        pane.add(fourthRowLeftJL, c);

        setVisible(true);
    }
        public static void main(String[] args) {
            LogInScreen fenster = new LogInScreen();
        }


    public void closeFrame() {

        this.dispose();
    }

    public void loginfailed() {
        submitJB.setText("Login failed. Try again!");
        submitJB.setPreferredSize(new Dimension(200,40));
        submitJB.setBackground(Color.red);



    }


    }












