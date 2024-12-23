package enumeration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {
        /**
         * 모두 ClassGrade 타입을 기반으로 인스턴스를 만들었기 때문에 getClass()의 결과는 모두 ClassGrade 이다.
         * 상수(static final) 이므로 애플리케이션 로딩 시점에 ClassGarde 인스턴스가 생성되고, 같은 ClassGrade 타입의 서로 다른 인스턴스의 참조값을 가진다.
         */
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass()); //ClassGrade
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass()); //ClassGrade
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass()); //ClassGrade

        System.out.println("ref BASIC = " + ClassGrade.BASIC); //x001
        System.out.println("ref GOLD = " + ClassGrade.GOLD); //x002
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND); //x003
    }
}
