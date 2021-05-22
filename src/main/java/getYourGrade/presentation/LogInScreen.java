package getYourGrade.presentation;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ResourceBundle;

public class LogInScreen extends JFrame {
    JButton submitJB;
    JPasswordField passwordField;
    JTextField usernameField;
    JLabel zerothRowJL, thirdRowLeftJL, secondRowRightJL, passwordJL, usernameJL, fourthRowJL;
    Container pane;
    GridBagConstraints c;
    ImageIcon account;
    JPanel textJP, boxJP, combinedJP, thirdRowSubmitJP;
    addJlToGridBackLayout addJl;
    private ResourceBundle resourcebundle = ResourceBundle.getBundle("i18n/presentation");


    public LogInScreen() {
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setTitle(resourcebundle.getString("LogInScreen"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);

        pane = getContentPane();
        pane.setBackground(Color.white);
        pane.setLayout(new GridBagLayout());
        c = new GridBagConstraints();


        /*______________________________________________________________________0.Reihe_____________________________________*/

        zerothRowJL = new JLabel();
        addJl = new addJlToGridBackLayout();
        addJl.addJlHorizontalToGridBackLayout(pane, c, zerothRowJL, 0, 0, 1, 3, 5, 200, Color.white);




        /*___________________________________________1. Reihe Mit Logo______________________________________________________*/

        account = new ImageIcon(new File("./src/main/resources/images/account.png").getPath());
        addJl = new addJlToGridBackLayout();
        addJl.addJlWithIconHorizontalToGridBackLayout(pane, c, account, 225, 225, 1, 1, 0.5, 1, 1, 200, Color.white);




        /*___________________________________________ 2 Reihe mit Feldern___________________________________________________*/


        passwordJL = new JLabel(resourcebundle.getString("Password"));
        passwordJL.setFont(new Font("SansSerif", Font.ITALIC, 24));
        usernameJL = new JLabel(resourcebundle.getString("Username"));
        usernameJL.setFont(new Font("SansSerif", Font.ITALIC, 24));

        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 100;
        c.weightx = 2;
        c.weighty = 10;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 1;
        c.gridy = 2;

        passwordJL = new JLabel(resourcebundle.getString("Password"));
        passwordJL.setFont(new Font("SansSerif", Font.ITALIC, 24));
        usernameJL = new JLabel(resourcebundle.getString("Username"));
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

        //PLATZHALTER NACH RECHTS
        secondRowRightJL = new JLabel();
        addJl = new addJlToGridBackLayout();
        addJl.addJlHorizontalToGridBackLayout(pane, c, secondRowRightJL, 2, 2, 1.7, 1, 1, 200, Color.white);


        /*______________________________________________3. Reihe____________________________________________________________*/
        //PLATZHALTER NACH LINKS
        thirdRowLeftJL = new JLabel();
        addJl = new addJlToGridBackLayout();
        addJl.addJlHorizontalToGridBackLayout(pane, c, thirdRowLeftJL, 0, 3, 1.7, 1, 1, 200, Color.white);


        thirdRowSubmitJP = new JPanel();
        thirdRowSubmitJP.setBackground(Color.white);
        submitJB = new JButton(resourcebundle.getString("Submit"));
        submitJB.setPreferredSize(new Dimension(100, 40));
        submitJB.setBackground(Color.green);
        submitJB.setBorderPainted(false);
        submitJB.setVerticalAlignment(1);
        submitJB.addActionListener(new CloseLoginScreenListener(this, passwordField, usernameField));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;       //reset to default
        c.weighty = 1.0;
        c.anchor = GridBagConstraints.PAGE_END;
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 3;
        thirdRowSubmitJP.add(submitJB, JPanel.TOP_ALIGNMENT);
        pane.add(thirdRowSubmitJP, c);



        /*____________________________________________4. Reihe______________________________________________________________*/
        fourthRowJL = new JLabel();
        addJl = new addJlToGridBackLayout();
        addJl.addJlHorizontalToGridBackLayout(pane, c, fourthRowJL, 0, 4, 1, 15, 5, 200, Color.white);


        setVisible(true);
    }

    public static void main(String[] args) {
        LogInScreen fenster = new LogInScreen();
    }


    public void closeFrame() {

        this.dispose();
    }

    public void loginfailed() {
        submitJB.setText(resourcebundle.getString("Login failed. Try again!"));
        submitJB.setPreferredSize(new Dimension(200, 40));
        submitJB.setBackground(Color.red);
    }


}


