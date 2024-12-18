package time.test;

import java.time.*;

public class TestZone {
    public static void main(String[] args) {
//        ZonedDateTime seoul = ZonedDateTime.of(2024, 1, 1, 9, 0, 0, 0, ZoneId.of("Asia/Seoul"));
//        ZonedDateTime seoul = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 0, 0, 0), ZoneId.of("Asia/Seoul"));
        ZonedDateTime seoul = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Seoul"));
        ZonedDateTime london = seoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newYork = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울 시간: " + seoul);
        System.out.println("런던 시간: " + london);
        System.out.println("뉴욕 시간: " + newYork);
    }
}
