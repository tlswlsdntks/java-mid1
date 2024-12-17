package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        //1. 클래스에서 조회
        Class clazz = String.class;
        //2. 인스턴스에서 조회
        //Class clazz = new String().getClass();
        //3. 문자열로 조회: throws Exception 예외처리가 필요하다.
        //Class clazz = Class.forName("java.lang.String");

        //모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getType() + " " + field.getName());
        }
        System.out.println();

        //모든 메서드 출력
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }
        System.out.println();

        //상위 클래스 정보 출력
        System.out.println("Superclass: " + clazz.getSuperclass().getName());
        System.out.println();

        //인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("anInterface = " + anInterface);
        }

    }
}
