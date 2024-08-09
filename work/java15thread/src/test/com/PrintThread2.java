package test.com;

public class PrintThread2 extends Thread{
    @Override
    public void run() {
        try {
            while(true) {
                System.out.println("Running...");
                Thread.sleep(1);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
