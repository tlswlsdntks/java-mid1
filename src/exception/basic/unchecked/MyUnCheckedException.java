package exception.basic.unchecked;

//RuntimeException 을 상속받은 예외는 언체크 예외가 된다.
public class MyUnCheckedException extends RuntimeException {
    public MyUnCheckedException(String message) {
        super(message); //super(message) 로 전달된 메세지는 Throwable 에 있는 detailMessage 에 보관된다.
    }
}
