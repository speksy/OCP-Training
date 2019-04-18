package com.speksy.ocp.chapter5.datesTimesZonesPeriodsDurationsInstants.creatingDateTime;

import java.time.*;

public class CreateDateTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        // Date creation
        LocalDate date1 = LocalDate.of(2019, Month.APRIL, 17);
        LocalDate date2 = LocalDate.of(2019, 4, 17);

        System.out.println(date1);
        System.out.println(date2);

        // Create time
        LocalTime time1 = LocalTime.of(6, 15);
        LocalTime time2 = LocalTime.of(6, 15, 30);
        LocalTime time3 = LocalTime.of(6, 15, 30, 200);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        // Create date time
        LocalDateTime dateTime1 = LocalDateTime.of(2019, Month.APRIL, 20, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

        System.out.println(dateTime1);
        System.out.println(dateTime2);

        // Create Zoned date time
        ZoneId zone = ZoneId.of("Europe/Helsinki");
        ZonedDateTime zoned1 = ZonedDateTime.of(2019, 1, 20, 6, 15, 30, 200, zone);
        ZonedDateTime zoned2 = ZonedDateTime.of(date1, time1, zone);
        ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1, zone);

        System.out.println(zone);
        System.out.println(zoned1);
        System.out.println(zoned2);
        System.out.println(zoned3);

        // Finding a Time Zone
        ZoneId.getAvailableZoneIds().stream()
                .filter(z -> z.contains("US") || z.contains("Europe"))
                .sorted().forEach(System.out::println);

        // LocalDate d = new LocalDate(); !! DOES NOT COMPILE
    }
}
