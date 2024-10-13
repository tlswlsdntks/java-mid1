package lang.clazz;

import java.lang.invoke.CallSite;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
        //Class helloClass = Class.forName("lang.clazz.Hello");

        /**
         * Class를 사용하면 클래스의 메타 정보를 기반으로 클래스에 정의된 메서드, 필드, 생성자 등을 조회하고
         * 이들을 통해 객체 인스턴스를 생성하고, 메서드를 호출하는 작업을 할 수 있다.
         * 이러한 작업을 "리플렉션"이라고 한다.
         */
        //생성자 기반의 인스턴스 생성
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        System.out.println(hello); //lang.clazz.Hello@2f4d3709
        System.out.println(hello.hello()); //hello
    }
}
