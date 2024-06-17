package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100"); //lang.object.equals.UserV1@2f4d3709
        UserV1 user2 = new UserV1("id-100"); //lang.object.equals.UserV1@7291c18f
        System.out.println("identity = " + (user1 == user2)); //false
        System.out.println("equality = " + (user1.equals(user2))); //false
        /**
         * public boolean equals(Object obj) {
         *      return (this == obj);
         * }
         * 동등성 비교를 사용하고 싶으면 equals() 메서드를 오버라이딩해야 한다.
         */
    }
}
