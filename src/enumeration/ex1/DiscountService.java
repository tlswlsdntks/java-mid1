package enumeration.ex1;

public class DiscountService {
    public int discount(String grade, int price) {
        int disountPercent = 0;
        if (grade.equals(StringGrade.BASIC)) {
            disountPercent = 10;
        } else if (grade.equals(StringGrade.GOLD)) {
            disountPercent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            disountPercent = 30;
        } else {
            System.out.println(grade + ": 할인X");
        }
        return price - price * disountPercent / 100;
    }
}
