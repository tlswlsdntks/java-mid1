package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        /**
         * 반복문의 루프 내부에서 문자열을 끼리 더하는 경우에 최적화가 되는 것처럼 보이지만, 반복 횟수만큼 객체를 생성해야한다.
         * for (int i = 0; i < 100000; i++) {
         *      result =  new StringBuilder().append(result).append("Hello Java ").toString();
         * }
         */
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java ";
        }
        long endTime = System.currentTimeMillis();

//        System.out.println("result = " + result);
        String time = endTime - startTime + "ms"; //1/1000초
        System.out.println("time = " + time); //5024ms
    }
}
