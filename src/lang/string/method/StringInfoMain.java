package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello, Java!";
        /**
         * length(): 문자열의 길이를 반환한다.
         * isEmpty(): 문자열이 비어 있는지 확인한다. (길이가 0)
         * isBlank(): 문자열이 비어 있는지 확인한다. (길이가 0 이거나 공백(Whitespace)만 있는 경우), 자바 11
         * charAt(int index): 지정된 인덱스에 있는 문자를 반환한다.
         */
        System.out.println("str = " + str);
        System.out.println("str.length() = " + str.length());
        System.out.println("str.isEmpty() = " + str.isEmpty());
        System.out.println("str.isBlank() = " + str.isBlank());
        System.out.println("\"           \".isBlank() = " + "           ".isBlank());
        System.out.println("str.charAt(7) = " + str.charAt(7));
    }
}
