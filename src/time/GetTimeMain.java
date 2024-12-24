package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
//        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("현재 시간대: " + ldt);
        System.out.println("년: " + ldt.get(ChronoField.YEAR));
        System.out.println("월: " + ldt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("일: " + ldt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("시: " + ldt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("분: " + ldt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("초: " + ldt.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println();

        //편의 메서드 제공
        System.out.println("년: " + ldt.getYear());
        System.out.println("월: " + ldt.getMonthValue());
        System.out.println("일: " + ldt.getDayOfMonth());
        System.out.println("시: " + ldt.getHour());
        System.out.println("분: " + ldt.getMinute());
        System.out.println("초: " + ldt.getSecond());
        System.out.println();

        //편의 메서드 없음
        System.out.println(ldt.getHour() + "시간 " + ldt.getMinute() + "분은 몇 분? " + ldt.get(ChronoField.MINUTE_OF_DAY) + "분");
        System.out.println(ldt.getHour() + "시간 " + ldt.getMinute() + "분 " +  + ldt.getSecond() + "초는 몇 초? " + ldt.get(ChronoField.SECOND_OF_DAY) + "초");
    }
}
