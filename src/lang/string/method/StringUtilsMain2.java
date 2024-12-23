package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";
        /**
         * format(String format, Object... args): 형식 문자열과 인자를 사용하여 새로운 문자열을 생성한다.
         * matches(String regex): 문자열이 주어진 정규 표현식과 일치하는지 확인한다.
         * System.out.printf(String format, Object obj): 지시자를 통해 변수의 값을 여러 가지 형식으로 변환하여 출력할 수 있다.
         */
        System.out.println("num = " + num);
        System.out.println("bool = " + bool);
        System.out.println("str = " + str);
        System.out.println("String.format(\"num: %d, bool: %b, str: %s\", num, bool, str) = " + String.format("num: %d, bool: %b, str: %s", num, bool, str));
        System.out.println("String.format(\"숫자: %.2f\", 10.1234) = " + String.format("숫자: %.2f", 10.1234));
        System.out.print("System.out.printf(숫자: %.2f, 10.1234) = ");
        System.out.printf("숫자: %.2f\n", 10.1234);
        System.out.println("str.matches(\"Hello, (Java!|World)\") = " + str.matches("Hello, (Java!|World)"));
    }
}
