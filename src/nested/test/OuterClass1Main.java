package nested.test;

public class OuterClass1Main {
    public static void main(String[] args) {
        //정적 중첩 클래스 호출
        OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass();
        nestedClass.hello();
    }
}
