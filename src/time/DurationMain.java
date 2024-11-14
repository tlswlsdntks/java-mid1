package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("현재 시간 = " + lt);
        System.out.println("지정 시간 + 30분 = " + lt.plus(Duration.ofMinutes(30)));

        //시간 차이
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(10, 0);
        Duration between = Duration.between(start, end);
        System.out.println("차이: " + between.getSeconds() + "초");
        System.out.println("근무 시간: " + between.toHours() + "시간 " + between.toMinutesPart() + "분");
    }
}
