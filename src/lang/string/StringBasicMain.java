package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        /**
         * int, double, boolean: 소문자 → 기본형
         * String : 대문자 → 참조형
         */
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
