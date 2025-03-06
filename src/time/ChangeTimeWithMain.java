package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
//        LocalDateTime ldt = LocalDateTime.of(2024, 11, 14, 13, 30, 59);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("현재 시간대: " + ldt);

        //불변객체 반환
        //년도 변경
        System.out.println("년도 변경 이후의 시간대: " + ldt.with(ChronoField.YEAR, 2025));
        System.out.println("년도 변경 이후의 시간대: " + ldt.withYear(2025));

        //다음주 금요일
        System.out.println("다음주 금요일의 시간대: " + ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));

        //이번 달 마지막 일요일
        System.out.println("이번 달 마지막 일요일의 시간대: " + ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)));
    }
}
