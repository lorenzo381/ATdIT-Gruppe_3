package library.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimerCountdown {
    JLabel timerJL;
    DateFormat dateFormat;
    Date date;
    String dateS;

    public TimerCountdown(JLabel timerJL) {
        this.timerJL = timerJL;
        dateFormat = new SimpleDateFormat();
        date = new Date();
        dateS = dateFormat.format(date);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("CEST"));
        calendar.set(Calendar.HOUR_OF_DAY, 18);// for 6 hour
        calendar.set(Calendar.MINUTE, 0);// for 0 min
        calendar.set(Calendar.SECOND, 0);// for 0 sec
        calendar.set(2021, Calendar.MAY, 7);// for Date [year,month(0 to 11), date]

        long endOfLesson = calendar.getTimeInMillis();
        //long endOfLesson = System.currentTimeMillis() + 1000*60*45;

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
                long delta = endOfLesson - System.currentTimeMillis();
                timerJL.setText(sdf.format(new Date(delta)));
            }
        });
        timer.start();
    }
}
