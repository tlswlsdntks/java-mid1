package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("현재 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);
        System.out.println("지정 날짜 + 10일 = " + ofDate.plusDays(10));
    }
}
