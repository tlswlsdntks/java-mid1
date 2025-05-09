package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("년도를 입력하세요: ");
//        int year = scanner.nextInt();
//        System.out.print("월을 입력하세요: ");
//        int month = scanner.nextInt();

        LocalDate ld = LocalDate.now();
        int year = ld.getYear();
        int month = ld.getMonthValue();
        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        //월요일(1%7=1) .. 일요일(7%7=0)
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;
        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        while (firstDayOfMonth.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%2d ", firstDayOfMonth.getDayOfMonth());
            if (firstDayOfMonth.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                System.out.println();
            }
            firstDayOfMonth = firstDayOfMonth.plusDays(1);
        }
    }
}
