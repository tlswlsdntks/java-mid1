package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
//        LocalDate ld1 = LocalDate.of(2024, 11, 14);
//        LocalDate ld2 = LocalDate.of(2024, 11, 21);
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = ld1.plusYears(1).plusMonths(2).plusDays(3);
        System.out.println("현재 날짜: " + ld1);
        System.out.println("특정 날짜: " + ld2);

        Period period = Period.between(ld1, ld2);
        System.out.println("남은 기간: " + period.getYears() + "년 " + period.getMonths() + "개월 " + period.getDays() + "일");

        long daysBetween = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println("디데이: " + daysBetween + "일 남음");
    }
}
