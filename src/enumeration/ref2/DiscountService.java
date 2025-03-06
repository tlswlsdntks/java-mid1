package enumeration.ref2;

public class DiscountService {
    public int discount(Grade grade, int price) {
        return price - price * grade.getDiscountPercent() / 100;
    }
}
