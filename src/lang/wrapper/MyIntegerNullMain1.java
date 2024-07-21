package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println(findValue(intArr, -1)); //-1
        System.out.println(findValue(intArr, 0)); //0
        System.out.println(findValue(intArr, 1)); //1
        System.out.println(findValue(intArr, 100)); //null
        /**
         * null 값을 반환하는 경우 잘못하면 NullPointerException이 발생할 수 있기 때문에 주의해서 사용해야 한다.
         */
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null;
    }
}
