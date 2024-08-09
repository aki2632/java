import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05_mission2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 회원 데이터를 저장할 배열 초기화
        String[][] memberData = new String[0][]; // { {이름}, {아이디}, {비밀번호}, {전화번호} }

        int memberCount = 0; // 회원 수를 추적하는 카운터
        
        // 종료전까지 회원정보를 입력받는다
        while (true) {
            // 이전과 동일하게 회원 정보를 수집합니다.
            System.out.println("아이디를 입력하세요 (종료하려면 x를 입력):");
            String id = br.readLine();

            if (id.equalsIgnoreCase("x"))
                break;

            System.out.println("비밀번호를 입력하세요:");
            String password = br.readLine();

            System.out.println("이름을 입력하세요:");
            String name = br.readLine();

            System.out.println("전화번호를 입력하세요:");
            String phonenum = br.readLine();

            // 새 회원을 위한 공간 확보
            String[][] tempData = new String[memberCount + 1][];
            System.arraycopy(memberData, 0, tempData, 0, memberCount);
            memberData = tempData;

            // 회원 데이터를 배열에 추가
            memberData[memberCount] = new String[]{id, password, name, phonenum};
            memberCount++;
        }

        // 배열을 사용하여 최종 출력 표시
        for (String[] userData : memberData) {
            System.out.printf("아이디: %s, 비밀번호: %s, 이름: %s, 전화번호: %s\n",
                    userData[0], userData[1], userData[2], userData[3]);
        }
        
        br.close();
        System.out.println("프로그램 종료....");
    }
}