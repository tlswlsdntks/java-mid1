package nested.local;

public class LocalOuterV4 {

    private int outInstnaceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                //System.out.println("localVar = " + localVar); //컴파일 에러
                //System.out.println("paramVar = " + paramVar); //컴파일 에러
                System.out.println("outInstnaceVar = " + outInstnaceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        //만약 localVar의 값을 변경한다면? 다시 캡처를 해야하나?
        localVar = 10;
        paramVar = 10;
        /**
         * 스택 영역에 존재하는 지역 변수의 값과 인스턴스에 캡처한 변수의 값이 서로 달라지는 문제가 발생한다. 이것을 동기화 문제라 한다.
         * 자바는 캡처한 지역 변수의 값을 변하지 못하게 막아서 동기화 문제를 근본적으로 차단한다.
         * //System.out.println("localVar = " + localVar); //컴파일 에러
         * //System.out.println("paramVar = " + paramVar); //컴파일 에러
         */
        return printer;
    }

    public static void main(String[] args) {
        Printer printer = new LocalOuterV3_1().process(2);
        printer.print();
    }
}
