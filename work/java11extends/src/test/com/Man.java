package test.com;

public class Man extends Person {
    String job = "Unknown";

    public Man() {
        super();
        System.out.println("Man 기본 생성자 호출");
    }

    public Man(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    @Override
    public void sleep() {
        System.out.println("Man is sleeping");
    }

    @Override
    public String toString() {
        return "Man{name='" + name + "', age=" + age + ", job='" + job + "'}";
    }
}
