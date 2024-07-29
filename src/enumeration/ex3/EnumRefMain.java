package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass()); //Grade
        System.out.println("class GOLD = " + Grade.GOLD.getClass()); //Grade
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass()); //Grade

        System.out.println("ref BASIC = " + refValue(Grade.BASIC)); //1d81eb93
        System.out.println("ref GOLD = " + refValue(Grade.GOLD)); //7291c18f
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND)); //34a245ab
    }

    /**
     * 열거형은 toString()을 재정의 하기 때문에 직접 확인할 수 없다.
     * 그러므로 참조값을 구하기 위해 refValue()를 추가로 생성하였다.
     */
    private static String refValue(Grade grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
