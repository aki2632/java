package test.com;

public class Main05Thread {
    public static void main(String[] args) {
        System.out.println("hello");

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("run()...");
//            }
//        }).start();

        Runnable runn = ()->System.out.println("run()...0");

        //람다식으로 변환해보세요
        new Thread(()->System.out.println("run()...1")).start();

        //test메소드를 콜해서 스레드를 동작시켜보세요
        test(()->System.out.println("run()...2"));

        new Thread(test2()).start();

        System.out.println("end main...");
    }//end main

    public static Runnable test2(){
        return ()->System.out.println("run()...3");
    }

    public static void test(Runnable r){
        new Thread(r).start();
    }

}//end class
