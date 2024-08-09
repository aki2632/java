import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05_whiler5_mission {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            // 이름 입력
            System.out.println("이름을 입력하세요 (종료하려면 x를 입력):");
            String name = br.readLine();
            if (name.equalsIgnoreCase("x")) {
                break; // 'x' 입력 시 반복문 종료
            }

            // 국어 점수 입력
            System.out.println("국어점수를 입력하세요:");
            int kor = Integer.parseInt(br.readLine());

            // 영어 점수 입력
            System.out.println("영어점수를 입력하세요:");
            int eng = Integer.parseInt(br.readLine());

            // 수학 점수 입력
            System.out.println("수학점수를 입력하세요:");
            int math = Integer.parseInt(br.readLine());

            // 총점 계산
            int total = kor + eng + math;

            // 평균 계산
            double avg = total / 3.0;

            // 등급 계산
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

            // 개별 출력
            System.out.printf("%s, 국어(%d), 영어(%d), 수학(%d), 총점(%d), 평균(%.1f), 등급(%s)%n",
                    name, kor, eng, math, total, avg, grade);

            // 학생 간 구분을 위해 빈 줄 출력
            System.out.println();
        }

        br.close(); // BufferedReader 사용 종료
        System.out.println("end main....");
    }
}