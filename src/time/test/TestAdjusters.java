package time.test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;
        LocalDate lt = LocalDate.of(year, month, 1);
        System.out.println("firstDayOfWeek = " + lt.getDayOfWeek());
        System.out.println("lastDayOfWeek = " + lt.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek());
    }
}
