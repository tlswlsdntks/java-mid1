package lang.immutable.change;

public class ImutableObj {
    private final int value;

    public ImutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ImutableObj add(int addValue) {
        return new ImutableObj(value + addValue);
    }
}
