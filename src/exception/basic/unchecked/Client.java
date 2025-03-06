package exception.basic.unchecked;

public class Client {
    public void call() {
        //예외 발생
        throw new MyUnCheckedException("ex");
    }
}
