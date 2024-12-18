package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java World";
        /**
         * contains(CharSequence s): 문자열이 특정 문자열을 포함하고 있는지 확인한다.
         * indexOf(String ch) / indexOf(String ch, int fromIndex): 문자열이 처음 등장하는 위치를 반환한다.
         * lastIndexOf(String ch): 문자열이 마지막으로 등장하는 위치를 반환한다.
         */
        System.out.println("str = " + str);
        System.out.println("str.contains(\"Java\") = " + str.contains("Java"));
        System.out.println("str.indexOf(\"Java\") = " + str.indexOf("Java"));
        System.out.println("str.indexOf(\"Java\", 10) = " + str.indexOf("Java", 10));
        System.out.println("str.lastIndexOf(\"Java\") = " + str.lastIndexOf("Java"));
    }
}
