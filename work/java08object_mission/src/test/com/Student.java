package test.com;

public class Student {
    private int num, kor, eng, math;
    private String name;

    public Student() {}
    public Student(int num, String name, int kor, int eng, int math) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    // 총점 계산 메서드
    public int getTotalScore() {
        return kor + eng + math;
    }

    // 평균 계산 메서드(소수점 1자리까지)
    public String getAverageScore() {
        return String.format("%.1f", getTotalScore() / 3.0);
    }

    // 등급 계산 메서드
    public String getGrade() {
        double average = Double.parseDouble(getAverageScore());
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
