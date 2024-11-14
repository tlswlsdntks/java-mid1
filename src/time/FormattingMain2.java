package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        //포맷팅: 날짜와 시간을 문자로
        LocalDateTime ldt = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        System.out.println("현재 시간 = " + ldt);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = ldt.format(formatter);
        System.out.println("날짜와 시간 포맷팅 = " + formattedDateTime);

        //파싱: 문자를 날짜와 시간으로
        String dateTimeString = "2024-12-31 13:30:59";
        System.out.println("문자열 파싱 날짜와 시간 = " + LocalDateTime.parse(dateTimeString, formatter));
    }
}
