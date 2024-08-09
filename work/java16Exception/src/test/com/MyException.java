package test.com;

public class MyException extends Exception {
    int age;

    public MyException() {
        System.out.println("MyException()...");
    }

    public MyException(int age) {
        System.out.println("MyException(int age)...");
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "age=" + age +
                '}';
    }
}
