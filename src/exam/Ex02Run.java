package exam;

import java.util.Scanner;

public class Ex02Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex02Service2 service = new Ex02Service2();

        while (true) {
            System.out.print("성함을 입력하세요(종료 시 999) : ");
            String name = scanner.next();

            if (name.equals("999")) {
                break;
            }

            System.out.print("국어 점수를 입력하세요 : ");
            int korean = scanner.nextInt();

            System.out.print("영어 점수를 입력하세요 : ");
            int english = scanner.nextInt();

            System.out.print("수학 점수를 입력하세요 : ");
            int math = scanner.nextInt();

            service.addStudent(name, korean, english, math);
        }

        service.printGrades();
        scanner.close();
    }
}
