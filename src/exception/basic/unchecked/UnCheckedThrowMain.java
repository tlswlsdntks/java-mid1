package exception.basic.unchecked;

public class UnCheckedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callThrows(); //Exception in thread "main" exception.basic.unchecked.MyUnCheckedException: ex
        System.out.println("정상 종료");
    }
}
