package part_01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by ryandesmond on 7/10/17.
 */


/*
    Write the code to create, parse modify and format a variety of dates and DateFormats.
 */
public class CreateCalendar {

    public static void main(String[] args) {

        // Create a Calendar object and set it's date to July 1, 2017.
        Calendar calendar = new GregorianCalendar (2017, 6, 1, 16, 00);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy HH:MM");
        dateFormat.setTimeZone(calendar.getTimeZone());


        // sout(date)
        System.out.println(dateFormat.format(calendar.getTime()) );


        // Subtract 4 hours from Calendar
        calendar.add(Calendar.HOUR, -4);

        // sout(date)
        System.out.println(dateFormat.format(calendar.getTime()) );

        // add 1 week to the date
        calendar.add(Calendar.DATE, 7);

        // sout(date)
        System.out.println(dateFormat.format(calendar.getTime()) );


        // demostrate modifying the format of the date at least two other ways,
        // (ie, "07-04-2017" or "Wed March 26 00:00:00 EST 2017")
        dateFormat = new SimpleDateFormat("EEEE dd-MM-yyyy HH:MM");
        dateFormat.setTimeZone(calendar.getTimeZone());

        // sout(date)
        System.out.println( dateFormat.format (calendar.getTime()) );
    }

}
