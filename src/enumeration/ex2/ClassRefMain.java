package enumeration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {
        /**
         * 각자의 상수는 모두 ClassGrade 타입을 기반으로 인스턴스를 만들었기 때문에 getClass()의 결과는 모두 ClassGrade이다.
         * 각각의 상수는 모두 서로 각기 다른 ClassGrade 인스턴스를 참조하기 때문에 참조값이 다르게 출력된다.
         * static 이므로 애플리케이션 로딩 시점에 ClassGarde 인스턴스가 생성되고,
         * 각각의 상수는 같은 ClassGarde 타입의 서로 다른 인스턴스의 참조값을 가진다.
         */
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass()); //ClassGrade
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass()); //ClassGrade
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass()); //ClassGrade

        System.out.println("ref BASIC = " + ClassGrade.BASIC); //1d81eb93
        System.out.println("ref GOLD = " + ClassGrade.GOLD); //7291c18f
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND); //34a245ab
    }
}
