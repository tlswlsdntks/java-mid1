package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100"); //x001
        UserV2 user2 = new UserV2("id-100"); //x002
        System.out.println("identity = " + (user1 == user2)); //false
        System.out.println("equality = " + (user1.equals(user2))); //true
    }
}
