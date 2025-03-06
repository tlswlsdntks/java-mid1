package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100"); //x001
        UserV1 user2 = new UserV1("id-100"); //x002
        /**
         * public boolean equals(Object obj) {
         *      return (this == obj);
         * }
         * 동등성 비교를 사용하고 싶으면 equals() 메서드를 오버라이딩해야 한다.
         */
        System.out.println("identity = " + (user1 == user2)); //false
        System.out.println("equality = " + (user1.equals(user2))); //false
    }
}
