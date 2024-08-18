package time.test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 24;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 1);
        System.out.println("firstDayOfWeek = " + date.getDayOfWeek());
        LocalDate with = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("lastDayOfWeek = " + with.getDayOfWeek());
    }
}
