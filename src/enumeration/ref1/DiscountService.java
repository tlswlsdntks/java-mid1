package enumeration.ref1;

public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        /**
         * CTRL + ALT + N: INLINE VARIABLE
         */
        //GOLD → 10000 * (20 / 100) = 2000
        return price * classGrade.getDiscountPercent() / 100;
    }
}
