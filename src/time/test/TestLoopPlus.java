package time.test;

import java.time.LocalDate;

public class TestLoopPlus {
    public static void main(String[] args) {
//        LocalDate ld = LocalDate.of(2024, 11, 14);
        LocalDate ld = LocalDate.now();
        for (int i = 0; i < 3; i++) {
            System.out.println("날짜 " + (i + 1) + ": " + ld.plusWeeks(i * 2));
        }
    }
}
