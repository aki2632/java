package test.com;

public class StudentVO {
    private int num;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentVO() {
    }

    public StudentVO(int num, String name, int kor, int eng, int math) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public String toString() {
        return "StudentVO{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }
}
