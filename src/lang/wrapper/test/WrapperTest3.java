package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer integer1 = Integer.valueOf(str); //박싱
        System.out.println("integer = " + integer1);

//        int intValue = integer1.intValue(); //언박싱
        int intValue = integer1; //오토 언박싱
        System.out.println("intValue = " + intValue);

//        Integer integer2 = Integer.valueOf(intValue); //박싱
        Integer integer2 = intValue; //오토 박싱
        System.out.println("integer2 = " + integer2);
    }
}
