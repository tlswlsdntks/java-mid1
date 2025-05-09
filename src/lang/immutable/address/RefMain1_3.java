package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        //여러 변수가 하나의 객체를 참조하는 공유참조를 막을 수 있는 방법은 없다.
        Address a = new Address("서울"); //x001
        Address b = a; //x001
        System.out.println("a = " + a); //서울
        System.out.println("b = " + b); //서울

        change(b, "부산");
        System.out.println("a = " + a); //부산
        System.out.println("b = " + b); //부산
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소 값 변경: " + changeAddress);
        address.setValue(changeAddress); //x001
    }
}
