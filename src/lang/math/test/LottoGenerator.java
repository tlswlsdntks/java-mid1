package lang.math.test;

import java.util.Random;

public class LottoGenerator {

    private final Random random = new Random();
    private int[] lottoNumbers = new int[6];
    private int count = 0;

    public int[] generate() {
        while (count < 6) {
            int number = random.nextInt(45) + 1;
            if (isUnique(number)) {
                lottoNumbers[count++] = number;
            }
        }
        return lottoNumbers;
    }

    private boolean isUnique(int number) {
        for (int lottoNumber : lottoNumbers) {
            if (lottoNumber == number) return false;
        }
        return true;
    }

}
