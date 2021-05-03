package GUI;

import java.awt.*;
import javax.swing.*;


public class CardLayoutTest extends JFrame {
    JButton button;
    JPasswordField pf;
    JTextField tf;
    JLabel jl,jlpassword, jlusername, jlBox, jlText;
    Container pane;
    GridBagConstraints c;
    ImageIcon account;
    JPanel jpText , jpBox, jpCombined, jp;


    public CardLayoutTest() {
        pane = getContentPane();
        pane.setBackground(Color.white);
        pane.setLayout(new GridBagLayout());
         c = new GridBagConstraints();

/*______________________________________________________________________0.Reihe_____________________________________*/

        jl = new JLabel();
        jl.setBackground(Color.white);
        jl.setOpaque(true);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.weighty = 1;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        c.ipady = 200;
        pane.add(jl, c);





        /*___________________________________________1. Reihe Mit Logo__________________________________________________________________________*/
        jl = new JLabel();
        jl.setLayout(new BorderLayout());
        jl.setBackground(Color.white);
        c.weightx = 2.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.ipady = 200;
        pane.add(jl, c);


       // jl = new JLabel();
        account = new ImageIcon(getClass().getResource("account.png"));
        jl = new JLabel(account, JLabel.CENTER);
        account.setImage(account.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        jl.setBackground(Color.white);
        jl.setOpaque(true);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.weighty = 10;
        c.gridx = 1;
        c.gridy = 1;
        c.ipady = 200;
        c.gridwidth = 1;
        c.gridheight =1;
        pane.add(jl, c);

       jl = new JLabel();
       jl.setBackground(Color.white);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 1;
        c.ipady = 200;
        pane.add(jl, c);


 /*___________________________________________ 2 Reihe mit Feldern______________________________________________________________________________*/

        jl = new JLabel();
        jl.setBackground(Color.white);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 2;
        c.ipady = 200;
        pane.add(jl, c);



        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 100;      //make this component tall
        c.weightx = 2;
        c.weighty = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 1;
        c.gridy = 2;
       /* button.setBorderPainted(false);*/
        jlpassword = new JLabel("Password:");
        jlpassword.setFont(new Font("SansSerif", Font.ITALIC, 24));
        jlusername = new JLabel("Username: ");
        jlusername.setFont(new Font("SansSerif", Font.ITALIC, 24));


        pf = new JPasswordField();
        tf = new JTextField();
        pf.setPreferredSize(new Dimension(150,35));
        tf.setPreferredSize( new Dimension (150,35));

        jpText = new JPanel (new GridLayout(2,1,0,5));
        jpText.setBackground(Color.white);
        jpBox = new JPanel(new GridLayout(2,1,0,5));
        jpBox.setBackground(Color.white);
        jpText.add(jlusername);
        jpText.add(jlpassword);
        jpBox.add(tf);
        jpBox.add(pf);

        jpCombined = new JPanel(new FlowLayout());
        jpCombined.add(jpText);
        jpCombined.add(jpBox);
        jpCombined.setBackground(Color.white);
        pane.add(jpCombined, c);


        jl = new JLabel();
        jl.setBackground(Color.white);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.3;
        c.gridx = 2;
        c.gridy = 2;
        c.ipady = 200;
        pane.add(jl, c);

 /*_________________________________________3. Reihe____________________________________________________________*/
        jl = new JLabel();
        jl.setBackground(Color.white);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.7;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 3;
        c.ipady = 200;
        pane.add(jl, c);



        jp = new JPanel();
        jp.setBackground(Color.white);
        button = new JButton("Submit");        button.setPreferredSize(new Dimension(100,40));
        button.setBackground(Color.green);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;       //reset to default
        //c.weighty = 1.0;   //request any extra vertical space
        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
       // c.insets = new Insets(10, 0, 0, 0);  //top padding
        c.gridx = 1;       //aligned with button 2
        c.gridwidth = 1;   //2 columns wide
        c.gridy = 3;       //third row
        jp.add(button, JPanel.TOP_ALIGNMENT);
        pane.add(jp, c);


        jl = new JLabel();
        jl.setBackground(Color.white);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 3;
        c.ipady = 200;
        pane.add(jl, c);

        /*___________________________________________4. Reihe______________________________________________________________*/
        jl = new JLabel();
        jl.setPreferredSize(new Dimension(10,10));
        jl.setBackground(Color.white);
        jl.setOpaque(true);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.weighty = 10;
        c.gridwidth = 5;
        c.gridx = 0;
        c.gridy = 4;
        c.ipady = 200;
        pane.add(jl, c);
    }

    public static void main(String[] args) {
        CardLayoutTest fenster = new CardLayoutTest();
        fenster.setVisible(true);
        fenster.setSize(300, 150);
        fenster.setTitle("FarbButtons");
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
