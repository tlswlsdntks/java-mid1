package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class DiscountService {
    public int discount(Grade grade, int price) {
        int disountPercent = 0;
        if (grade == BASIC) {
            disountPercent = 10;
        } else if (grade == GOLD) {
            disountPercent = 20;
        } else if (grade == DIAMOND) {
            disountPercent = 30;
        } else {
            System.out.println("할인X");
        }
        return price - price * disountPercent / 100;
    }
}
