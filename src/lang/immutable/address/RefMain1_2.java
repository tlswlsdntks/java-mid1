package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        //사이드 이팩트 방지
        Address a = new Address("서울"); //x001
        Address b = new Address("서울"); //x002
        System.out.println("a = " + a); //서울
        System.out.println("b = " + b); //서울

        b.setValue("부산"); //x002
        System.out.println("a = " + a); //서울
        System.out.println("b = " + b); //부산
    }
}
