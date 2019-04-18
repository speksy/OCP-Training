package com.speksy.ocp.chapter5.datesTimesZonesPeriodsDurationsInstants.durations;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationsDemo {
    public static void main(String[] args) {
        Duration daily = Duration.ofDays(1);
        Duration hours = Duration.ofHours(1);
        Duration everyMinute = Duration.ofMinutes(1);
        Duration everySeccond = Duration.ofSeconds(10);
        Duration everyMilli = Duration.ofMillis(1);
        Duration everyNano = Duration.ofNanos(1);

        System.out.println(daily);
        System.out.println(hours);
        System.out.println(everyMinute);
        System.out.println(everySeccond);
        System.out.println(everyMilli);
        System.out.println(everyNano);

        //ChronoUnit

        Duration daily1 = Duration.of(1, ChronoUnit.DAYS);
        Duration hourly1 = Duration.of(1, ChronoUnit.HOURS);
        Duration everyMinute1 = Duration.of(1, ChronoUnit.MINUTES);
        Duration everyTenSeconds1 = Duration.of(10, ChronoUnit.SECONDS);
        Duration everyMilli1 = Duration.of(1, ChronoUnit.MILLIS);
        Duration everyNano1 = Duration.of(1, ChronoUnit.NANOS);

        System.out.println(daily1);
        System.out.println(hourly1);
        System.out.println(everyMinute1);
        System.out.println(everyTenSeconds1);
        System.out.println(everyMilli1);
        System.out.println(everyNano1);

        LocalTime one = LocalTime.of(5, 15);
        LocalTime two = LocalTime.of(6, 30);
        LocalDate date = LocalDate.of(2016, 1, 20);

        System.out.println(ChronoUnit.HOURS.between(one, two));
        System.out.println(ChronoUnit.MINUTES.between(one, two));
//        System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException
    }
}
