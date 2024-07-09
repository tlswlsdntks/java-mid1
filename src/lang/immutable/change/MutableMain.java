package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10); //x001
        //value = 10
        //계산 이후의 기존 값(10)은 사라짐
        obj.add(20);
        //value = 30
        System.out.println("obj = " + obj.getValue());
    }
}
