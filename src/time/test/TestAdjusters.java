package time.test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 11, 14);
        System.out.println("firstDayOfWeek = " + date.getDayOfWeek());

        LocalDate with = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("lastDayOfWeek = " + with.getDayOfWeek());
    }
}
