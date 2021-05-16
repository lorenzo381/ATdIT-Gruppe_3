package library.presentation;

import javax.swing.*;

public class JCustomButton extends JButton {
    int id;
    String text;


    JCustomButton (String text, int id) {
        super(text);
        this.id = id;

    }




    public int getID() {
        return  id;
    }

    public static void main (String [] args) {
        JCustomButton jcb = new JCustomButton("Hallo", 4);
        System.out.println(jcb.getText());
        System.out.println(jcb.getID());


    }


    }
