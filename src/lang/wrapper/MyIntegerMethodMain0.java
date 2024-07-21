package lang.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 10;
        System.out.println("i1 = " + compareTo(value, 5));
        System.out.println("i2 = " + compareTo(value, 10));
        System.out.println("i3 = " + compareTo(value, 20));
    }

    public static int compareTo(int value, int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }
}
