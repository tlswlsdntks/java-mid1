package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Netsed {
        private int nestedInsatnceValue = 1;

        public void print() {
            //자신의 멤버에 접근
            System.out.println(nestedInsatnceValue);

            //바깥 클래스의 인스턴스 멤버에 접근은 불가능.
            //System.out.println(outInstanceValue);

            //바깥 클래스의 클래스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outClassValue);
        }
    }
}
