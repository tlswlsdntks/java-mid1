package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);
        System.out.println("i1 = " + myInteger.compareTo(5));
        System.out.println("i2 = " + myInteger.compareTo(10));
        System.out.println("i3 = " + myInteger.compareTo(20));
    }
}
