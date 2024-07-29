package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
//        ClassGrade newClassGrade = new ClassGrade();
//        int result = discountService.discount(newClassGrade, price);
//        System.out.println("NEW_CLASS_GRADE 등급의 할인 금액 = " + newClassGrade);
        /**
         * private 생성자를 추가함으로써 컴파일 에러 발생을 유발하여, 타입 안전 열거형 패턴을 완성할 수 있다.
         */
    }
}
