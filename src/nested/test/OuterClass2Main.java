package nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        OuterClass2.InnerClass innerClass = new OuterClass2().new InnerClass();
        innerClass.hello();
    }
}
