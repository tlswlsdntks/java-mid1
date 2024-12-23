package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        //String 은 불변 객체이므로 반환이 불가피하다.
        str.concat(" java");
        System.out.println("str = " + str);
    }
}
