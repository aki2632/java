import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05_mission {

    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 학생 데이터를 저장할 빈 2D 배열 초기화
        String[][] studentData = new String[0][]; // { {이름}, {국어}, {영어}, {수학}, {총점}, {평균}, {등급} }

        int studentCount = 0; // 학생 수를 추적하는 카운터

        while (true) {
            // 이전과 동일하게 학생 정보를 수집합니다.
            System.out.println("이름을 입력하세요 (종료하려면 x를 입력):");
            String name = br.readLine();
            if (name.equalsIgnoreCase("x")) {
                break;
            }

            System.out.println("국어점수를 입력하세요:");
            int kor = Integer.parseInt(br.readLine());

            System.out.println("영어점수를 입력하세요:");
            int eng = Integer.parseInt(br.readLine());

            System.out.println("수학점수를 입력하세요:");
            int math = Integer.parseInt(br.readLine());

            // 총점 및 평균 점수 계산
            int total = kor + eng + math;
            double avg = total / 3.0;

            // 등급 결정
            String grade;
            if (avg <= 100 && avg >= 90) {
                grade = "A";
            } else if (avg >= 80) {
                grade = "B";
            } else if (avg >= 70) {
                grade = "C";
            } else {
                grade = "D";
            }

            // 새 학생을 위한 공간 확보
            String[][] tempData = new String[studentCount + 1][];
            System.arraycopy(studentData, 0, tempData, 0, studentCount);
            studentData = tempData;

            // 학생 데이터를 배열에 추가
            studentData[studentCount] = new String[]{name, String.valueOf(kor), String.valueOf(eng), String.valueOf(math), String.valueOf(total), String.valueOf(avg), grade};
            studentCount++;
        }

        // 다중 배열을 사용하여 최종 출력 표시
        for (int i = 0; i < studentCount; i++)
            for (int j = 0; j < studentData[i].length; j++)
                System.out.printf(" 이름: %6s, 국어: %3s, 영어: %3s, 수학: %3s, 총점: %4s, 평균: %5.1f, 등급: %3s \n", studentData[i][j]);

        br.close();
        System.out.println("end main....");
    }
}

