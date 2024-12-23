package nested.inner;

public class InnerOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    /**
     * 중첩 클래스를 사용하는 이유
     * 1. 논리적 그룹화:
     *      특정 클래스가 다른 하나의 클래스 안에서만 사용되는 경우, 해당 클래스 안에 포함하는 것이 더 그룹화가 된다.
     * 2. 캡슐화:
     *      중첩 클래스는 바깥 클래스의 private 멤버에 접근할 수 있다. 그러므로 불필요한 public 메서드를 제거할 수 있다.
     */
    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            //자기 자신에 접근
            System.out.println(innerInstanceValue);

            //외부 클래스의 인스턴스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outInstanceValue);

            //외부 클래스의 클래스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outClassValue);
        }
    }
}
