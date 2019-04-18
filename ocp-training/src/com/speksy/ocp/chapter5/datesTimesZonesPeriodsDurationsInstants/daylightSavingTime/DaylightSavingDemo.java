package com.speksy.ocp.chapter5.datesTimesZonesPeriodsDurationsInstants.daylightSavingTime;

import java.time.*;

public class DaylightSavingDemo {
    public static void main(String[] args) {
        // Example 1
        LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time = LocalTime.of(1, 30);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);

        System.out.println(dateTime);

        dateTime = dateTime.plusHours(1);

        System.out.println(dateTime);
        System.out.println();
        // Example 2
        LocalDate date1 = LocalDate.of(2016, Month.NOVEMBER, 6);
        LocalTime time1 = LocalTime.of(1, 30);
        ZoneId zone1 = ZoneId.of("US/Eastern");

        ZonedDateTime dateTime1 = ZonedDateTime.of(date1, time1, zone1);
        dateTime1 = dateTime1.plusHours(1);
        System.out.println(dateTime1);
        dateTime1 = dateTime1.plusHours(1);
        System.out.println(dateTime1);
    }
}
