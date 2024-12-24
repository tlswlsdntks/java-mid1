package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        /**
         * StringBuilder vs StringBuffer
         * 1. StringBuffer 는 내부에 동기화가 되어 있어, 멀티 스레드 상황에 안전하지만 동기화 오버헤드로 인해 성능이 느리다.
         * 2. StringBuilder 는 멀티 스레드 상황에 안전하지 않지만 동기화 오버헤드가 없으므로 속도가 빠르다.
         */
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello Java ");
        }
        long endTime = System.currentTimeMillis();
//        System.out.println("result = " + sb.toString());
        String time = endTime - startTime + "ms"; //1/1000초
        System.out.println("time = " + time); //3ms
    }
}