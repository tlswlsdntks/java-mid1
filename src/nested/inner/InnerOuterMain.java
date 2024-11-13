package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        //InnerOuter outer = new InnerOuter(); //x001
        //InnerOuter.Inner inner = outer.new Inner(); //내부 클래스 호출: x001.new Inner(): x002
        InnerOuter.Inner inner = new InnerOuter().new Inner();
        inner.print();
        System.out.println("innerClass = " + inner.getClass()); //class nested.inner.InnerOuter$Inner
    }
}
