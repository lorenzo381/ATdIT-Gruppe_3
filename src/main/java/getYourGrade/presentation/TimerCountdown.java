package getYourGrade.presentation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Thiss Class is resposible for the timer on the ClassScreen. It helps the teacher to see how much time is left.
 *
 * @author Luca isaak
 * @version 24.05.2021
 */

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
        calendar.set(Calendar.HOUR_OF_DAY, 18);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(2021, Calendar.MAY, 7);

        long endOfLesson = calendar.getTimeInMillis();


        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
                long delta = endOfLesson - System.currentTimeMillis();
                timerJL.setText(sdf.format(new Date(delta)));
            }
        }
        );
        timer.start();
    }
}
