package exception.basic.unchecked;

public class Client {
    public void call() {
        //문제 상황
        throw new MyUnCheckedException("ex");
    }
}
