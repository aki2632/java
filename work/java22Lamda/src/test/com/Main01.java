package test.com;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person = new Person() {
            @Override
            void sleep() {
                System.out.println("Override sleep()...");
            }
        };
        person.sleep();

        Car car = new Car() {
            @Override
            public void start() {
                System.out.println("Override start()...");
            }
        };
        car.start();

        Bus bus = new Bus() {
            @Override
            public void open() {
                System.out.println("Override open()...");
            }
        };
        bus.open();
    }
}
