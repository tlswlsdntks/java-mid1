package time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {
    public static void main(String[] args) {
        for (ChronoField value : ChronoField.values()) {
            System.out.println(value + ", range = " + value.range());
        }
        System.out.println();
        System.out.println("일 년은 몇 월? " + ChronoField.MONTH_OF_YEAR.range() + "월"); //1 - 12
        System.out.println("한 달은 며칠? " + ChronoField.DAY_OF_MONTH.range() + "일"); //1 - 28/31
    }
}
