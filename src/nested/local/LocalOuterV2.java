package nested.local;

public class LocalOuterV2 {
    private int outInstnaceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value); //0
                System.out.println("localVar = " + localVar); //1
                System.out.println("paramVar = " + paramVar); //2
                System.out.println("outInstnaceVar = " + outInstnaceVar); //3
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        new LocalOuterV2().process(2);
    }
}
