package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello Java ");
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + sb.toString());
        String time = endTime - startTime + "ms"; //1/1000초
        System.out.println("time = " + time); //3ms

        /**
         * StringBuilder vs StringBuffer
         * StringBuilder와 똑같은 기능을 수행하는 StringBuffer 클래스도 있다.
         * StringBuffer는 내부에 동기화가 되어 있어, 멀티 스레드 상황에 안전하지만 동기화 오버헤드로 인해 성능이 느리다.
         * StringBuilder는 멀티 스레드 상황에 안전하지 않지만 동기화 오버헤드가 없으므로 속도가 빠르다.
         */
    }

}
