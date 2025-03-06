package enumeration.ex2;

public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        int disountPercent = 0;
        if (classGrade == ClassGrade.BASIC) { //classGrade == x001
            disountPercent = 10;
        } else if (classGrade == ClassGrade.GOLD) { //classGrade == x002
            disountPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) { //classGrade == x003
            disountPercent = 30;
        } else {
            System.out.println("할인X");
        }
        return price - price * disountPercent / 100;
    }
}
