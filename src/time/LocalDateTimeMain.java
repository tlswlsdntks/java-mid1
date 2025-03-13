package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
//        LocalDateTime ldt1 = LocalDateTime.now();
//        LocalDateTime ldt2 = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = ldt1.plusYears(1);
        System.out.println("현재 시간대: " + ldt1);
        System.out.println("현재 시간대 + 1년: " + ldt2);
        System.out.println();

        //날짜와 시간의 분리/합체
        LocalTime lt = ldt1.toLocalTime();
        LocalDate ld = ldt1.toLocalDate();
        System.out.println("날짜 분리: " + ld);
        System.out.println("시간 분리: " + lt);
        System.out.println("날짜와 시간 합체: " + LocalDateTime.of(ld, lt));
        System.out.println();

        //특정 시간대 이후
        System.out.println("특정 시간대 + 1000일: " + ldt2.plusDays(1_000));
        System.out.println("특정 시간대 + 1년: " + ldt2.plusYears(1));
        System.out.println();
        
        //비교
        System.out.println("특정 날짜 이전인가? " + ldt1.isBefore(ldt2));
        System.out.println("특정 날짜 이후인가? " + ldt1.isAfter(ldt2));
        System.out.println("특정 날짜와 같은가? " + ldt1.isEqual(ldt2));
    }
}
