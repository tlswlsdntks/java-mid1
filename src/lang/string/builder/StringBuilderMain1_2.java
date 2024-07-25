package lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); //가변객체
        String str = sb
                .append("A")
                .append("B")
                .append("C")
                .append("D")
                .insert(1, "Java")
                .delete(4, 8)
                .reverse()
                .toString();//불변객체

        System.out.println("str = " + str);
    }
}
