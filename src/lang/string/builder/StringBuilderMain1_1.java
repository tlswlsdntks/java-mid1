package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); //가변객체
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(1, "Java");
        System.out.println("sb = " + sb);

        sb.delete(4, 8);
        System.out.println("sb = " + sb);

        sb.reverse();
        System.out.println("sb = " + sb);

        //불변객체
        System.out.println("str = " + sb.toString());

        /**
         * String result = str1 + str2;
         * String str = new StringBuilder().append(str1).append(str2).toString();
         * 이렇듯 자바가 최적화를 처리해주기 때문에 지금처럼 간단한 경우에는 StringBuilder를 사용하지 않아도 된다.
         * 하지만 문자열을 루프 안에서 문자열을 더하는 경우에는 최적화가 이루어지지 않는다.
         */
    }
}
