package eu.corstjens.java8;

import org.junit.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Koen on 20/04/2016.
 */
public class DateParseFormatExample {

    @Test
    public void parse() {
        //Format examples
        LocalDate date = LocalDate.now();
        //default format
        System.out.println("Default format of LocalDate: " + date);
        //specific format
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));


        LocalDateTime dateTime = LocalDateTime.now();
        //default format
        System.out.println("Default format of LocalDateTime: " + dateTime);
        //specific format
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));

        System.out.println("Date formatted for Flanders " + dateTime.format(DateTimeFormatter.ofPattern("dd.MM.uuuu")));
        System.out.println("Date formatted for The Netherlands " + dateTime.format(DateTimeFormatter.ofPattern("dd-MM-uuuu")));
        System.out.println("for more info see https://en.wikipedia.org/wiki/Date_format_by_country");

        Instant currentTimestamp = Instant.now();
        //default format
        System.out.println("Default format of current timestamp: " + currentTimestamp);

        //Parse examples
        LocalDateTime dt = LocalDateTime.parse("27::03::2014 21::39::48",
                DateTimeFormatter.ofPattern("d::MM::uuuu HH::mm::ss"));
        System.out.println("Default format after parsing: " + dt);
    }

}
