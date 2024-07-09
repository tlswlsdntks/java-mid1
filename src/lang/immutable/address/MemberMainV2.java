package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울"); //x001

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        //회원A, 회원B의 주소: 서울
        System.out.println("memberA = " + memberA); //서울
        System.out.println("memberB = " + memberB); //서울

        //회원B의 주소를 부산으로 변경
        //memberB.getAddress().setValue("부산"); //java: cannot find symbol
        memberB.setAddress(new ImmutableAddress("부산")); //x002
        System.out.println("memberA = " + memberA); //서울
        System.out.println("memberB = " + memberB); //부산
    }
}
