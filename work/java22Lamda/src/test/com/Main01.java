package test.com;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");

        //람다식을 이해하기 위해서는 익명내부클래스를 이해해야한다.
        //Person 클래스를 만들고 익명내부클래스를 사용하여 객체생성해보세요.
        Person p = new Person(){
            @Override
            public void sleep() {
                System.out.println("sleep()....");
            }
        };
        p.sleep();

        //Bus(open()),Car(start())인터페이스를 이용하여 객체생성하기
        Bus bus = new Bus() {
            @Override
            public void open() {
                System.out.println("open()...");
            }
        };
        bus.open();

        Car car = new Car() {
            @Override
            public void start() {
                System.out.println("start()...");
            }
        };
        car.start();

        //익명내부클래스를 사용하는 장점(일급함수)
        //1.변수에할당
        //2.함수호출시 인자로전달(매개변수에할당)
        //3.함수의 리턴문에 사용가능

        testCar(new Car() {
            @Override
            public void start() {
                System.out.println("start()...");
            }
        });

        Car car2 = test2Car();
        car2.start();

        //testBus(),test2Bus()


        //testPerson(),test2Person()

    }//end main

    public static Car test2Car(){
        return new Car() {
            @Override
            public void start() {
                System.out.println("start()...");
            }
        };
    }

    public static void testCar(Car car){
        car.start();
    }

}//end class
