package test.com;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("hello");

        //람다표현식을 사용하는 장점(일급함수)

        //1.변수에할당
        Car car = ()-> System.out.println("start()...");

        //2.함수호출시 인자로전달(매개변수에할당)
        testCar(()-> System.out.println("start()..."));


        //3.함수의 리턴문에 사용가능
        Car car2 = test2Car();
        car2.start();

    }//end main

    public static Car test2Car(){
        return ()-> System.out.println("start()...");
    }

    public static void testCar(Car car){
        car.start();
    }

}//end class
