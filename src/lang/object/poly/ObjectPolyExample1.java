package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        action(dog);
        action(car);
    }

    private static void action(Object obj) {
//        obj.sound(); //cannot find symbol
//        obj.move(); //cannot find symbol

        /**
         * Object 는 다형적 참조는 가능하지만 메서드 오버라이딩이 불가능하기 때문에
         * 각 객체의 기능을 호출하려면 다운캐스팅을 필요로 한다. 결과적으로 다형성을 활용하기에는 한계가 있다.
         */
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
