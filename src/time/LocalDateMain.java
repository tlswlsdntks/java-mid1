package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
//        LocalDate ld1 = LocalDate.now();
//        LocalDate ld2 = LocalDate.of(2013, 11, 21);
        LocalDate ld1 = LocalDate.now();
        System.out.println("특정 날짜: " + ld1);
        System.out.println("특정 날짜 + 10일: " + ld1.plusDays(10));
    }
}
