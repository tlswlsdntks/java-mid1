package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        if (ld.isSupported(ChronoField.SECOND_OF_MINUTE)) {
            System.out.println("한 시간은 몇 초: " + ld.get(ChronoField.SECOND_OF_MINUTE));
        }
    }
}
