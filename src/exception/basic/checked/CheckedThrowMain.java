package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.callThrows(); //Exception in thread "main" exception.basic.checked.MyCheckedException: ex
        System.out.println("정상 종료");
    }
}
