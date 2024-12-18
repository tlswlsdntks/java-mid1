package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("지역 시간대: " + zdt);
        System.out.println("지역 시간대: " + ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Seoul")));
        System.out.println("지역 시간대: " + ZonedDateTime.of(2024, 12, 18, 16, 31, 0, 0, ZoneId.of("Asia/Seoul")));
        System.out.println("타임존 변경: " + zdt.withZoneSameInstant(ZoneId.of("UTC")));
    }
}
