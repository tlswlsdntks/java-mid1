package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java";
        /**
         * substring(int beginIndex) / substring(int beginIndex, int endIndex): 문자열의 부분 문자열을 반환한다.
         * concat(String str): 문자열의 끝에 다른 문자열을 붙인다.
         * replace(CharSequence target, CharSequence replacement): 특정 문자열을 새 문자열로 대체한다.
         * replaceAll(String regex, String replacement): 문자열에서 정규 표현식과 일치하는 부분을 새 문자열로 대체한다.
         * replaceFirst(String regex, String replacement): 문자열에서 정규 표현식과 일치하는 첫 번째 부분을 새 문자열로 대체한다.
         */
        System.out.println("str = " + str);
        System.out.println("str.substring(7) = " + str.substring(7));
        System.out.println("str.substring(7, 12) = " + str.substring(7, 12));
        System.out.println("str.concat(\"!!!\") = " + str.concat("!!!"));
        System.out.println("str + \"!!!\" = " + str + "!!!");
        System.out.println("str.replace(\"Java\", \"World\") =  " + str.replace("Java", "World"));
        System.out.println("str.replaceFirst(\"Java\", \"World\") = " + str.replaceFirst("Java", "World"));
    }
}
