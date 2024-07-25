package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello, Java!";
        System.out.println("문자열의 길이: " + str.length());
        System.out.println("문자열이 비어 있는 지: " + str.isEmpty());
        System.out.println("문자열이 비어 있거나 공백인 지1: " + str.isBlank());
        System.out.println("문자열이 비어 있거나 공백인 지2: " + "           ".isBlank());

        char c = str.charAt(7);
        System.out.println("7번 인덱스의 문자: " + c);
    }
}
