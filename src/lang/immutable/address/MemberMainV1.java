package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울"); //x001

        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);

        //회원A, 회원B의 주소: 서울
        System.out.println("memberA = " + memberA); //서울
        System.out.println("memberB = " + memberB); //서울

        //회원B의 주소를 부산으로 변경
        memberB.getAddress().setValue("부산"); //x001
        System.out.println("memberA = " + memberA); //부산
        System.out.println("memberB = " + memberB); //부산
    }
}
