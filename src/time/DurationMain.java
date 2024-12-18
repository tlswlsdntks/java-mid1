package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
//        LocalTime lt1 = LocalTime.of(1, 0);
        LocalTime lt1 = LocalTime.now();
        System.out.println("특정 시간: " + lt1);
        System.out.println("특정 시간 + 30분: " + lt1.plus(Duration.ofMinutes(30)));

        //시간 차이 계산
//        LocalTime lt1 = LocalTime.of(9, 0);
//        LocalTime lt2 = LocalTime.of(10, 0);
        LocalTime lt2 = lt1.plusHours(1);
        LocalTime lt3 = lt2.plusHours(1);
        Duration between = Duration.between(lt2, lt3);
        System.out.println("특정 시간과 차이: " + between.getSeconds() + "초");
        System.out.println("특정 시간과 차이: " + between.toHours() + "시간 " + between.toMinutesPart() + "분");
    }
}
