package nested.local;

public class LocalOuterV1 {
    private int outInstnaceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstnaceVar = " + outInstnaceVar);
            }
        }

        new LocalPrinter().printData();
    }

    public static void main(String[] args) {
        new LocalOuterV1().process(2);
    }
}
