package enumeration;

public class DiscountService {
    public int discount(String grade, int price) {
        int disountPercent = 0;
        if (grade.equals("BASIC")) {
            disountPercent = 10;
        } else if (grade.equals("GOLD")) {
            disountPercent = 20;
        } else if (grade.equals("DIAMOND")) {
            disountPercent = 30;
        } else {
            System.out.println(grade + ": 할인X");
        }
        //GOLD → 10000 * (20 / 100) = 2000
        return price * disountPercent / 100;
    }
}
