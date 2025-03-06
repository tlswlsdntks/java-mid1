package exception.ex5;

import exception.ex5.exception.ConnectExceptionV5;
import exception.ex5.exception.SendExceptionV5;

import java.util.Scanner;

public class MainV5 {
    public static void main(String[] args) {
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String data = scanner.nextLine();
            if (data.equals("exit")) {
                break;
            }
            try {
                networkService.sendMessage(data);
                if (data.equals("error3")) {
                    throw new Exception("알 수 없는 문제가 발생했습니다.");
                }
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    //공통 예외 처리
    private static void exceptionHandler(Exception e) {
        //필요하면 예외별 별도의 추가 처리 가능
        if (e instanceof ConnectExceptionV5 connectEx) {
            System.out.println("[연결 오류] 주소: " + connectEx.getAddress());
        } else if (e instanceof SendExceptionV5 sendEx) {
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
        } else {
            System.out.println("[기타 오류]: " + e.getMessage());
            System.out.println("== 개발자용 디버깅 메세지 ==");
            e.printStackTrace(System.out); //스택 트레이스 출력
//        e.printStackTrace(System.err); //스트림이 꼬이는 경우가 발생할 수 있다.
        }
    }
}
