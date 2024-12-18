package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
//        LocalDate ld = LocalDate.of(2030, 1, 1);
        LocalDate ldt = LocalDate.now();
        System.out.println("특정 시간: " + ldt);
        System.out.println("특정 시간 + 10일: " + ldt.plus(Period.ofDays(10)));

        //시간 차이 계산
        Period between = Period.between(ldt, ldt.plus(Period.ofMonths(1)).plus(Period.ofDays(10)));
        System.out.println("특정 시간과 차이: " + between.getMonths() + "개월 " + between.getDays() + "일");
    }
}
