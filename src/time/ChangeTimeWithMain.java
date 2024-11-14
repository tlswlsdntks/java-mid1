package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024, 11, 14, 13, 30, 59);
        System.out.println("dt = " + dt);

        //불변객체 반환
        System.out.println("년도 변경 = " + dt.with(ChronoField.YEAR, 2025));
        System.out.println("년도 변경 = " + dt.withYear(2025));

        //다음주 금요일
        System.out.println("다음 금요일 = " + dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));

        //이번 달의 마지막 일요일
        System.out.println("같은 달의 마지막 일요일 = " + dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)));
    }
}
