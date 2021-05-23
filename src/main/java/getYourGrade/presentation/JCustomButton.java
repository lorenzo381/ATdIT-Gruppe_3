package getYourGrade.presentation;

import javax.swing.*;

public class JCustomButton extends JButton {
    int ID;
    String text;


    JCustomButton(String text, int ID) {
        super(text);
        this.ID = ID;


    }

    public int getID() {
        return ID;
    }


}
