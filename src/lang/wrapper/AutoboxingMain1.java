package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        //Primitive → Wrapper
        Integer boxedValue = Integer.valueOf(7);
        //Wrapper → Primitive
        int unboxedValue = boxedValue.intValue();
        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
