package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액 = " + basic);
        System.out.println("GOLD 등급의 할인 금액 = " + gold);
        System.out.println("DIAMOND 등급의 할인 금액 = " + diamond);

        /**
         * private 생성자를 추가함으로써 컴파일 에러 발생을 유발하여, 타입 안전 열거형 패턴을 완성할 수 있다.
         */
        //존재하지 않는 등급
//        ClassGrade newClassGrade = new ClassGrade();
//        int result = discountService.discount(newClassGrade, price);
//        System.out.println("NEW_CLASS_GRADE 등급의 할인 금액 = " + newClassGrade);

        //오타
//        int diamondd = discountService.discount(ClassGrade.DIAMONDD, price);
//        System.out.println("DIAMONDD 등급의 할인 금액 = " + diamondd);

        //소문자
//        int gold = discountService.discount(ClassGrade.glod, price);
//        System.out.println("gold 등급의 할인 금액 = " + gold);
    }
}
