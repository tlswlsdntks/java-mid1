package nested.local;

public class LocalOuterV3_1 {
    private int outInstnaceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1;
        /**
         * 1. 지역 클래스가 접근하는 지역 변수는 절대로 중간에 값이 변하면 안된다. 따라서 final 로 선언하거나 또는 사실상 final 이어야 한다.
         * 2. 지역 클래스가 접근하는 지역 변수를 수정한 이후에 지역 클래스 내에서 지역 변수를 사용하면 컴파일 에러가 발생한다.
         */
        localVar = 2;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
//                System.out.println("localVar = " + localVar); //java: local variables referenced from an inner class must be final or effectively final
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstnaceVar = " + outInstnaceVar);
            }
        }

        return new LocalPrinter();
    }

    public static void main(String[] args) {
        Printer printer = new LocalOuterV3_1().process(2);
        printer.print();
    }
}
