package time;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        //사용 가능한 타임존
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }
        System.out.println();
        System.out.println("시스템 기본 타임존: " + ZoneId.systemDefault());
        System.out.println("타임존 생성: " + ZoneId.of("Asia/Seoul"));
    }
}
