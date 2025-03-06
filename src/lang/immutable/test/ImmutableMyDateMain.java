package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1); //x001
        ImmutableMyDate date2 = date1; //x001

        System.out.println("date1 = " + date1); //2024-1-1
        System.out.println("date2 = " + date2); //2024-1-1

        //불변이라는 단순한 제약을 사용해서 사이드 이팩트로 인한 문제는 큰 문제를 방지할 수 있다.
        date1 = date1.withYear(2025); //x002
        System.out.println("date1 = " + date1); //2025-1-1
        System.out.println("date2 = " + date2); //2024-1-1
    }
}
