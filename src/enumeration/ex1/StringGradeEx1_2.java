package enumeration.ex1;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10_000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC, price);
//        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인된 금액 = " + basic);
//        System.out.println("GOLD 등급의 할인된 금액 = " + gold);
        System.out.println("DIAMOND 등급의 할인된 금액 = " + diamond);

        /**
         * StringGrade에 있는 상수를 사용해야 한다는 명시가 필요하다.
         */
        //존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인된 금액 = " + vip);

        //오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인된 금액 = " + diamondd);

        //소문자
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인된 금액 = " + gold);
    }
}
