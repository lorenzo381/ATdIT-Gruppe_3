package getYourGrade.presentation;

import javax.swing.*;

public class JCustomButton extends JButton {
    int ID;
    String text;


    JCustomButton (String text, int ID) {
        super(text);
        this.ID = ID;

    }




    public int getID() {
        return  ID;
    }

    public static void main (String [] args) {
        JCustomButton jcb = new JCustomButton("Hallo", 4);
        System.out.println(jcb.getText());
        System.out.println(jcb.getID());


    }


    }
