package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    public static void main(String[] args) {
        for (ChronoUnit value : ChronoUnit.values()) {
            System.out.println(value);
        }
        System.out.println();
        System.out.println("한 시간은 몇 초? " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("하루는 몇 초? " + ChronoUnit.DAYS.getDuration().getSeconds());

//        LocalTime lt1 = LocalTime.of(1, 10, 0);
//        LocalTime lt2 = LocalTime.of(1, 20, 0);
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = lt1.plusMinutes(10);
        System.out.println("특정 시간과 차이: " + ChronoUnit.SECONDS.between(lt1, lt2) + "초"); //600
        System.out.println("특정 시간과 차이: " + ChronoUnit.MINUTES.between(lt1, lt2) + "분"); //10
    }
}
