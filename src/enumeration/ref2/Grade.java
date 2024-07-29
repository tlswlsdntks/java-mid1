package enumeration.ref2;

public enum Grade {
    BASIC(30), GOLD(10), DIAMOND(20);
    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
