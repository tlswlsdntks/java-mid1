package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        //포맷팅: 날짜를 문자로
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("현재 시간 = " + date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        System.out.println("날짜와 시간 포맷팅 = " + date.format(formatter));

        //파싱: 문자를 날짜로
        String input = "2024년 12월 31일";
        System.out.println("문자열 파싱 날짜와 시간 = " + LocalDate.parse(input, formatter));
    }
}
