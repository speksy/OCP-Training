package com.speksy.ocp.chapter5.datesTimesZonesPeriodsDurationsInstants.periods;

import java.time.LocalDate;
import java.time.Period;

public class PeriodsDemo {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2011, 3, 1);
        LocalDate end = LocalDate.of(2012, 3, 1);
        performAnimalEnrichment(start, end);
        Period period = Period.ofMonths(1);
        performAnimalEnrichment2(start, end, period);

        // Prints period
        System.out.println(Period.of(0, 20, 47));

        System.out.println(Period.ofWeeks(3));
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1);
        }
    }

    private static void performAnimalEnrichment2(LocalDate start, LocalDate end,
                                                 Period period) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }
}
