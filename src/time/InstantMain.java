package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        /**
         * 자바 8 Time API의 Instant 클래스는 시간을 타임스탬프로 다루기 위해서 사용한다.
         * 타임스탬프는 UTC 기준으로 1970년 1월 1일 0시 0분 0초를 숫자 0으로 정하고, 그로 부터 경과된 시간을 양수 또는 음수로 표현한다.
         */
        System.out.println("UTC 기준 타임스탬프: " + Instant.ofEpochSecond(0));
        System.out.println("현재 타임스탬프: " + Instant.now());
        System.out.println("현재 타임스탬프: " + Instant.from(ZonedDateTime.now()));
        System.out.println("현재 타임스탬프 + 1시간: " + Instant.now().plusSeconds(3600));
        System.out.println("UTC 기준 타임스탬프와 현재 타임스탬프의 차이: " + Instant.now().getEpochSecond() + "초");
    }
}
