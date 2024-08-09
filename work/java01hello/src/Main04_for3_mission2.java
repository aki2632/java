import java.util.Scanner;

public class Main04_for3_mission2 {
    public static void main(String[] args)  {
        System.out.println("hello");

        Scanner s = new Scanner(System.in);
        final int STUDENT_COUNT = 3;
        String[] results = new String[STUDENT_COUNT]; // 학생별 결과 저장용 배열

        for (int i = 0; i < STUDENT_COUNT; i++) {
            // 이름 입력
            System.out.println("이름을 입력하세요:");
            String name = s.nextLine();

            // 국어 점수 입력
            System.out.println("국어점수를 입력하세요:");
            int kor = s.nextInt();

            // 영어 점수 입력
            System.out.println("영어점수를 입력하세요:");
            int eng = s.nextInt();

            // 수학 점수 입력
            System.out.println("수학점수를 입력하세요:");
            int math = s.nextInt();
            s.nextLine();  // 개행 문자 소비

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
            String result = String.format("%s, 국어(%d), 영어(%d), 수학(%d), 총점(%d), 평균(%.1f), 등급(%s)%n",
                    name, kor, eng, math, total, avg, grade);
            System.out.print(result);

            // 결과 저장
            results[i] = result;

            // 학생 간 구분을 위해 빈 줄 출력
            System.out.println();
        }

        // 최종 출력
        System.out.println("모든 학생의 성적:");
        for (String result : results) {
            System.out.print(result);
        }

        s.close(); // 스캐너 사용 종료
        System.out.println("\nend main....");
    }
}