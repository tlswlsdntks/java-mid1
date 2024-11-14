package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        System.out.println("현재 시간날짜 = " + OffsetDateTime.now());

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println("지정 시간날짜 = " + ldt);
        System.out.println("시간 차이 표현 = " + OffsetDateTime.of(ldt, ZoneOffset.of("+01:00")));
    }
}
