package exception.ex2;

public class NetworkServiceV2_5 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);
        try {
            client.connect();
            //문제 1. RuntimeException 은 catch 대상이 아님. 예외가 밖으로 던져짐
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        } finally {
            //문제 2. NetworkClientExceptionV2 가 아닌 다른 예외가 발생하면 예외가 밖으로 던져지며 무시
            //해결
            client.disconnect();
        }

    }
}
