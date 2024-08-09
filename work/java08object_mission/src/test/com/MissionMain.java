package test.com;

public class MissionMain {
    public static void main(String[] args) {
        // Student 객체 배열 생성
        Student[] students = new Student[3];

        // 학생 정보 배열
        Object[][] studentData = {
                {1, "Kim", 95, 88, 92},
                {2, "Lee", 85, 78, 82},
                {3, "Park", 75, 68, 72}
        };

        // 반복문을 사용하여 Student 객체 초기화 및 배열에 할당
        for (int i = 0; i < studentData.length; i++) {
            int num = (int) studentData[i][0];
            String name = (String) studentData[i][1];
            int kor = (int) studentData[i][2];
            int eng = (int) studentData[i][3];
            int math = (int) studentData[i][4];

            students[i] = new Student(num, name, kor, eng, math);
        }

        // Student 객체 정보 출력
        for (Student student : students) {
            System.out.println("번호: " + student.getNum());
            System.out.println("이름: " + student.getName());
            System.out.println("--------------------------------");
            System.out.println("국어 점수: " + student.getKor());
            System.out.println("영어 점수: " + student.getEng());
            System.out.println("수학 점수: " + student.getMath());
            System.out.println("--------------------------------");
            System.out.println("총점: " + student.getTotalScore());
            System.out.println("평균: " + student.getAverageScore());
            System.out.println("등급: " + student.getGrade());
            System.out.printf("================================\n\n");
        }
    }
}
