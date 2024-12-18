package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java ";
        }
        long endTime = System.currentTimeMillis();

//        System.out.println("result = " + result);
        String time = endTime - startTime + "ms"; //1/1000초
        System.out.println("time = " + time); //5024ms
    }
}
