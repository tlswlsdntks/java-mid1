package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        //불변 객체의 도입
        ImmutableAddress a = new ImmutableAddress("서울"); //x001
        ImmutableAddress b = a; //x001
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b.setValue("부산"); //java: cannot find symbol
        b = new ImmutableAddress("부산"); //x002
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
