package nested.anonymous;

public class AnonymousOuter {
    private int outInstnaceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;
        /**
         * 익명 클래스
         * 1. 익명 클래스는 기본 생성자만 사용 가능하다.
         * 2. 익명 클래스는 부모 클래스를 상속하거나 또는 인터페이스를 반드시 구현해야 한다.
         * 3. 익명 클래스는 AnonymousOuter$1 과 같이 자바 내부에서 바깥 클래스 이름 + $ + 숫자로 정의된다. 익명 클래스가 여러개면 $2, $3으로 숫자가 증가하면 구분된다.
         */
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value); //0
                System.out.println("localVar = " + localVar); //1
                System.out.println("paramVar = " + paramVar); //2
                System.out.println("outInstnaceVar = " + outInstnaceVar); //3
            }
        };
        printer.print();
        System.out.println("printer.class = " + printer.getClass()); //class nested.anonymous.AnonymousOuter$1
    }

    public static void main(String[] args) {
        new AnonymousOuter().process(2);
    }
}
