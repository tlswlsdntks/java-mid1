package nested.nested;

import java.util.Random;

public class NestedOuterMain {
    public static void main(String[] args) {
        //정적 중첩 클래스 호출
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();
        System.out.println("nested.getClass() = " + nested.getClass()); //class nested.nested.NestedOuter$Nested
    }
}
