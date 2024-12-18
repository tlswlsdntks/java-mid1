package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        /**
         * 자신의 참조값 반환
         * ValueAdder adder = new ValueAdder(); //x001
         * ValueAdder adder1 = adder.add(1); //x001
         * ValueAdder adder2 = adder.add(2); //x001
         * ValueAdder adder3 = adder.add(3); //x001
         */
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder.add(2);
        ValueAdder adder3 = adder.add(3);

        int result = adder3.getValue();
        System.out.println("result = " + result); //6
        System.out.println("adder = " + adder); //x001
        System.out.println("adder1 = " + adder1); //x001
        System.out.println("adder2 = " + adder2); //x001
        System.out.println("adder3 = " + adder2); //x001
    }
}
