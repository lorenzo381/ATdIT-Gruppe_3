package library.presentation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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