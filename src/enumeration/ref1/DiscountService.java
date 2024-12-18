package enumeration.ref1;

public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        //단축키
        //Ctrl + Alt + N: Inline Variable
        int i = 1;
        System.out.println(i);
        return price * classGrade.getDiscountPercent() / 100;
    }
}
