package enumeration.ref1;

public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        /**
         * CTRL + ALT + N: INLINE VARIABLE
         */
        return price * classGrade.getDiscountPercent() / 100;
    }
}
