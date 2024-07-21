package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        String numString = String.valueOf(num);
        System.out.println("numString = " + numString);
        String boolString = String.valueOf(bool);
        System.out.println("boolString = " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("objString = " + objString);

        String numString2 = "1" + num; //100
        System.out.println("numString2 = " + numString2); //1100

        char[] strCharArray = str.toCharArray();
        System.out.println("strCharArray = " + strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }
    }
}
