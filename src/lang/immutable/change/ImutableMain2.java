package lang.immutable.change;

public class ImutableMain2 {
    public static void main(String[] args) {
        ImutableObj obj1 = new ImutableObj(10); //x001
        obj1.add(20); //x002
        System.out.println("obj1 = " + obj1.getValue()); //10
    }
}
