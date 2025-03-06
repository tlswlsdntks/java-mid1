package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = Integer.valueOf("10");
        int intValue = Integer.parseInt("10");

        /**
         * 비교 대상보다 더 큰 경우: 1
         * 비교 대상과 동일한 경우: 0
         * 비교 대상보다 작은 경우: -1
         */
        System.out.println("i1.compareTo(20) = " + i1.compareTo(5)); //1
        
        //산술연산
        System.out.println("Integer.sum(10,20) = " + Integer.sum(10, 20));
        System.out.println("Integer.min(10,20) = " + Integer.min(10, 20));
        System.out.println("Integer.max(10,20) = " + Integer.max(10, 20));
    }
}
