package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter.Inner inner = new InnerOuter().new Inner();
        inner.print();
        System.out.println("innerClass = " + inner.getClass()); //class nested.inner.InnerOuter$Inner
    }
}
