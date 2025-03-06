package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";
        /**
         * valueOf(Object obj): 다양한 타입을 문자열로 변환한다.
         * toCharArray(): 문자열을 문자 배열로 변환한다.
         */
        System.out.println("num = " + num);
        System.out.println("bool = " + bool);
        System.out.println("obj = " + obj);
        System.out.println("str = " + str);
        System.out.println("String.valueOf(num) = " + String.valueOf(num));
        System.out.println("String.valueOf(bool) = " + String.valueOf(bool));
        System.out.println("String.valueOf(obj) = " + String.valueOf(obj));
        System.out.println("(\"1\" + num) = " + ("1" + num));
        char[] strCharArray = str.toCharArray();
        for (char c : strCharArray) {
            System.out.println("str.toCharArray() = " + c);
        }
    }
}
