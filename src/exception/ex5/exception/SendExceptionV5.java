package exception.ex5.exception;

public class SendExceptionV5 extends NetworkClientExceptionV5 {
    private final String sendData;

    public SendExceptionV5(String address, String message) {
        super(message);
        this.sendData = address;
    }

    public String getSendData() {
        return sendData;
    }
}
