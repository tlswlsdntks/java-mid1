package lang.string.chaining;

public class ValueAdder {
    private int value;

    public ValueAdder add(int addValue) {
        value += addValue;
        /**
         * 자신의 참조값 반환
         * ValueAdder adder = new ValueAdder(); //@27973e9b
         * ValueAdder adder1 = adder.add(1); //@27973e9b
         * ValueAdder adder2 = adder.add(2); //@27973e9b
         * ValueAdder adder3 = adder.add(3); //@27973e9b
         */
        return this;
    }

    public int getValue() {
        return value;
    }
}
