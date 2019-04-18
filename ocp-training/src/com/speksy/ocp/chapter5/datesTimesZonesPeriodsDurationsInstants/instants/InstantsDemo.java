package com.speksy.ocp.chapter5.datesTimesZonesPeriodsDurationsInstants.instants;

import java.time.*;

public class InstantsDemo {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // do some work - very good instead of System.currentTimeMillis()
        Instant later = Instant.now();
        System.out.println(later);
        Duration duration = Duration.between(now, later);
        System.out.println(duration.toMillis());

        LocalDate date = LocalDate.of(2016, 4, 1);
        LocalTime time = LocalTime.of(11, 55, 00);
        ZoneId zone = ZoneId.of("Europe/Helsinki");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
        Instant instant = zonedDateTime.toInstant();
        System.out.println("zonedDateTime: " + zonedDateTime);
        System.out.println("instant: " + instant);

        Instant instant1 = Instant.ofEpochSecond(100);
        System.out.println(instant1);
    }

}
