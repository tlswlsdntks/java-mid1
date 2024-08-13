package lang.immutable.change;

public class ImutableMain1 {
    public static void main(String[] args) {
        ImutableObj obj1 = new ImutableObj(10); //x001
        ImutableObj obj2 = obj1.add(20); //x002

        //계산 이후에도 기존값과 신규값 모두 확인 가능
        System.out.println("obj1 = " + obj1.getValue()); //obj1 = 10
        System.out.println("obj2 = " + obj2.getValue()); //obj2 = 30
    }
}
