package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);
        System.out.println(myInteger.compareTo(5)); //1
        System.out.println(myInteger.compareTo(10)); //0
        System.out.println(myInteger.compareTo(20)); //-1
    }
}
