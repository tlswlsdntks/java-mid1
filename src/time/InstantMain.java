package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        //UTC 기준
        System.out.println("now = " + Instant.now());
        System.out.println("from = " + Instant.from(ZonedDateTime.now()));

        //1970년 1월 1일
        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        //한 시간 이후
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        //지난 시간(초)
        System.out.println("laterEpochSecond = " + later.getEpochSecond());
    }
}
