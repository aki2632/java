import java.util.Scanner;

public class Main03_mission3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("====== 메뉴 선택 ======");
            System.out.println("1. 입력");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 검색");
            System.out.println("5. 프로그램 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("입력");
                    // 여기에 입력 관련 코드 작성
                    break;
                case 2:
                    System.out.println("수정");
                    // 여기에 수정 관련 코드 작성
                    break;
                case 3:
                    System.out.println("삭제");
                    // 여기에 삭제 관련 코드 작성
                    break;
                case 4:
                    System.out.println("검색");
                    // 여기에 검색 관련 코드 작성
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    exit = true;
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }

        scanner.close();
    }
}
