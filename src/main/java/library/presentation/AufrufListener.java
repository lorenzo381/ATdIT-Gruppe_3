package library.presentation;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class AufrufListener extends MouseAdapter {
    StudentGradeWindow sg;
    JButton jb;


    public AufrufListener(JButton jb) {
        this.jb = jb;

    }

    public void mouseClicked(MouseEvent e) {


        sg = new StudentGradeWindow(jb);

    }
}

