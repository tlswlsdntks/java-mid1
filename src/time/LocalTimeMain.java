package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
//        LocalTime lt1 = LocalTime.now();
//        LocalTime lt2 = LocalTime.of(9, 10, 30);
        LocalTime lt1 = LocalTime.now();
        System.out.println("현재 시간: " + lt1);
        System.out.println("현재 시간 + 30초: " + lt1.plusSeconds(30));
    }
}
