package nested.test;

public class OuterClass1 {
    //정적 중첩 클래스
    static class NestedClass {
        public void hello() {
            System.out.println("NestedClass.hello");
        }
    }
}
