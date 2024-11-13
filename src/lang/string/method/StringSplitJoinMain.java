package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banna,Orange";
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        /**
         * split(String regex): 문자열을 정규 표현식을 기준으로 분할한다.
         * join(CharSequence delimiter, CharSequence... elements): 주어진 구분자로 여러 문자열을 결합한다.
         */
        String joinStr = "";
        String joinedStr = String.join(",", "A", "B", "C");
        System.out.println("joinedStr = " + joinedStr);
        String result = String.join(",", splitStr);
        System.out.println("result = " + result);
    }
}
