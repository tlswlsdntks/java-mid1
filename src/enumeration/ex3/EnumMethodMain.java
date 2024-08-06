package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        //모든 enum 변환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            /**
             * ordinal()의 값은 가급적 사용하지 않는 것이 좋다.
             * 왜냐하면 이 값을 사용하다가 중간에 상수를 선언하는 위치가 변경되면 전체 상수의 위치가 모두 변경될 수 있기 때문이다.
             */
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal()); //순번
        }
        //String → enum 변환, 잘못된 문자면 IllegalArgumentException 발생
        String input = "GOLD";
        //박싱
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); //toString() 오버라이딩 가능
    }
}
