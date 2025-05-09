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
                /**
                 * 만약 변수 캡처 시점 이후에 localVar 의 값을 변경한다면? 다시 캡처를 해야 하나?
                 * 스택 영역에 존재하는 지역 변수의 값과 인스턴스에 캡처한 변수의 값이 서로 달라지는 문제가 발생한다. 이것을 "동기화 문제"라 한다.
                 * 자바는 캡처한 지역 변수의 값을 변하지 못하게 제한하여 동기화 문제를 근본적으로 차단한다. 그러므로 지역 클래스 내에서 지역 변수를 사용하면 컴파일 에러가 발생한다.
                 */
//                System.out.println("localVar = " + localVar); //java: local variables referenced from an inner class must be final or effectively final
//                System.out.println("paramVar = " + paramVar); //java: local variables referenced from an inner class must be final or effectively final
                System.out.println("outInstnaceVar = " + outInstnaceVar);
            }
        }

        localVar = 10;
        paramVar = 10;
        return new LocalPrinter();
    }

    public static void main(String[] args) {
        Printer printer = new LocalOuterV4().process(2);
        printer.print();
    }
}
