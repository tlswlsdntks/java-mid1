package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);

        client.initError(data);
        try {
            client.connect();
            client.send(data);
            /**
             * 문제 1. RuntimeException 은 catch 대상이 아님. 예외가 밖으로 던져짐
             * 해결
             * 예외가 발생 시 주의할 점은 catch 가 순서대로 실행되므로 더 디테일한 예외를 상위에서 먼저 처리해야 한다.
             */
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메세지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메세지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메세지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
