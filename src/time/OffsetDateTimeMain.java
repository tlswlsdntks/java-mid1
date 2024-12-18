package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
//        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println("현재 지역 시간대: " + OffsetDateTime.now());
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("현재 시간대: " + ldt);
        System.out.println("지역 시간대의 차이 표현: " + OffsetDateTime.of(ldt, ZoneOffset.of("+01:00")));
    }
}
