package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        //가변객체
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        sb.insert(1, "Java");
        sb.delete(4, 8);
        sb.reverse();
        //불변객체
        System.out.println("str = " + sb.toString());
    }
}
