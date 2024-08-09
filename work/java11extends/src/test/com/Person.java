package test.com;

public class Person {
    String name = "Unknown";
    int age = 0;

    public Person() {
        System.out.println("Person 기본 생성자 호출");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println("Person is sleeping");
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
