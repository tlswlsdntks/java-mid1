package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter.Netsed netsed = new NestedOuter.Netsed(); //정적 중첩 클래스 호출
        netsed.print();
        System.out.println("netsedClass = " + netsed.getClass()); //class nested.nested.NestedOuter$Netsed
    }
}
