package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        //불변 객체의 도입
        ImmutableAddress a = new ImmutableAddress("서울"); //x001
        ImmutableAddress b = a; //x001
        System.out.println("a = " + a); //서울
        System.out.println("b = " + b); //서울

//        b.setValue("부산"); //cannot find symbol
        b = new ImmutableAddress("부산"); //x002
        System.out.println("a = " + a); //서울
        System.out.println("b = " + b); //부산
    }
}
