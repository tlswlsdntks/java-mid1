package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String grade = scanner.nextLine();

        AuthGrade authGrade = null;
        try {
            authGrade = AuthGrade.valueOf(grade.toUpperCase()); //박싱
        } catch (IllegalArgumentException e) {
            System.out.println("존재하지 않는 등급입니다.");
            return;
        }
        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");

        System.out.println("==매뉴 목록==");
        for (String menu : authGrade.printMenus()) {
            System.out.println("- " + menu);
        }
    }
}
