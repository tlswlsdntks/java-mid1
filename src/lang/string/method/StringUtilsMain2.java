package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";
        /**
         * format(String format, Object... args): 형식 문자열과 인자를 사용하여 새로운 문자열을 생성한다.
         * matches(String regex): 문자열이 주어진 정규 표현식과 일치하는지 확인한다.
         */
        System.out.println(String.format("num: %d, bool: %b, str: %s", num, bool, str));
        System.out.println(String.format("숫자: %.2f", 10.1234));
        System.out.printf("숫자: %.2f\n", 10.1234);
        String regex = "Hello, (Java!|World)";
        System.out.println("str.matches(regex) = " + str.matches(regex)); //정규표현식
    }
}
