package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        //랜덤
        //Random random = new Random();
        Random random = new Random(1); //seed가 같으면 Random의 결과가 동일하다.

        int randomInt = random.nextInt();
        System.out.println("int형 난수 발생 = " + randomInt);
        double randomDouble = random.nextDouble();
        System.out.println("double형 난수 발생 = " + randomDouble);
        boolean radomBoolean = random.nextBoolean();
        System.out.println("boolean형 난수 발생 = " + radomBoolean);

        //범위 조회
        int randomRange1 = random.nextInt(10); //0 ~ 9까지 출력
        System.out.println("0 ~ 9까지 출력 = " + randomRange1);
        int ranromRange2 = random.nextInt(10) + 1; //0 ~ 10까지 출력
        System.out.println("0 ~ 10까지 출력 = " + ranromRange2);
    }
}
