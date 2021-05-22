package getYourGrade.presentation;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class PickOnListener extends MouseAdapter {
    StudentGradeWindow sg;
    JCustomButton jb;


    public PickOnListener(JCustomButton jb) {
        this.jb = jb;

    }

    public void mouseClicked(MouseEvent e) {


        sg = new StudentGradeWindow(jb);

    }
}

