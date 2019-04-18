package com.speksy.ocp.chapter5.datesTimesZonesPeriodsDurationsInstants.manupulatingDatesTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ManipulatingDatesTimes {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2019, Month.JANUARY, 20);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusWeeks(2);
        System.out.println(date);
        date = date.plusYears(5);
        System.out.println(date);

        // Chaining

        LocalDate date1 = LocalDate.of(2020, 1 , 20);
        LocalTime time1 = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date1, time1)
                .minusDays(1).minusHours(10).minusSeconds(30);

        System.out.println(dateTime);

        LocalDate date2 = LocalDate.of(2020, 1 ,20);
        // date2 = date2.plusMinutes(1); DOES NOT COMPILE
    }
}
