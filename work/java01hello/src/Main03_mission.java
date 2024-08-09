public class Main03_mission {
    public static void main(String[] args) {
        System.out.println("hello");

        int kor, eng, math, total;
        double avg;
        String name, grade;

        System.out.println("이름을 입력하세요.");
        name = "홍길동";

        System.out.println("국어점수를 입력하세요.");
        kor = 99;

        System.out.println("영어점수를 입력하세요.");
        eng = 88;

        System.out.println("수학점수를 입력하세요.");
        math = 77;

        total = kor + eng + math;
        avg = total / 3;

        if(avg >= 90)
            grade = "A";
        else if (avg >= 80)
            grade = "B";
        else if (avg >= 70)
            grade = "C";
        else if (avg >= 60)
            grade = "D";
        else if (avg >= 50)
            grade = "E";
        else
            grade = "F";

        System.out.print(name + ", 국어(" + kor + "), 영어(" + eng + "), 수학(" + math + "), 총점(" + total + "), 평균(" + avg +"), 등급(" + grade + ")");

    }
}
