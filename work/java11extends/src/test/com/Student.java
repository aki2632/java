package test.com;

public class Student extends Person {
    String school = "Unknown";

    public Student() {
        super();
        System.out.println("Student 기본 생성자 호출");
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public void sleep() {
        System.out.println("Student is sleeping");
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", school='" + school + "'}";
    }
}
