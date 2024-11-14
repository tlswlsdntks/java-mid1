package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    public static void main(String[] args) {
        for (ChronoUnit value : ChronoUnit.values()) {
            System.out.println("value = " + value);
        }
        System.out.println();
        System.out.println("HOURS = " + ChronoUnit.HOURS);
        System.out.println("HOURS.duration = " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("DAYS = " + ChronoUnit.DAYS);
        System.out.println("DAYS.duration = " + ChronoUnit.DAYS.getDuration().getSeconds());

        //차이 구하기
        LocalTime lt1 = LocalTime.of(1, 10, 0);
        LocalTime lt2 = LocalTime.of(1, 20, 0);
        System.out.println("secondsBetween = " + ChronoUnit.SECONDS.between(lt1, lt2)); //600
        System.out.println("minutesBetween = " + ChronoUnit.MINUTES.between(lt1, lt2)); //10
    }
}
