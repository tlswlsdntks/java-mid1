package lang.system;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        //현재 시간(밀리초)
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());

        //현재 시간(나노초)
        System.out.println("System.nanoTime(); = " + System.nanoTime());

        //환경 변수
        System.out.println("System.getenv() = " + System.getenv());

        //시스템 속성
        System.out.println("System.getProperties() = " + System.getProperties());
        System.out.println("System.getProperty(\"java.version\") = " + System.getProperty("java.version"));

        //배열 고속 복사
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
        System.out.println("Arrays.toString(originalArray) = " + Arrays.toString(originalArray));
        System.out.println("Arrays.toString(copiedArray) = " + Arrays.toString(copiedArray));

        //프로그램 종료
        System.exit(0);
        System.out.println("hello");
    }
}
