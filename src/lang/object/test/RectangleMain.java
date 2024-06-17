package lang.object.test;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(100, 20);
        Rectangle rect2 = new Rectangle(100, 20);
        System.out.println(rect1); //Rectangle(width=100, height=20)
        System.out.println(rect2); //Rectangle(width=100, height=20)
        System.out.println(rect1 == rect2); //false
        System.out.println(rect1.equals(rect2)); //true
    }
}
