package library.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloseClassScreenListener implements ActionListener {
    ClassScreen classscreen;
    StudentOverviewScreen so;

    public CloseClassScreenListener(ClassScreen classscreen) {
        this.classscreen = classscreen;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        classscreen.closeFrame();
        so = new StudentOverviewScreen();

    }

}
