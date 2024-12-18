package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
//        LocalDateTime ldt = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("특정 시간: " + ldt);

        //포맷
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //포맷팅: 날짜 → 문자
        System.out.println("특정 시간 포맷팅: " + ldt.format(formatter));

        //파싱: 문자 → 날짜
        System.out.println("특정 시간 파싱: " + LocalDateTime.parse("2024-12-18 15:44:10", formatter));
    }
}
