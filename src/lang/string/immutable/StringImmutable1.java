package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java"); //String: 불변객체 → 반환 필요
        System.out.println("str = " + str);
    }
}
