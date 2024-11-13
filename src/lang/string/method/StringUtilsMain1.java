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
        System.out.println("numString = " + String.valueOf(num)); //100
        System.out.println("boolString = " + String.valueOf(bool)); //true
        System.out.println("objString = " + String.valueOf(obj)); //java.lang.Object@404b9385
        System.out.println("numString2 = " + ("1" + num)); //1100

        char[] strCharArray = str.toCharArray();
        for (char c : strCharArray) {
            System.out.print(c); //Hello, Java!
        }
    }
}
