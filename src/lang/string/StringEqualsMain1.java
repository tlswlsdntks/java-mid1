package lang.string;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x002
        System.out.println("new String() == 비교: " + (str1 == str2)); //false
        System.out.println("new String() equals 비교: " + (str1.equals(str2))); //true
        /**
         * 스트링 풀
         * 스트링 풀은 문자열을 저장하는 JVM의 특이한 메모리 영역이다.
         * JVM은 해당 문자열을 Heap 영역에 저장해놓고, 프로그램에서 사용하는 문자열을 보고 같은 값을 가지는 문자열이 스트링 풀에 존재하는지 확인한다.
         * 만약 존재한다면 해당 문자열을 참조하여 사용한다.
         * 아래 테스트 코드를 통해 정말 같은 주소의 객체를 참조하는지 확인할 수 있다.
         * System.out.println(System.identityHashCode(str1) == System.identityHashCode(str2));
         */
        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " + (str3 == str4)); //true
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4))); //true
    }
}
