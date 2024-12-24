package nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        //내부 클래스 호출
        OuterClass2.InnerClass innerClass = new OuterClass2().new InnerClass();
        innerClass.hello();
    }
}
