package eu.corstjens.java8;

import org.junit.Before;
import org.junit.Test;

import java.time.*;

/**
 * Created by Koen on 20/04/2016.
 */
public class DateTimeExamples {
    @Before
    public void initialize() {
        System.out.println();
    }

    @Test
    public void localDateExample() {
        //Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);

        //Creating LocalDate by providing input arguments
        LocalDate firstDay_2017 = LocalDate.of(2017, Month.JANUARY, 1);
        System.out.println("First day of 2017: " + firstDay_2017);

        //Current date in Windhoek, you can get it from ZoneId javadoc
        LocalDate todayWindhoek = LocalDate.now(ZoneId.of("Africa/Windhoek"));
        System.out.println("Current Date in Windhoek: " + todayWindhoek);

        //Getting date from the base date i.e 01/01/1970
        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("365th day from base date: " + dateFromBase);

        LocalDate hundredDay2017 = LocalDate.ofYearDay(2017, 100);
        System.out.println("100th day of 2017: " + hundredDay2017);
    }

    @Test
    public void localTimeExample() {
        //Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        //Creating LocalTime by providing input arguments
        LocalTime specificTime = LocalTime.of(18, 20, 25, 40);
        System.out.println("Specific Time of Day: " + specificTime);

        //Current date in "Africa/Windhoek", you can get it from ZoneId javadoc
        LocalTime timeWindhoek = LocalTime.now(ZoneId.of("Africa/Windhoek"));
        System.out.println("Current Time in Windhoek: " + timeWindhoek);

        //Getting date from the base date i.e 01/01/1970
        LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);
        System.out.println("10000th second time: " + specificSecondTime);
    }

    @Test
    public void localDateTimeExample() {
        //Current Date
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Current DateTime: " + today);

        //Current Date using LocalDate and LocalTime
        today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("Current DateTime: " + today);

        //Creating LocalDateTime by providing input arguments
        LocalDateTime specificDate = LocalDateTime.of(2014, Month.JANUARY, 1, 10, 10, 30);
        System.out.println("Specific Date: " + specificDate);


        //Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
        LocalDateTime todayWindhoek = LocalDateTime.now(ZoneId.of("Africa/Windhoek"));
        System.out.println("Current Date in Windhoek: " + todayWindhoek);

        //Getting date from the base date i.e 01/01/1970
        LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(10000, 0, ZoneOffset.UTC);
        System.out.println("10000th second time from 01/01/1970: " + dateFromBase);

    }
}
