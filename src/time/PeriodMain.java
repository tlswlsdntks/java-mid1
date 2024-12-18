package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
//        LocalDate ld = LocalDate.of(2030, 1, 1);
        LocalDate ldt = LocalDate.now();
        System.out.println("현재 날짜: " + ldt);
        System.out.println("현재 날짜 + 10일: " + ldt.plus(Period.ofDays(10)));
        Period between = Period.between(ldt, ldt.plus(Period.ofDays(10)));
        System.out.println("특정 날짜와 차이: " + between.getMonths() + "개월 " + between.getDays() + "일");
    }
}
