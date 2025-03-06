package enumeration.ex3;

import enumeration.ex2.ClassGrade;

public class ClassGradeEx3_2 {
    public static void main(String[] args) {
        int price = 10_000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인된 금액 = " + basic);
        System.out.println("GOLD 등급의 할인된 금액 = " + gold);
        System.out.println("DIAMOND 등급의 할인된 금액 = " + diamond);

        //존재하지 않는 등급
//        Grade newClassGrade = new Grade(); //enum types may not be instantiated
//        int result = discountService.discount(newClassGrade, price);
//        System.out.println("NEW_CLASS_GRADE 등급의 할인된 금액 = " + newClassGrade);
    }
}
