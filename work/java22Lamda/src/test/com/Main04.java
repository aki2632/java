package test.com;

public class Main04 {
    public static void main(String[] args) {
        System.out.println("hello");

        //Taxi3를 이용해서 아래 1~3번을 람다식으로 완성 및 출력하세요

        //1.변수에할당
        Taxi3 t3 = (x,y)->x+y;
        int sum = t3.open(33,44);
        System.out.println(sum);

        //2.함수호출시 인자로전달(매개변수에할당)
        testTaxi((x,y)->x+y);

        //3.함수의 리턴문에 사용가능
        t3 = test2Taxi();
        sum = t3.open(333,444);
        System.out.println(sum);
    }//end main

    public static Taxi3 test2Taxi(){
        return (x,y)-> x+y;
    }

    public static void testTaxi(Taxi3 t3){
        int sum = t3.open(33,44);
        System.out.println(sum);
    }

}//end class
