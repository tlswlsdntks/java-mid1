package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int count = 0;
        int index = str.indexOf(key);
        while (index >= 0) {
            count++;
            index = str.indexOf(key, index + key.length());
        }
        System.out.println("count = " + count);
    }
}
