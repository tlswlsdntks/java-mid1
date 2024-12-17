package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toString() 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString() 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        System.out.println("4. 객체의 참조값 확인");
        System.out.println("car = " + Integer.toHexString(System.identityHashCode(car))); //3b07d329
        System.out.println("dog1 = " + Integer.toHexString(System.identityHashCode(dog1))); //7b23ec81
        System.out.println("dog2 = " + Integer.toHexString(System.identityHashCode(dog2))); //6acbcfc0
    }

}
