package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, World!";
        /**
         * equals(Object anObject): 두 문자열이 동일한지 비교한다.
         * equalsIgnoreCase(String anotherString): 두 문자열을 대소문자 구분 없이 비교한다.
         * compareTo(String anotherString): 두 문자열을 사전 순으로 비교한다.
         * compareToIgnoreCase(String str): 두 문자열을 대소문자 구분 없이 사전적으로 비교한다.
         * startsWith(String prefix): 문자열이 특정 접두사로 시작하는지 확인한다.
         * endsWith(String suffix): 문자열이 특정 접미사로 끝나는지 확인한다.
         */
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str1.equalsIgnoreCase(str2) = " + str1.equalsIgnoreCase(str2));
        System.out.println("\"b\".compareTo(\"a\") = " + "b".compareTo("a"));
        System.out.println("\"c\".compareTo(\"a\") = " + "c".compareTo("a"));
        System.out.println("str1.compareTo(str3) = " + str1.compareTo(str3));
        System.out.println("str1.compareToIgnoreCase(str2) = " + str1.compareToIgnoreCase(str2));
        System.out.println("str1.startsWith(\"Hello\") = " + str1.startsWith("Hello"));
        System.out.println("str1.endsWith(\"Java!\") = " + str1.endsWith("Java!"));

    }
}
