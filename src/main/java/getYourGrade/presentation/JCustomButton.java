package getYourGrade.presentation;

import javax.swing.*;

/**
 * This class is a customized JButton representing the tables in the class, which has the additional information ID.
 * This additional parameter is needed because in the ClassScreen the "Tables" the students are seated are JButtons.
 * This JButton has to contain two informations, the Name (so the teacher knows who is raising his hand) and the ID,
 * so that the Program can set the Grade, the teacher is giving, for the right student
 *
 * @author Luca Isaak
 * @version 24.05.2021
 */

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
