package exception.ex4.exception;

public class NetworkClientExceptionV4 extends RuntimeException { //언체크 예외
    public NetworkClientExceptionV4(String message) {
        super(message);
    }
}
