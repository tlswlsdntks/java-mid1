package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
//        LocalDateTime ldt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("현재 시간대: " + ldt);
        System.out.println("현재 시간대 + 10년: " + ldt.plus(10, ChronoUnit.YEARS));
        System.out.println("현재 시간대 + 10년: " + ldt.plus(Period.ofYears(10)));
        System.out.println("현재 시간대 + 10년: " + ldt.plusYears(10));
    }
}
