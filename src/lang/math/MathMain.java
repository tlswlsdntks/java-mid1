package lang.math;

public class MathMain {
    public static void main(String[] args) {
        //기본 연산 메서드
        System.out.println("최소값 = " + Math.min(10, 20)); //10
        System.out.println("최대값 = " + Math.max(10, 20)); //20
        System.out.println("절대값 = " + Math.abs(-10)); //10

        //반올림 및 정밀도 메서드
        System.out.println("올림 = " + Math.ceil(2.1)); //3.0
        System.out.println("내림 = " + Math.floor(2.1)); //2.0
        System.out.println("반올림 = " + Math.round(2.5)); //3

        //기타 유용한 메서드
        System.out.println("제곱근 = " + Math.sqrt(4)); //2.0
        System.out.println("0.0 ~ 1.0 사이의 double 값 = " + Math.random()); //0.1987360193269999
    }
}
