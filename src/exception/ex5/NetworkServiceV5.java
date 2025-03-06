package exception.ex5;

public class NetworkServiceV5 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        /**
         * try-with-resources 장점
         * 1. 리소스 누수 방지:
         *      finally 블록이 없어도 모든 리소스가 제대로 닫히도록 보장한다.
         * 2. 코드 간결성 및 가독성 향상:
         *      명시적인 close() 호출이 필요없다.
         * 3. 스코프 범위 한정:
         *      리소스로 사용되는 변수의 스코프가 try 블럭 안으로 한정된다.
         * 4. 조금 더 빠른 자원 해제:
         *      기존에는 try → catch → finally 로 catch 이후에 자원을 반납했지만, try 블럭이 끝나면 즉시 close() 를 호출한다.
         */
        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        }
    }
}
