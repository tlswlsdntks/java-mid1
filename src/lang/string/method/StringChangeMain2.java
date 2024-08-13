package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "    Java Programming  ";
        /**
         * toLowerCase() / toUpperCase() : 문자열을 소문자나 대문자로 변환한다.
         * trim() : 문자열 양쪽 끝의 공백을 제거한다. 단순 Whitespace 만 제거할 수 있다.
         * strip() : Whitespace 와 유니코드 공백을 포함해서 제거한다. 자바 11
         */
        System.out.println("strWithSpaces.toLowerCase() = " + strWithSpaces.toLowerCase());
        System.out.println("strWithSpaces.toUpperCase() = " + strWithSpaces.toUpperCase());
        System.out.println("strWithSpaces.trim() = " + strWithSpaces.trim());
        System.out.println("strWithSpaces.strip() = " + strWithSpaces.strip());
        System.out.println("strWithSpaces.stripLeading() = " + strWithSpaces.stripLeading());
        System.out.println("strWithSpaces.stripTrailing() = " + strWithSpaces.stripTrailing());
    }
}
