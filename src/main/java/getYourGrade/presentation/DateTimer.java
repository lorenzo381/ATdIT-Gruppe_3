package getYourGrade.presentation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * the DateTimer makes sure the Date and the time on the ClassScreen are up-to-date
 *
 * @author Luca Isaak
 * @version 24.05.2021
 */

public class DateTimer {
    DateFormat dateFormat;
    Date date;
    String dateS;

    public DateTimer(JLabel dateJL) {
        Timer timer2 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dateFormat = new SimpleDateFormat();
                date = new Date();
                dateS = dateFormat.format(date);
                dateJL.setText(dateS);

            }
        });
        timer2.start();
    }
}