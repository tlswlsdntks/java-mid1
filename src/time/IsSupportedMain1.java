package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println("한 시간은 몇 초? " + ld.get(ChronoField.SECOND_OF_MINUTE)); //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException
    }
}
