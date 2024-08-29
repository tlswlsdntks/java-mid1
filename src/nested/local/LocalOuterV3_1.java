package nested.local;

public class LocalOuterV3_1 {

    private int outInstnaceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1;

        /**
         * 지역 클래스가 접근하는 지역 변수는 절대로 중간에 값이 변하면 안된다.
         * 따라서 final로 선언하거나 또는 사실상 final이어야 한다. 이것은 자바 문법이고 규칙이다.
         */
        //사실상 final 변수
        localVar = 2; //수정

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                //System.out.println("localVar = " + localVar); //컴파일 에러
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstnaceVar = " + outInstnaceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        return printer;
    }

    public static void main(String[] args) {
        Printer printer = new LocalOuterV3_1().process(2);
        printer.print();
    }
}
