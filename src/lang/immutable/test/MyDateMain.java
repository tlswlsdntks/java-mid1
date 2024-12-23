package lang.immutable.test;

public class MyDateMain {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2024, 1, 1); //x001
        MyDate date2 = date1; //x001

        System.out.println("date1 = " + date1); //2024-1-1
        System.out.println("date2 = " + date2); //2024-1-1

        //date1의 년도를 2025로 변경
        date1.setYear(2025);
        System.out.println("date1 = " + date1); //2025-1-1
        System.out.println("date2 = " + date2); //2025-1-1
    }
}
