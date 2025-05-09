package exception.ex5;

import exception.ex5.exception.ConnectExceptionV5;
import exception.ex5.exception.SendExceptionV5;

public class NetworkClientV5 implements AutoCloseable {

    @Override
//    public void close() throws Exception { //언체크 예외로 예외를 던지지 않고 있으므로 thorws Exception 을 제거한다.
    public void close() {
        disconnect();
    }

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV5(String address) {
        this.address = address;
    }

    public void connect() {
        if (connectError) {
            throw new ConnectExceptionV5(address, address + " 서버 연결 실패");
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) {
        if (sendError) {
            throw new SendExceptionV5(data, address + " 서버에 데이터 전송 실패");
        }
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
