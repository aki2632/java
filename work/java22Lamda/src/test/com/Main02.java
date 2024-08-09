package test.com;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        //람다표현식을 사용하는 장점(일급함수)
        //1.변수에할당
        //2.함수호출시 인자로전달(매개변수에할당)
        //3.함수의 리턴문에 사용가능

        //1.인자X,리턴X
        Car car = ()->{
            System.out.println("start()...");
        };
        car.start();

        //실행문이 1개만 있으면{}블럭 생략가능
        Bus bus = ()-> System.out.println("open()...");
        ;
        bus.open();

        //2.인자O,리턴X
        Taxi taxi = (/*int */x)->{
            System.out.println("open()..."+x);
        };//매개변수 타입생략가능
        taxi.open(99);

        //3.인자X,리턴O
//        Taxi2 taxi2 = ()->{
//            System.out.println("open()...");
//            return "kim";
//        };//매개변수 타입생략가능
        Taxi2 taxi2 = ()->"kim";//리턴문만 있을때도 블럭생략 및 return예약어도 생략
        String txt = taxi2.open();
        System.out.println(txt);

        //3.인자O,리턴O
        //Taxi3 taxi3 = (x,y)->{return x+y;};
        Taxi3 taxi3 = (x,y)->x+y;//리턴문만 있을때도 블럭생략 및 return예약어도 생략
        int sum = taxi3.open(11,22);
        System.out.println(sum);

    }//end main



}//end class
