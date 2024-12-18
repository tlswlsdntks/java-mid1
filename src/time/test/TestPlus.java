package time.test;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {
//        LocalDateTime ldt1 = LocalDateTime.of(2024, 11, 14, 0, 0, 0);
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println("현재 시간대:" + ldt1);

        LocalDateTime ldt2 = ldt1.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("1년 2개월 3일 4시간 이후의 시간대:  " + ldt2);
    }
}
