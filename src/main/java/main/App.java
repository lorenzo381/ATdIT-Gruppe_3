package main;

package GUI;

import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

import java.awt.image.*;


public class App extends JFrame {
    Container c;
    JComboBox noten;
    JCheckBox jcb;
    JButton fertig;
    JPasswordField pf;
    JTextField tf;
    ImageIcon account;
    JLabel jl, jlpassword, jlusername;
    JPanel jpPasswordAndUsername;
    private JTable table1;
    private JPanel panel1;

    public App() {
        c = getContentPane();
        c.setLayout(new BorderLayout ());
        account = new ImageIcon(getClass().getResource("account.png"));
        account.setImage(account.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));

        jpPasswordAndUsername = new JPanel(new GridLayout(2,2,10,0));
        jlpassword = new JLabel("Password:");
        jlusername = new JLabel("Username: ");
        pf = new JPasswordField();
        tf = new JTextField();

        jpPasswordAndUsername.add(jlusername);
        jpPasswordAndUsername.add(tf);
        jpPasswordAndUsername.add(jlpassword);
        jpPasswordAndUsername.add(pf);
        jpPasswordAndUsername.setMaximumSize(new Dimension(300,150));

        jpPasswordAndUsername.setPreferredSize(new Dimension(30,20));



        jl = new JLabel(account);
        c.add(jl,BorderLayout.CENTER);
        c.add(jpPasswordAndUsername, BorderLayout.SOUTH);


    }



    public static void main(String[] args) {
        App fenster = new App();
        fenster.setVisible(true);
        fenster.setSize(300, 150);
        fenster.setTitle("FarbButtons");
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}


