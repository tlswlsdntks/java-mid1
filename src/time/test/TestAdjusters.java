package time.test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
//        LocalDate ld1 = LocalDate.of(2024, 11, 14);
        LocalDate ld1 = LocalDate.now();
        System.out.println("특정 날짜: " + ld1 +", 요일: " + ld1.getDayOfWeek());

        LocalDate ld2 = ld1.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("특정 날짜: " + ld2 +", 요일: " + ld2.getDayOfWeek());
    }
}
