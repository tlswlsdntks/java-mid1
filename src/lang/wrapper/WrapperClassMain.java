package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        /**
         * Primitive → Wrapper
         * byte → Byte
         * short → Short
         * int → Integer
         * long → Long
         * float → Float
         * double → Double
         * char → Character
         * boolean → Boolean
         */
        System.out.println("박싱");
        System.out.println("new Integer(10) = " + new Integer(10)); //오류 표기의 원인: 미래에 삭제 예정, 대신에 valueOf()를 사용
        /**
         * Integer: -128 ~ 127 범위의 값을 재사용(캐시)
         * if (i >= IntegerCache.low && i <= IntegerCache.high)
         *      return IntegerCache.cache[i + (-IntegerCache.low)];
         */
        System.out.println("Integer.valueOf(10) = " + Integer.valueOf(10));
        System.out.println("Long.valueOf(100) = " + Long.valueOf(100));
        System.out.println("Double.valueOf(10.5) = " + Double.valueOf(10.5));

        System.out.println("언박싱");
        System.out.println("Integer.valueOf(10).intValue() = " + Integer.valueOf(10).intValue());
        System.out.println("Long.valueOf(100).longValue() = " + Long.valueOf(100).longValue());
        System.out.println("Double.valueOf(10.5).doubleValue() = " + Double.valueOf(10.5).doubleValue());

        System.out.println("비교");
        System.out.println("(new Integer(10) == Integer.valueOf(10)) = " + (new Integer(10) == Integer.valueOf(10))); //false
        System.out.println("(new Integer(10).equals(Integer.valueOf(10))) = " + (new Integer(10).equals(Integer.valueOf(10)))); //true
        System.out.println("(Integer.valueOf(10) == Integer.valueOf(10)) = " + (Integer.valueOf(10) == Integer.valueOf(10))); //true
        System.out.println("(Integer.valueOf(10).equals(Integer.valueOf(10))) = " + (Integer.valueOf(10).equals(Integer.valueOf(10)))); //true
    }
}
