package test.com;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.age);
        p.sleep();

        // 1. Man 이 Person 상속받아 구현(전역 변수 재초기화, 오버라이딩)
        Person man = new Man("John", 30, "Engineer");
        System.out.println(man);
        man.sleep();

        // 2. 다형성 객체생성 (Person 객체 생성-Man, 익명 내부 클래스)
        Person anonymousMan = new Person() {
            @Override
            public void sleep() {
                System.out.println("Anonymous Man is sleeping");
            }
        };
        System.out.println(anonymousMan);
        anonymousMan.sleep();

        // 3. Student 가 Person 상속받아 구현(전역 변수 재초기화, 오버라이딩)
        Person student = new Student("Alice", 20, "MIT");
        System.out.println(student);
        student.sleep();

        // 4. 다형성 객체생성 (Person 객체 생성-Student, 익명 내부 클래스)
        Person anonymousStudent = new Person() {
            @Override
            public void sleep() {
                System.out.println("Anonymous Student is sleeping");
            }
        };
        System.out.println(anonymousStudent);
        anonymousStudent.sleep();
    }
}
