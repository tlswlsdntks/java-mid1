package nested.test;

public class AnonymousMain {
    public static void main(String[] args) {
        //익명 클래스 호출
        new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        }.hello();
    }
}
