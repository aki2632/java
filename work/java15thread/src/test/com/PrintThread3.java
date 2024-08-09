package test.com;

public class PrintThread3 extends Thread{
    @Override
    public void run() {
        while(true) {
            System.out.println("Running...");

            if(Thread.interrupted())
                break;
        }
    }
}
