package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        //System.out.println() 메서드는 내부에서 toString() 을 호출한다.
        System.out.println(object.toString());
        System.out.println(object);
    }
}
