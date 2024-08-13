package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        //사이드 이팩트 방지
        Address a = new Address("서울");
        Address b = new Address("서울");
        System.out.println("a = " + a); //Address{value='서울'}
        System.out.println("b = " + b); //Address{value='서울'}

        b.setValue("부산"); //b의 값을 부산으로 변경
        System.out.println("a = " + a); //Address{value='서울'}
        System.out.println("b = " + b); //Address{value='부산'}
    }
}
