package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; //반복 횟수 설정, 10억
        long startTime, endTime;

        //기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        String time = (endTime - startTime) + "ms"; //1/1000
        System.out.println("기본 자료형 long 실행 시간:  " + time); //233ms

        //래퍼 클래스 Long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i; //오토 박싱
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        time = (endTime - startTime) + "ms"; //1/1000
        System.out.println("래퍼 클래스 Long 실행 시간:  " + time); //2473ms

        /**
         * 래퍼 클래스의 인스턴스는 내부에 필드로 가지고 있는 기본형의 값 뿐만 아니라
         * 자바에서 객체 자체를 다루는데 필요한 객체 메타데이터를 포함하므로 더 많은 메모리를 차지한다.
         *
         * 이 연산은 10억 번의 연산을 수행했을 때 0.2초와 2초의 차이다.
         * 일반적인 애플리케이션을 만드는 관점에서 보면 이런 부분을 최적화해도 사막의 모래알 하나 정도의 차이가 날 뿐이다.
         * CPU 연산을 아주 많이 수행하는 특수한 경우에서나 기본형을 사용하여 최적화를 고려하자.
         */
    }
}
