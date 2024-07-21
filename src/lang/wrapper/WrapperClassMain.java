package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        /**
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
        Integer newInteger = new Integer(10); //미래에 삭제 예정, 대신에 valueOf()를 사용
        /**
         * if (i >= IntegerCache.low && i <= IntegerCache.high)
         *      return IntegerCache.cache[i + (-IntegerCache.low)];
         */
        Integer integerObj = Integer.valueOf(10); //-128 ~ 127 범위 값 재사용(캐시), 불변
        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("언박싱");
        int intValue = integerObj.intValue();
        long longValue = longObj.longValue();
        double doubleValue = doubleObj.doubleValue();
        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);
        System.out.println("doubleValue = " + doubleValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj)); //false
        System.out.println("equals: " + (newInteger.equals(integerObj))); //true
        newInteger = Integer.valueOf(10); //-128 ~ 127 범위 값 재사용(캐시), 불변
        integerObj = Integer.valueOf(10);
        System.out.println("==: " + (newInteger == integerObj)); //true
        System.out.println("equals: " + (newInteger.equals(integerObj))); //true
    }
}
