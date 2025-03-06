package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
//        LocalDate ld = LocalDate.of(2024, 12, 31);
        LocalDate ld = LocalDate.now();
        System.out.println("현재 날짜: " + ld);

        //포맷
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");

        //포맷팅: 날짜 → 문자
        System.out.println("현재 날짜 포맷팅: " + ld.format(formatter));

        //파싱: 문자 → 날짜
        System.out.println("특정 날짜 파싱: " + LocalDate.parse("2024년 12월 31일", formatter));
    }
}
