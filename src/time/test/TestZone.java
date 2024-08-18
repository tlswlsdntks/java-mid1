package time.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        //ZonedDateTime seoul = ZonedDateTime.of(2024, 1, 1, 9, 0, 0, 0, ZoneId.of("Asia/Seoul"));
        ZonedDateTime seoul = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 0, 0, 0), ZoneId.of("Asia/Seoul"));
        ZonedDateTime london = seoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newYork = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간 = " + seoul);
        System.out.println("런던의 회의 시간 = " + london);
        System.out.println("뉴욕의 회의 시간 = " + newYork);
    }
}
