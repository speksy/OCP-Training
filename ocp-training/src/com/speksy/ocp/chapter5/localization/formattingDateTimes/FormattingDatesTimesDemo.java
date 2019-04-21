package com.speksy.ocp.chapter5.localization.formattingDateTimes;

import java.time.*;
import java.time.format.*;
import java.util.Date;

public class FormattingDatesTimesDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfYear());

        // DateTimeFormatter
        LocalDate date2 = LocalDate.of(2020, Month.MARCH, 20);
        LocalTime time2 = LocalTime.of(11,12,34);
        LocalDateTime dateTime2 = LocalDateTime.of(date2,time2);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time2.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime2.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        // Predefined formats
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime2));
        System.out.println(shortDateTime.format(date2));
        // System.out.println(shortDateTime.format(time2));
        // UnsupportedTemporalTypeException: Unsupported field: MonthOfYear
        DateTimeFormatter shortDateTime2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTime2.format(shortDateTime2));
        System.out.println(date2.format(shortDateTime));
        // System.out.println(time2.format(shortDateTime));

        LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time3 = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime3 = LocalDateTime.of(date3, time3);
        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        // DateTimeFormatter fullF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        System.out.println(shortF.format(dateTime3));
        System.out.println(mediumF.format(dateTime3));
        // System.out.println(fullF.format(dateTime3)); java.time.DateTimeException: Unable to extract value: class java.time.LocalDateTime

        // Custom
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MMM dd, yyyy, hh:mm");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MM dd, yyyy, hh:mm");
        DateTimeFormatter f4 = DateTimeFormatter.ofPattern("M dd, yyyy, hh:mm:ss");
        System.out.println(dateTime3.format(f));
        System.out.println(dateTime3.format(f2));
        System.out.println(dateTime3.format(f3));
        System.out.println(dateTime3.format(f4));
        System.out.println(f.format(dateTime3));// the same
    }
}
